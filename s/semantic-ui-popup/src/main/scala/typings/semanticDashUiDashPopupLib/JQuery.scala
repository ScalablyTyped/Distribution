package typings
package semanticDashUiDashPopupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("popup")
  var popup_Original: semanticDashUiDashPopupLib.SemanticUINs.Popup = js.native
  def popup(): JQuery = js.native
  def popup(settings: semanticDashUiDashPopupLib.SemanticUINs.PopupSettings): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def `popup_bind clickaway`(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`bind clickaway`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def `popup_bind close on scroll`(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`bind close on scroll`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def `popup_bind touch close`(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`bind touch close`): JQuery = js.native
  /**
    * Changes current popup content
    */
  @JSName("popup")
  def `popup_change content`(
    behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`change content`,
    html: java.lang.String
  ): JQuery = js.native
  /**
    * Removes popup from the page and removes all events
    */
  @JSName("popup")
  def popup_destroy(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.destroy): JQuery = js.native
  /**
    * Returns whether popup is created and inserted into the page
    */
  @JSName("popup")
  def popup_exists(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.exists): scala.Boolean = js.native
  /**
    * Returns current popup dom element
    */
  @JSName("popup")
  def `popup_get popup`(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`get popup`): JQuery = js.native
  /**
    * Hides popup
    */
  @JSName("popup")
  def popup_hide(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.hide): JQuery = js.native
  /**
    * Hides all visible pop ups on the page
    */
  @JSName("popup")
  def `popup_hide all`(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`hide all`): JQuery = js.native
  /**
    * Returns whether popup is hidden
    */
  @JSName("popup")
  def `popup_is hidden`(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`is hidden`): scala.Boolean = js.native
  /**
    * Returns whether popup is visible
    */
  @JSName("popup")
  def `popup_is visible`(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`is visible`): scala.Boolean = js.native
  /**
    * Removes popup from the page
    */
  @JSName("popup")
  def `popup_remove popup`(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`remove popup`): JQuery = js.native
  /**
    * Adjusts popup when content size changes (only necessary for centered popups)
    */
  @JSName("popup")
  def popup_reposition(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.reposition): JQuery = js.native
  /**
    * Repositions a popup
    */
  @JSName("popup")
  def `popup_set position`(
    behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.`set position`,
    position: java.lang.String
  ): JQuery = js.native
  @JSName("popup")
  def popup_setting(
    behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.setting,
    value: semanticDashUiDashPopupLib.SemanticUINs.PopupSettings
  ): JQuery = js.native
  @JSName("popup")
  def popup_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-popup.SemanticUI.PopupSettings._Impl[K] */ js.Any = js.native
  @JSName("popup")
  def popup_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-popup.SemanticUI.PopupSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows popup
    */
  @JSName("popup")
  def popup_show(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.show): JQuery = js.native
  /**
    * Toggles visibility of popup
    */
  @JSName("popup")
  def popup_toggle(behavior: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.toggle): JQuery = js.native
}

