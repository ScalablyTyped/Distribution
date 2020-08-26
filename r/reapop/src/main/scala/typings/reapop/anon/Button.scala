package typings.reapop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button extends js.Object {
  var button: js.UndefOr[String] = js.native
  var buttonText: js.UndefOr[String] = js.native
  var buttons: js.UndefOr[js.Function0[String]] = js.native
  var closeButton: js.UndefOr[js.Function0[String]] = js.native
  var closeButtonContainer: js.UndefOr[js.Function0[String]] = js.native
  var dismissible: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  var imageContainer: js.UndefOr[String] = js.native
  var main: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var meta: js.UndefOr[String] = js.native
  var status: js.UndefOr[js.Function1[/* status */ String, String]] = js.native
  var title: js.UndefOr[String] = js.native
  var wrapper: js.UndefOr[String] = js.native
}

object Button {
  @scala.inline
  def apply(): Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    @scala.inline
    def setButtons(value: () => String): Self = this.set("buttons", js.Any.fromFunction0(value))
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCloseButton(value: () => String): Self = this.set("closeButton", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    @scala.inline
    def setCloseButtonContainer(value: () => String): Self = this.set("closeButtonContainer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCloseButtonContainer: Self = this.set("closeButtonContainer", js.undefined)
    @scala.inline
    def setDismissible(value: String): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setImageContainer(value: String): Self = this.set("imageContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageContainer: Self = this.set("imageContainer", js.undefined)
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMeta(value: String): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setStatus(value: /* status */ String => String): Self = this.set("status", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

