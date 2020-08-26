package typings.reactNativeLinearGradient.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeLinearGradient.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearGradientProps extends ViewProps {
  var angle: js.UndefOr[Double] = js.native
  var angleCenter: js.UndefOr[X] = js.native
  var colors: js.Array[String | Double] = js.native
  var end: js.UndefOr[X] = js.native
  var locations: js.UndefOr[js.Array[Double]] = js.native
  var start: js.UndefOr[X] = js.native
  var useAngle: js.UndefOr[Boolean] = js.native
}

object LinearGradientProps {
  @scala.inline
  def apply(colors: js.Array[String | Double]): LinearGradientProps = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientProps]
  }
  @scala.inline
  implicit class LinearGradientPropsOps[Self <: LinearGradientProps] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: (String | Double)*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[String | Double]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setAngleCenter(value: X): Self = this.set("angleCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngleCenter: Self = this.set("angleCenter", js.undefined)
    @scala.inline
    def setEnd(value: X): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: Double*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[Double]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setStart(value: X): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setUseAngle(value: Boolean): Self = this.set("useAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseAngle: Self = this.set("useAngle", js.undefined)
  }
  
}

