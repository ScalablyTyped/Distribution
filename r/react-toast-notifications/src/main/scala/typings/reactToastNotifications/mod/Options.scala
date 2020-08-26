package typings.reactToastNotifications.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var appearance: AppearanceTypes = js.native
  var autoDismiss: js.UndefOr[Boolean] = js.native
  var onDismiss: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(appearance: AppearanceTypes): Options = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAppearance(value: AppearanceTypes): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoDismiss(value: Boolean): Self = this.set("autoDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDismiss: Self = this.set("autoDismiss", js.undefined)
    @scala.inline
    def setOnDismiss(value: /* id */ String => Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
  }
  
}

