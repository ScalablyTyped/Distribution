package typings
package semanticDashUiDashPopupLib.SemanticUINs.PopupNs.ClassNameSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'loading'
    */
  var loading: java.lang.String
  /**
    * @default 'ui popup'
    */
  var popup: java.lang.String
  /**
    * @since 2.2.11
    */
  var popupVisible: java.lang.String
  /**
    * @default 'top left center bottom right'
    */
  var position: java.lang.String
  /**
    * @default 'visible'
    */
  var visible: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    loading: java.lang.String,
    popup: java.lang.String,
    popupVisible: java.lang.String,
    position: java.lang.String,
    visible: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal(loading = loading, popup = popup, popupVisible = popupVisible, position = position, visible = visible)
  
    __obj.asInstanceOf[_Impl]
  }
}

