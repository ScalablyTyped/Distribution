package typings.semanticUiPopup.SemanticUI.Popup.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'loading'
    */
  var loading: String = js.native
  /**
    * @default 'ui popup'
    */
  var popup: String = js.native
  /**
    * @since 2.2.11
    */
  var popupVisible: String = js.native
  /**
    * @default 'top left center bottom right'
    */
  var position: String = js.native
  /**
    * @default 'visible'
    */
  var visible: String = js.native
}

object Impl {
  @scala.inline
  def apply(loading: String, popup: String, popupVisible: String, position: String, visible: String): Impl = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], popupVisible = popupVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopup(value: String): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopupVisible(value: String): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

