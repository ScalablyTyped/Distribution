package typings.reactToolbox.progressBarProgressBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarTheme extends js.Object {
  /**
    * Used to style the buffer element in the linear progress.
    */
  var buffer: js.UndefOr[String] = js.native
  /**
    * Used for the circle element in the circular progress.
    */
  var circle: js.UndefOr[String] = js.native
  /**
    * Used for the root element when the type is circular.
    */
  var circular: js.UndefOr[String] = js.native
  /**
    * Added to the root element if mode is indeterminate.
    */
  var indeterminate: js.UndefOr[String] = js.native
  /**
    * Used for the root element when the type is linear.
    */
  var linear: js.UndefOr[String] = js.native
  /**
    * Added to the root if the component is multicolor (circular).
    */
  var multicolor: js.UndefOr[String] = js.native
  /**
    * Used for the inner path in the circular progress.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Used to style the value element in the linear progress.
    */
  var value: js.UndefOr[String] = js.native
}

object ProgressBarTheme {
  @scala.inline
  def apply(): ProgressBarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarTheme]
  }
  @scala.inline
  implicit class ProgressBarThemeOps[Self <: ProgressBarTheme] (val x: Self) extends AnyVal {
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
    def setBuffer(value: String): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setCircle(value: String): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    @scala.inline
    def setCircular(value: String): Self = this.set("circular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    @scala.inline
    def setIndeterminate(value: String): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    @scala.inline
    def setLinear(value: String): Self = this.set("linear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinear: Self = this.set("linear", js.undefined)
    @scala.inline
    def setMulticolor(value: String): Self = this.set("multicolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulticolor: Self = this.set("multicolor", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

