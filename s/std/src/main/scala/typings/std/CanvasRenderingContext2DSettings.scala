package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasRenderingContext2DSettings extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.native
  var desynchronized: js.UndefOr[scala.Boolean] = js.native
}

object CanvasRenderingContext2DSettings {
  @scala.inline
  def apply(): CanvasRenderingContext2DSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasRenderingContext2DSettings]
  }
  @scala.inline
  implicit class CanvasRenderingContext2DSettingsOps[Self <: CanvasRenderingContext2DSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlpha(value: scala.Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setDesynchronized(value: scala.Boolean): Self = this.set("desynchronized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesynchronized: Self = this.set("desynchronized", js.undefined)
  }
  
}

