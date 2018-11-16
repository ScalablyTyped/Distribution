package typings
package semanticDashUiDashPopupLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup extends js.Object {
  var settings: PopupSettings = js.native
  def apply(): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * @since 2.2.11
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`bind clickaway`): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * @since 2.2.11
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`bind close on scroll`): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * @since 2.2.11
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`bind touch close`): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * Changes current popup content
           */
  def apply(
    behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`change content`,
    html: java.lang.String
  ): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * Returns current popup dom element
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`get popup`): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * Hides all visible pop ups on the page
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`hide all`): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * Returns whether popup is hidden
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`is hidden`): scala.Boolean = js.native
  /**
           * Returns whether popup is visible
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`is visible`): scala.Boolean = js.native
  /**
           * Removes popup from the page
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`remove popup`): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * Repositions a popup
           */
  def apply(
    behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`set position`,
    position: java.lang.String
  ): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * Removes popup from the page and removes all events
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.destroy): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * Returns whether popup is created and inserted into the page
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.exists): scala.Boolean = js.native
  /**
           * Hides popup
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.hide): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * Adjusts popup when content size changes (only necessary for centered popups)
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.reposition): semanticDashUiDashPopupLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.setting,
    value: PopupSettings
  ): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * Shows popup
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.show): semanticDashUiDashPopupLib.JQuery = js.native
  /**
           * Toggles visibility of popup
           */
  def apply(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.toggle): semanticDashUiDashPopupLib.JQuery = js.native
  def apply(settings: PopupSettings): semanticDashUiDashPopupLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.setting, name: K): js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.setting,
    name: K,
    value: js.Any
  ): semanticDashUiDashPopupLib.JQuery = js.native
}

