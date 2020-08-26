package typings.reactAlert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertCustomOptions extends js.Object {
  /**
    * Callback that will be executed after this alert is removed
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback that will be executed after this alert open
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Custom timeout just for this one alert
    */
  var timeout: js.UndefOr[Double] = js.native
}

object AlertCustomOptions {
  @scala.inline
  def apply(): AlertCustomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertCustomOptions]
  }
  @scala.inline
  implicit class AlertCustomOptionsOps[Self <: AlertCustomOptions] (val x: Self) extends AnyVal {
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
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

