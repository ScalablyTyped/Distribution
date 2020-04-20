package typings.semanticUiAccordion.SemanticUI.AccordionSettings

import typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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
  def onChange(): Unit
  /**
    * Callback after element is closed
    */
  def onClose(): Unit
  /**
    * Callback before element closes
    */
  def onClosing(): Unit
  /**
    * Callback after element is open
    */
  def onOpen(): Unit
  // endregion
  // region Callbacks
  /**
    * Callback before element opens
    */
  def onOpening(): Unit
}

object Impl {
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
    onChange: () => Unit,
    onClose: () => Unit,
    onClosing: () => Unit,
    onOpen: () => Unit,
    onOpening: () => Unit,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(animateChildren = animateChildren.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closeNested = closeNested.asInstanceOf[js.Any], collapsible = collapsible.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), onClosing = js.Any.fromFunction0(onClosing), onOpen = js.Any.fromFunction0(onOpen), onOpening = js.Any.fromFunction0(onOpening), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

