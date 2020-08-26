package typings.reactSparklines.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklinesSpotsProps extends js.Object {
  var size: js.UndefOr[Double] = js.native
  var spotColors: js.UndefOr[StringDictionary[String]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SparklinesSpotsProps {
  @scala.inline
  def apply(): SparklinesSpotsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklinesSpotsProps]
  }
  @scala.inline
  implicit class SparklinesSpotsPropsOps[Self <: SparklinesSpotsProps] (val x: Self) extends AnyVal {
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpotColors(value: StringDictionary[String]): Self = this.set("spotColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotColors: Self = this.set("spotColors", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

