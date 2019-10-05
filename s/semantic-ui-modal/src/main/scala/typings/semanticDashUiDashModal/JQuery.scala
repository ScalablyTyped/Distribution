package typings.semanticDashUiDashModal

import typings.semanticDashUiDashModal.SemanticUI.Modal
import typings.semanticDashUiDashModal.SemanticUI.ModalSettings
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.`attach events`
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.`cache sizes`
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.`can fit`
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.`hide all`
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.`hide dimmer`
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.`hide others`
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.`is active`
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.`set active`
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.`show dimmer`
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.destroy
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.hide
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.refresh
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.setting
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.show
import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("modal")
  var modal_Original: Modal = js.native
  def modal(): JQuery = js.native
  def modal(settings: ModalSettings): JQuery = js.native
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: String): JQuery = js.native
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: JQuery): JQuery = js.native
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Caches current modal size
    */
  @JSName("modal")
  def modal_cachesizes(behavior: `cache sizes`): JQuery = js.native
  /**
    * Returns whether the modal can fit on the page
    */
  @JSName("modal")
  def modal_canfit(behavior: `can fit`): Boolean = js.native
  @JSName("modal")
  def modal_destroy(behavior: destroy): JQuery = js.native
  /**
    * Hides the modal
    */
  @JSName("modal")
  def modal_hide(behavior: hide): JQuery = js.native
  /**
    * Hides all visible modals in the same dimmer
    */
  @JSName("modal")
  def modal_hideall(behavior: `hide all`): JQuery = js.native
  /**
    * Hides associated page dimmer
    */
  @JSName("modal")
  def modal_hidedimmer(behavior: `hide dimmer`): JQuery = js.native
  /**
    * Hides all modals not selected modal in a dimmer
    */
  @JSName("modal")
  def modal_hideothers(behavior: `hide others`): JQuery = js.native
  /**
    * Returns whether the modal is active
    */
  @JSName("modal")
  def modal_isactive(behavior: `is active`): Boolean = js.native
  /**
    * Refreshes centering of modal on page
    */
  @JSName("modal")
  def modal_refresh(behavior: refresh): JQuery = js.native
  /**
    * Sets modal to active
    */
  @JSName("modal")
  def modal_setactive(behavior: `set active`): JQuery = js.native
  @JSName("modal")
  def modal_setting(behavior: setting, value: ModalSettings): JQuery = js.native
  @JSName("modal")
  def modal_setting[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-modal.SemanticUI.ModalSettings._Impl[K] */ js.Any = js.native
  @JSName("modal")
  def modal_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-modal.SemanticUI.ModalSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows the modal
    */
  @JSName("modal")
  def modal_show(behavior: show): JQuery = js.native
  /**
    * Shows associated page dimmer
    */
  @JSName("modal")
  def modal_showdimmer(behavior: `show dimmer`): JQuery = js.native
  /**
    * Toggles the modal
    */
  @JSName("modal")
  def modal_toggle(behavior: toggle): JQuery = js.native
}

