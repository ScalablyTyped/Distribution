package typings.reactSimpleMaps.mod

import typings.geojson.mod.Feature
import typings.react.mod.SVGAttributes
import typings.std.Record
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographiesProps extends SVGAttributes[SVGGElement] {
  @JSName("children")
  var children_GeographiesProps: js.UndefOr[js.Function1[/* data */ GeographiesChildrenArgument, Unit]] = js.undefined
  var geography: js.UndefOr[String | (Record[String, _]) | js.Array[String]] = js.undefined
  var parseGeographies: js.UndefOr[js.Function1[/* features */ js.Array[Feature[_, _]], js.Array[Feature[_, _]]]] = js.undefined
}

object GeographiesProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[SVGGElement] = null,
    children: /* data */ GeographiesChildrenArgument => Unit = null,
    geography: String | (Record[String, _]) | js.Array[String] = null,
    parseGeographies: /* features */ js.Array[Feature[_, _]] => js.Array[Feature[_, _]] = null
  ): GeographiesProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (geography != null) __obj.updateDynamic("geography")(geography.asInstanceOf[js.Any])
    if (parseGeographies != null) __obj.updateDynamic("parseGeographies")(js.Any.fromFunction1(parseGeographies))
    __obj.asInstanceOf[GeographiesProps]
  }
}

