package typings.reactToastify.typesMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastOptions extends CommonOptions {
  /**
    * Add a delay in ms before the toast appear.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Called when toast is unmounted.
    */
  var onClose: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.native
  /**
    * Called when toast is mounted.
    */
  var onOpen: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.native
  /**
    * Set the percentage for the controlled progress bar. `Value must be between 0 and 1.`
    */
  var progress: js.UndefOr[Double | String] = js.native
  /**
    * An optional inline style to apply.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Set a custom `toastId`
    */
  var toastId: js.UndefOr[Id] = js.native
  /**
    * Set the toast type.
    * `One of: 'info', 'success', 'warning', 'error', 'default'`
    */
  var `type`: js.UndefOr[TypeOptions] = js.native
  /**
    * Used during update
    */
  var updateId: js.UndefOr[Id] = js.native
}

object ToastOptions {
  @scala.inline
  def apply(): ToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastOptions]
  }
  @scala.inline
  implicit class ToastOptionsOps[Self <: ToastOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setOnClose(value: /* props */ js.Object => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnOpen(value: /* props */ js.Object => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setProgress(value: Double | String): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setToastId(value: Id): Self = this.set("toastId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToastId: Self = this.set("toastId", js.undefined)
    @scala.inline
    def setType(value: TypeOptions): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdateId(value: Id): Self = this.set("updateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateId: Self = this.set("updateId", js.undefined)
  }
  
}

