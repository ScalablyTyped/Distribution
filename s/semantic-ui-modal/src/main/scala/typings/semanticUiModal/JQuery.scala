package typings.semanticUiModal

import typings.semanticUiDimmer.SemanticUI.DimmerSettings
import typings.semanticUiModal.SemanticUI.Modal
import typings.semanticUiModal.SemanticUI.Modal.ClassNameSettings
import typings.semanticUiModal.SemanticUI.Modal.ErrorSettings
import typings.semanticUiModal.SemanticUI.Modal.SelectorSettings
import typings.semanticUiModal.SemanticUI.ModalSettings
import typings.semanticUiModal.semanticUiModalBooleans.`false`
import typings.semanticUiModal.semanticUiModalStrings.`attach events`
import typings.semanticUiModal.semanticUiModalStrings.`cache sizes`
import typings.semanticUiModal.semanticUiModalStrings.`can fit`
import typings.semanticUiModal.semanticUiModalStrings.`hide all`
import typings.semanticUiModal.semanticUiModalStrings.`hide dimmer`
import typings.semanticUiModal.semanticUiModalStrings.`hide others`
import typings.semanticUiModal.semanticUiModalStrings.`is active`
import typings.semanticUiModal.semanticUiModalStrings.`set active`
import typings.semanticUiModal.semanticUiModalStrings.`show dimmer`
import typings.semanticUiModal.semanticUiModalStrings.allowMultiple
import typings.semanticUiModal.semanticUiModalStrings.autofocus
import typings.semanticUiModal.semanticUiModalStrings.className
import typings.semanticUiModal.semanticUiModalStrings.closable
import typings.semanticUiModal.semanticUiModalStrings.context
import typings.semanticUiModal.semanticUiModalStrings.debug
import typings.semanticUiModal.semanticUiModalStrings.destroy
import typings.semanticUiModal.semanticUiModalStrings.detachable
import typings.semanticUiModal.semanticUiModalStrings.dimmerSettings
import typings.semanticUiModal.semanticUiModalStrings.duration
import typings.semanticUiModal.semanticUiModalStrings.error
import typings.semanticUiModal.semanticUiModalStrings.hide
import typings.semanticUiModal.semanticUiModalStrings.keyboardShortcuts
import typings.semanticUiModal.semanticUiModalStrings.name
import typings.semanticUiModal.semanticUiModalStrings.namespace
import typings.semanticUiModal.semanticUiModalStrings.observeChanges
import typings.semanticUiModal.semanticUiModalStrings.offset
import typings.semanticUiModal.semanticUiModalStrings.onApprove
import typings.semanticUiModal.semanticUiModalStrings.onDeny
import typings.semanticUiModal.semanticUiModalStrings.onHidden
import typings.semanticUiModal.semanticUiModalStrings.onHide
import typings.semanticUiModal.semanticUiModalStrings.onShow
import typings.semanticUiModal.semanticUiModalStrings.onVisible
import typings.semanticUiModal.semanticUiModalStrings.performance
import typings.semanticUiModal.semanticUiModalStrings.queue
import typings.semanticUiModal.semanticUiModalStrings.refresh
import typings.semanticUiModal.semanticUiModalStrings.selector
import typings.semanticUiModal.semanticUiModalStrings.setting
import typings.semanticUiModal.semanticUiModalStrings.show
import typings.semanticUiModal.semanticUiModalStrings.silent
import typings.semanticUiModal.semanticUiModalStrings.toggle
import typings.semanticUiModal.semanticUiModalStrings.transition
import typings.semanticUiModal.semanticUiModalStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("modal")
  var modal_Original: Modal = js.native
  def modal(): JQuery = js.native
  def modal(behavior: setting, name: allowMultiple): Boolean = js.native
  def modal(behavior: setting, name: allowMultiple, value: Boolean): JQuery = js.native
  def modal(behavior: setting, name: autofocus): Boolean = js.native
  def modal(behavior: setting, name: autofocus, value: Boolean): JQuery = js.native
  def modal(behavior: setting, name: className): ClassNameSettings = js.native
  def modal(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def modal(behavior: setting, name: closable): Boolean = js.native
  def modal(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def modal(behavior: setting, name: context): String | JQuery = js.native
  def modal(behavior: setting, name: context, value: String): JQuery = js.native
  def modal(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def modal(behavior: setting, name: debug): Boolean = js.native
  def modal(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def modal(behavior: setting, name: detachable): Boolean = js.native
  def modal(behavior: setting, name: detachable, value: Boolean): JQuery = js.native
  def modal(behavior: setting, name: dimmerSettings): DimmerSettings = js.native
  def modal(behavior: setting, name: dimmerSettings, value: DimmerSettings): JQuery = js.native
  def modal(behavior: setting, name: duration): Double = js.native
  def modal(behavior: setting, name: duration, value: Double): JQuery = js.native
  def modal(behavior: setting, name: error): ErrorSettings = js.native
  def modal(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def modal(behavior: setting, name: keyboardShortcuts): Boolean = js.native
  def modal(behavior: setting, name: keyboardShortcuts, value: Boolean): JQuery = js.native
  def modal(behavior: setting, name: name): String = js.native
  def modal(behavior: setting, name: namespace): String = js.native
  def modal(behavior: setting, name: namespace, value: String): JQuery = js.native
  def modal(behavior: setting, name: name, value: String): JQuery = js.native
  def modal(behavior: setting, name: observeChanges): Boolean = js.native
  def modal(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def modal(behavior: setting, name: offset): Double = js.native
  def modal(behavior: setting, name: offset, value: Double): JQuery = js.native
  def modal(behavior: setting, name: onApprove): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
  def modal(
    behavior: setting,
    name: onApprove,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def modal(behavior: setting, name: onDeny): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
  def modal(
    behavior: setting,
    name: onDeny,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def modal(behavior: setting, name: onHidden): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def modal(behavior: setting, name: onHidden, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def modal(behavior: setting, name: onHide): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
  def modal(
    behavior: setting,
    name: onHide,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def modal(behavior: setting, name: onShow): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def modal(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def modal(behavior: setting, name: onVisible): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def modal(behavior: setting, name: onVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def modal(behavior: setting, name: performance): Boolean = js.native
  def modal(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def modal(behavior: setting, name: queue): Boolean = js.native
  def modal(behavior: setting, name: queue, value: Boolean): JQuery = js.native
  def modal(behavior: setting, name: selector): SelectorSettings = js.native
  def modal(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def modal(behavior: setting, name: silent): Boolean = js.native
  def modal(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def modal(behavior: setting, name: transition): String = js.native
  def modal(behavior: setting, name: transition, value: String): JQuery = js.native
  def modal(behavior: setting, name: verbose): Boolean = js.native
  def modal(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
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

