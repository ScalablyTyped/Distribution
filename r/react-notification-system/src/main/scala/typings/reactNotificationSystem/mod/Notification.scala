package typings.reactNotificationSystem.mod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNotificationSystem.reactNotificationSystemStrings.bc
import typings.reactNotificationSystem.reactNotificationSystemStrings.bl
import typings.reactNotificationSystem.reactNotificationSystemStrings.br
import typings.reactNotificationSystem.reactNotificationSystemStrings.error
import typings.reactNotificationSystem.reactNotificationSystemStrings.info
import typings.reactNotificationSystem.reactNotificationSystemStrings.success
import typings.reactNotificationSystem.reactNotificationSystemStrings.tc
import typings.reactNotificationSystem.reactNotificationSystemStrings.tl
import typings.reactNotificationSystem.reactNotificationSystemStrings.tr
import typings.reactNotificationSystem.reactNotificationSystemStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  var action: js.UndefOr[ActionObject] = js.native
  var autoDismiss: js.UndefOr[Double] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var dismissible: js.UndefOr[Boolean] = js.native
  var level: js.UndefOr[error | warning | info | success] = js.native
  var message: js.UndefOr[String | Element] = js.native
  var onAdd: js.UndefOr[CallBackFunction] = js.native
  var onRemove: js.UndefOr[CallBackFunction] = js.native
  var position: js.UndefOr[tr | tl | tc | br | bl | bc] = js.native
  var title: js.UndefOr[String | Element] = js.native
  var uid: js.UndefOr[Double | String] = js.native
}

object Notification {
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
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
    def setAction(value: ActionObject): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAutoDismiss(value: Double): Self = this.set("autoDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDismiss: Self = this.set("autoDismiss", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    @scala.inline
    def setLevel(value: error | warning | info | success): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMessage(value: String | Element): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOnAdd(value: /* notification */ Notification => Unit): Self = this.set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setOnRemove(value: /* notification */ Notification => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setPosition(value: tr | tl | tc | br | bl | bc): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTitle(value: String | Element): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUid(value: Double | String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
  
}

