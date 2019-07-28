package typings.semanticDashUiDashAccordion.SemanticUINs.AccordionSettingsNs

import typings.semanticDashUiDashAccordion.JQuery
import typings.semanticDashUiDashAccordion.SemanticUINs.AccordionNs.ClassNameSettings
import typings.semanticDashUiDashAccordion.SemanticUINs.AccordionNs.ErrorSettings
import typings.semanticDashUiDashAccordion.SemanticUINs.AccordionNs.SelectorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * Whether child content opacity should be animated (may cause performance issues with many child elements)
    *
    * @default true
    */
  var animateChildren: Boolean
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings
  /**
    * Close open nested accordion content when an element closes
    *
    * @default true
    */
  var closeNested: Boolean
  /**
    * Allow active sections to collapse
    *
    * @default true
    */
  var collapsible: Boolean
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * Duration in ms of opening animation
    *
    * @default 500
    */
  var duration: Double
  /**
    * Easing of opening animation. EaseInOutQuint is included with accordion, for additional options you must include easing equations.
    *
    * @default 'easeInOutQuint'
    * @see {@link http://gsgd.co.uk/sandbox/jquery/easing/}
    */
  var easing: String
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  // region Behavior
  /**
    * Only allow one section open at a time
    *
    * @default true
    */
  var exclusive: Boolean
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  /**
    * whether accordion should automatically refresh on DOM insertion
    *
    * @default true
    */
  var observeChanges: Boolean
  /**
    * Event on title that will cause accordion to open
    *
    * @default 'click'
    */
  var on: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // endregion
  // region DOM Settings
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback on element open or close
    */
  def onChange(`this`: JQuery): Unit
  /**
    * Callback after element is closed
    */
  def onClose(`this`: JQuery): Unit
  /**
    * Callback before element closes
    */
  def onClosing(`this`: JQuery): Unit
  /**
    * Callback after element is open
    */
  def onOpen(`this`: JQuery): Unit
  // endregion
  // region Callbacks
  /**
    * Callback before element opens
    */
  def onOpening(`this`: JQuery): Unit
}

object _Impl {
  @scala.inline
  def apply(
    animateChildren: Boolean,
    className: ClassNameSettings,
    closeNested: Boolean,
    collapsible: Boolean,
    debug: Boolean,
    duration: Double,
    easing: String,
    error: ErrorSettings,
    exclusive: Boolean,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    on: String,
    onChange: JQuery => Unit,
    onClose: JQuery => Unit,
    onClosing: JQuery => Unit,
    onOpen: JQuery => Unit,
    onOpening: JQuery => Unit,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(animateChildren = animateChildren, className = className, closeNested = closeNested, collapsible = collapsible, debug = debug, duration = duration, easing = easing, error = error, exclusive = exclusive, name = name, namespace = namespace, observeChanges = observeChanges, on = on, onChange = js.Any.fromFunction1(onChange), onClose = js.Any.fromFunction1(onClose), onClosing = js.Any.fromFunction1(onClosing), onOpen = js.Any.fromFunction1(onOpen), onOpening = js.Any.fromFunction1(onOpening), performance = performance, selector = selector, silent = silent, verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

