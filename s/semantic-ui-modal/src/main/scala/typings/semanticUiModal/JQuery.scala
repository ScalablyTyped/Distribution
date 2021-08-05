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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def modal(): JQuery
  def modal(behavior: setting, name: allowMultiple, value: Boolean): JQuery
  def modal(behavior: setting, name: allowMultiple, value: Unit): Boolean
  def modal(behavior: setting, name: autofocus, value: Boolean): JQuery
  def modal(behavior: setting, name: autofocus, value: Unit): Boolean
  def modal(behavior: setting, name: className, value: Unit): ClassNameSettings
  def modal(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def modal(behavior: setting, name: closable, value: Boolean): JQuery
  def modal(behavior: setting, name: closable, value: Unit): Boolean
  def modal(behavior: setting, name: context, value: String): JQuery
  def modal(behavior: setting, name: context, value: Unit): String | JQuery
  def modal(behavior: setting, name: context, value: JQuery): JQuery
  def modal(behavior: setting, name: debug, value: Boolean): JQuery
  def modal(behavior: setting, name: debug, value: Unit): Boolean
  def modal(behavior: setting, name: detachable, value: Boolean): JQuery
  def modal(behavior: setting, name: detachable, value: Unit): Boolean
  def modal(behavior: setting, name: dimmerSettings, value: Unit): DimmerSettings
  def modal(behavior: setting, name: dimmerSettings, value: DimmerSettings): JQuery
  def modal(behavior: setting, name: duration, value: Double): JQuery
  def modal(behavior: setting, name: duration, value: Unit): Double
  def modal(behavior: setting, name: error, value: Unit): ErrorSettings
  def modal(behavior: setting, name: error, value: ErrorSettings): JQuery
  def modal(behavior: setting, name: keyboardShortcuts, value: Boolean): JQuery
  def modal(behavior: setting, name: keyboardShortcuts, value: Unit): Boolean
  def modal(behavior: setting, name: namespace, value: String): JQuery
  def modal(behavior: setting, name: namespace, value: Unit): String
  def modal(behavior: setting, name: name, value: String): JQuery
  def modal(behavior: setting, name: name, value: Unit): String
  def modal(behavior: setting, name: observeChanges, value: Boolean): JQuery
  def modal(behavior: setting, name: observeChanges, value: Unit): Boolean
  def modal(behavior: setting, name: offset, value: Double): JQuery
  def modal(behavior: setting, name: offset, value: Unit): Double
  def modal(
    behavior: setting,
    name: onApprove,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery
  def modal(behavior: setting, name: onApprove, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  def modal(
    behavior: setting,
    name: onDeny,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery
  def modal(behavior: setting, name: onDeny, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  def modal(behavior: setting, name: onHidden, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def modal(behavior: setting, name: onHidden, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def modal(
    behavior: setting,
    name: onHide,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery
  def modal(behavior: setting, name: onHide, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  def modal(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def modal(behavior: setting, name: onShow, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def modal(behavior: setting, name: onVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def modal(behavior: setting, name: onVisible, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def modal(behavior: setting, name: performance, value: Boolean): JQuery
  def modal(behavior: setting, name: performance, value: Unit): Boolean
  def modal(behavior: setting, name: queue, value: Boolean): JQuery
  def modal(behavior: setting, name: queue, value: Unit): Boolean
  def modal(behavior: setting, name: selector, value: Unit): SelectorSettings
  def modal(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def modal(behavior: setting, name: silent, value: Boolean): JQuery
  def modal(behavior: setting, name: silent, value: Unit): Boolean
  def modal(behavior: setting, name: transition, value: String): JQuery
  def modal(behavior: setting, name: transition, value: Unit): String
  def modal(behavior: setting, name: verbose, value: Boolean): JQuery
  def modal(behavior: setting, name: verbose, value: Unit): Boolean
  def modal(settings: ModalSettings): JQuery
  @JSName("modal")
  var modal_Original: Modal
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: String): JQuery
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: String, event: String): JQuery
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: JQuery): JQuery
  @JSName("modal")
  def modal_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery
  /**
    * Caches current modal size
    */
  @JSName("modal")
  def modal_cachesizes(behavior: `cache sizes`): JQuery
  /**
    * Returns whether the modal can fit on the page
    */
  @JSName("modal")
  def modal_canfit(behavior: `can fit`): Boolean
  @JSName("modal")
  def modal_destroy(behavior: destroy): JQuery
  /**
    * Hides the modal
    */
  @JSName("modal")
  def modal_hide(behavior: hide): JQuery
  /**
    * Hides all visible modals in the same dimmer
    */
  @JSName("modal")
  def modal_hideall(behavior: `hide all`): JQuery
  /**
    * Hides associated page dimmer
    */
  @JSName("modal")
  def modal_hidedimmer(behavior: `hide dimmer`): JQuery
  /**
    * Hides all modals not selected modal in a dimmer
    */
  @JSName("modal")
  def modal_hideothers(behavior: `hide others`): JQuery
  /**
    * Returns whether the modal is active
    */
  @JSName("modal")
  def modal_isactive(behavior: `is active`): Boolean
  /**
    * Refreshes centering of modal on page
    */
  @JSName("modal")
  def modal_refresh(behavior: refresh): JQuery
  /**
    * Sets modal to active
    */
  @JSName("modal")
  def modal_setactive(behavior: `set active`): JQuery
  @JSName("modal")
  def modal_setting(behavior: setting, value: ModalSettings): JQuery
  /**
    * Shows the modal
    */
  @JSName("modal")
  def modal_show(behavior: show): JQuery
  /**
    * Shows associated page dimmer
    */
  @JSName("modal")
  def modal_showdimmer(behavior: `show dimmer`): JQuery
  /**
    * Toggles the modal
    */
  @JSName("modal")
  def modal_toggle(behavior: toggle): JQuery
}
object JQuery {
  
  inline def apply(modal: Modal): JQuery = {
    val __obj = js.Dynamic.literal(modal = modal.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setModal(value: Modal): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
  }
}
