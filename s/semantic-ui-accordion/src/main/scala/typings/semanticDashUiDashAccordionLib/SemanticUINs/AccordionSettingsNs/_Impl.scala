package typings
package semanticDashUiDashAccordionLib.SemanticUINs.AccordionSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * Whether child content opacity should be animated (may cause performance issues with many child elements)
    *
    * @default true
    */
  var animateChildren: scala.Boolean
  /**
    * Class names used to determine element state
    */
  var className: semanticDashUiDashAccordionLib.SemanticUINs.AccordionNs.ClassNameSettings
  /**
    * Close open nested accordion content when an element closes
    *
    * @default true
    */
  var closeNested: scala.Boolean
  /**
    * Allow active sections to collapse
    *
    * @default true
    */
  var collapsible: scala.Boolean
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  /**
    * Duration in ms of opening animation
    *
    * @default 500
    */
  var duration: scala.Double
  /**
    * Easing of opening animation. EaseInOutQuint is included with accordion, for additional options you must include easing equations.
    *
    * @default 'easeInOutQuint'
    * @see {@link http://gsgd.co.uk/sandbox/jquery/easing/}
    */
  var easing: java.lang.String
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashAccordionLib.SemanticUINs.AccordionNs.ErrorSettings
  // region Behavior
  /**
    * Only allow one section open at a time
    *
    * @default true
    */
  var exclusive: scala.Boolean
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: java.lang.String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: java.lang.String
  /**
    * whether accordion should automatically refresh on DOM insertion
    *
    * @default true
    */
  var observeChanges: scala.Boolean
  /**
    * Event on title that will cause accordion to open
    *
    * @default 'click'
    */
  var on: java.lang.String
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  // endregion
  // region DOM Settings
  /**
    * Selectors used to find parts of a module
    */
  var selector: semanticDashUiDashAccordionLib.SemanticUINs.AccordionNs.SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Callback on element open or close
    */
  def onChange(`this`: semanticDashUiDashAccordionLib.JQuery): scala.Unit
  /**
    * Callback after element is closed
    */
  def onClose(`this`: semanticDashUiDashAccordionLib.JQuery): scala.Unit
  /**
    * Callback before element closes
    */
  def onClosing(`this`: semanticDashUiDashAccordionLib.JQuery): scala.Unit
  /**
    * Callback after element is open
    */
  def onOpen(`this`: semanticDashUiDashAccordionLib.JQuery): scala.Unit
  // endregion
  // region Callbacks
  /**
    * Callback before element opens
    */
  def onOpening(`this`: semanticDashUiDashAccordionLib.JQuery): scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    animateChildren: scala.Boolean,
    className: semanticDashUiDashAccordionLib.SemanticUINs.AccordionNs.ClassNameSettings,
    closeNested: scala.Boolean,
    collapsible: scala.Boolean,
    debug: scala.Boolean,
    duration: scala.Double,
    easing: java.lang.String,
    error: semanticDashUiDashAccordionLib.SemanticUINs.AccordionNs.ErrorSettings,
    exclusive: scala.Boolean,
    name: java.lang.String,
    namespace: java.lang.String,
    observeChanges: scala.Boolean,
    on: java.lang.String,
    onChange: semanticDashUiDashAccordionLib.JQuery => scala.Unit,
    onClose: semanticDashUiDashAccordionLib.JQuery => scala.Unit,
    onClosing: semanticDashUiDashAccordionLib.JQuery => scala.Unit,
    onOpen: semanticDashUiDashAccordionLib.JQuery => scala.Unit,
    onOpening: semanticDashUiDashAccordionLib.JQuery => scala.Unit,
    performance: scala.Boolean,
    selector: semanticDashUiDashAccordionLib.SemanticUINs.AccordionNs.SelectorSettings,
    silent: scala.Boolean,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(animateChildren = animateChildren, className = className.asInstanceOf[js.Any], closeNested = closeNested, collapsible = collapsible, debug = debug, duration = duration, easing = easing, error = error, exclusive = exclusive, name = name, namespace = namespace, observeChanges = observeChanges, on = on, onChange = js.Any.fromFunction1(onChange), onClose = js.Any.fromFunction1(onClose), onClosing = js.Any.fromFunction1(onClosing), onOpen = js.Any.fromFunction1(onOpen), onOpening = js.Any.fromFunction1(onOpening), performance = performance, selector = selector.asInstanceOf[js.Any], silent = silent, verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

