package typings
package semanticDashUiDashModalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("modal")
  var modal_Original: semanticDashUiDashModalLib.SemanticUINs.Modal = js.native
  def modal(): JQuery = js.native
  def modal(settings: semanticDashUiDashModalLib.SemanticUINs.ModalSettings): JQuery = js.native
  @JSName("modal")
  def modal_attachevents(
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`attach events`,
    selector: java.lang.String
  ): JQuery = js.native
  @JSName("modal")
  def modal_attachevents(
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`attach events`,
    selector: java.lang.String,
    event: java.lang.String
  ): JQuery = js.native
  @JSName("modal")
  def modal_attachevents(
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`attach events`,
    selector: JQuery
  ): JQuery = js.native
  @JSName("modal")
  def modal_attachevents(
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`attach events`,
    selector: JQuery,
    event: java.lang.String
  ): JQuery = js.native
  /**
    * Caches current modal size
    */
  @JSName("modal")
  def modal_cachesizes(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`cache sizes`): JQuery = js.native
  /**
    * Returns whether the modal can fit on the page
    */
  @JSName("modal")
  def modal_canfit(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`can fit`): scala.Boolean = js.native
  @JSName("modal")
  def modal_destroy(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.destroy): JQuery = js.native
  /**
    * Hides the modal
    */
  @JSName("modal")
  def modal_hide(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.hide): JQuery = js.native
  /**
    * Hides all visible modals in the same dimmer
    */
  @JSName("modal")
  def modal_hideall(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`hide all`): JQuery = js.native
  /**
    * Hides associated page dimmer
    */
  @JSName("modal")
  def modal_hidedimmer(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`hide dimmer`): JQuery = js.native
  /**
    * Hides all modals not selected modal in a dimmer
    */
  @JSName("modal")
  def modal_hideothers(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`hide others`): JQuery = js.native
  /**
    * Returns whether the modal is active
    */
  @JSName("modal")
  def modal_isactive(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`is active`): scala.Boolean = js.native
  /**
    * Refreshes centering of modal on page
    */
  @JSName("modal")
  def modal_refresh(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.refresh): JQuery = js.native
  /**
    * Sets modal to active
    */
  @JSName("modal")
  def modal_setactive(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`set active`): JQuery = js.native
  @JSName("modal")
  def modal_setting(
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.setting,
    value: semanticDashUiDashModalLib.SemanticUINs.ModalSettings
  ): JQuery = js.native
  @JSName("modal")
  def modal_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-modal.SemanticUI.ModalSettings._Impl[K] */ js.Any = js.native
  @JSName("modal")
  def modal_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-modal.SemanticUI.ModalSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows the modal
    */
  @JSName("modal")
  def modal_show(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.show): JQuery = js.native
  /**
    * Shows associated page dimmer
    */
  @JSName("modal")
  def modal_showdimmer(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`show dimmer`): JQuery = js.native
  /**
    * Toggles the modal
    */
  @JSName("modal")
  def modal_toggle(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.toggle): JQuery = js.native
}

