package typings.semanticDashUiDashPopup.SemanticUI.Popup.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'loading'
    */
  var loading: String
  /**
    * @default 'ui popup'
    */
  var popup: String
  /**
    * @since 2.2.11
    */
  var popupVisible: String
  /**
    * @default 'top left center bottom right'
    */
  var position: String
  /**
    * @default 'visible'
    */
  var visible: String
}

object _Impl {
  @scala.inline
  def apply(loading: String, popup: String, popupVisible: String, position: String, visible: String): _Impl = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], popupVisible = popupVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

