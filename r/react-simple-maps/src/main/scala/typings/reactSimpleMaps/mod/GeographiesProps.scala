package typings.reactSimpleMaps.mod

import typings.geojson.mod.Feature
import typings.react.mod.SVGAttributes
import typings.std.Record
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeographiesProps extends SVGAttributes[SVGGElement] {
  @JSName("children")
  var children_GeographiesProps: js.UndefOr[js.Function1[/* data */ GeographiesChildrenArgument, Unit]] = js.native
  var geography: js.UndefOr[String | (Record[String, _]) | js.Array[String]] = js.native
  var parseGeographies: js.UndefOr[js.Function1[/* features */ js.Array[Feature[_, _]], js.Array[Feature[_, _]]]] = js.native
}

object GeographiesProps {
  @scala.inline
  def apply(): GeographiesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeographiesProps]
  }
  @scala.inline
  implicit class GeographiesPropsOps[Self <: GeographiesProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: /* data */ GeographiesChildrenArgument => Unit): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setGeographyVarargs(value: String*): Self = this.set("geography", js.Array(value :_*))
    @scala.inline
    def setGeography(value: String | (Record[String, _]) | js.Array[String]): Self = this.set("geography", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeography: Self = this.set("geography", js.undefined)
    @scala.inline
    def setParseGeographies(value: /* features */ js.Array[Feature[_, _]] => js.Array[Feature[_, _]]): Self = this.set("parseGeographies", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParseGeographies: Self = this.set("parseGeographies", js.undefined)
  }
  
}

