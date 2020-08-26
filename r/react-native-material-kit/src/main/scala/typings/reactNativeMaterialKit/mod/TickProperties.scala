package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TickProperties extends ViewProps {
  var fillColor: js.UndefOr[String] = js.native
  var inset: js.UndefOr[Double] = js.native
}

object TickProperties {
  @scala.inline
  def apply(): TickProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickProperties]
  }
  @scala.inline
  implicit class TickPropertiesOps[Self <: TickProperties] (val x: Self) extends AnyVal {
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
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setInset(value: Double): Self = this.set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
  }
  
}

