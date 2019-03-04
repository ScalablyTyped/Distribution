package typings
package semanticDashUiDashModalLib.SemanticUINs.ModalSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * If set to true will not close other visible modals when opening a new one
    *
    * @default false
    */
  var allowMultiple: scala.Boolean
  /**
    * When true, the first form input inside the modal will receive focus when shown. Set this to false to prevent this behavior.
    *
    * @default true
    */
  var autofocus: scala.Boolean
  var className: semanticDashUiDashModalLib.SemanticUINs.ModalNs.ClassNameSettings
  /**
    * Setting to false will not allow you to close the modal by clicking on the dimmer
    *
    * @default true
    */
  var closable: scala.Boolean
  /**
    * Selector or jquery object specifying the area to dim
    *
    * @default 'body'
    */
  var context: java.lang.String | semanticDashUiDashModalLib.JQuery
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  // region Modal Settings
  /**
    * If set to false will prevent the modal from being moved to inside the dimmer
    *
    * @default true
    */
  var detachable: scala.Boolean
  /**
    * You can specify custom settings to extend UI dimmer
    *
    * @see {@link http://semantic-ui.com/modules/dimmer.html}
    */
  var dimmerSettings: semanticDashUiDashDimmerLib.SemanticUINs.DimmerSettings
  /**
    * Duration of animation
    *
    * @default 400
    */
  var duration: scala.Double
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashModalLib.SemanticUINs.ModalNs.ErrorSettings
  /**
    * Whether to automatically bind keyboard shortcuts
    *
    * @default true
    */
  var keyboardShortcuts: scala.Boolean
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
    * Whether any change in modal DOM should automatically refresh cached positions
    *
    * @default false
    */
  var observeChanges: scala.Boolean
  /**
    * A vertical offset to allow for content outside of modal, for example a close button, to be centered.
    *
    * @default 0
    */
  var offset: scala.Double
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  /**
    * Whether additional animations should queue
    *
    * @default false
    */
  var queue: scala.Boolean
  // endregion
  // region DOM Settings
  var selector: semanticDashUiDashModalLib.SemanticUINs.ModalNs.SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * Named transition to use when animating menu in and out, full list can be found in ui transitions docs.
    *
    * @default 'scale'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: java.lang.String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Is called after a positive, approve or ok button is pressed. If the function returns false, the modal will not hide.
    */
  def onApprove(`this`: semanticDashUiDashModalLib.JQuery, $element: semanticDashUiDashModalLib.JQuery): semanticDashUiDashModalLib.semanticDashUiDashModalLibNumbers.`false` | scala.Unit
  /**
    * Is called after a negative, deny or cancel button is pressed. If the function returns false the modal will not hide.
    */
  def onDeny(`this`: semanticDashUiDashModalLib.JQuery, $element: semanticDashUiDashModalLib.JQuery): semanticDashUiDashModalLib.semanticDashUiDashModalLibNumbers.`false` | scala.Unit
  /**
    * Is called after a modal has finished hiding animation.
    */
  def onHidden(`this`: semanticDashUiDashModalLib.JQuery): scala.Unit
  /**
    * Is called after a modal starts to hide. If the function returns false, the modal will not hide.
    */
  def onHide(`this`: semanticDashUiDashModalLib.JQuery, $element: semanticDashUiDashModalLib.JQuery): semanticDashUiDashModalLib.semanticDashUiDashModalLibNumbers.`false` | scala.Unit
  // endregion
  // region Callbacks
  /**
    * Is called when a modal starts to show.
    */
  def onShow(`this`: semanticDashUiDashModalLib.JQuery): scala.Unit
  /**
    * Is called after a modal has finished showing animating.
    */
  def onVisible(`this`: semanticDashUiDashModalLib.JQuery): scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    allowMultiple: scala.Boolean,
    autofocus: scala.Boolean,
    className: semanticDashUiDashModalLib.SemanticUINs.ModalNs.ClassNameSettings,
    closable: scala.Boolean,
    context: java.lang.String | semanticDashUiDashModalLib.JQuery,
    debug: scala.Boolean,
    detachable: scala.Boolean,
    dimmerSettings: semanticDashUiDashDimmerLib.SemanticUINs.DimmerSettings,
    duration: scala.Double,
    error: semanticDashUiDashModalLib.SemanticUINs.ModalNs.ErrorSettings,
    keyboardShortcuts: scala.Boolean,
    name: java.lang.String,
    namespace: java.lang.String,
    observeChanges: scala.Boolean,
    offset: scala.Double,
    onApprove: js.Function2[
      semanticDashUiDashModalLib.JQuery, 
      semanticDashUiDashModalLib.JQuery, 
      semanticDashUiDashModalLib.semanticDashUiDashModalLibNumbers.`false` | scala.Unit
    ],
    onDeny: js.Function2[
      semanticDashUiDashModalLib.JQuery, 
      semanticDashUiDashModalLib.JQuery, 
      semanticDashUiDashModalLib.semanticDashUiDashModalLibNumbers.`false` | scala.Unit
    ],
    onHidden: js.Function1[semanticDashUiDashModalLib.JQuery, scala.Unit],
    onHide: js.Function2[
      semanticDashUiDashModalLib.JQuery, 
      semanticDashUiDashModalLib.JQuery, 
      semanticDashUiDashModalLib.semanticDashUiDashModalLibNumbers.`false` | scala.Unit
    ],
    onShow: js.Function1[semanticDashUiDashModalLib.JQuery, scala.Unit],
    onVisible: js.Function1[semanticDashUiDashModalLib.JQuery, scala.Unit],
    performance: scala.Boolean,
    queue: scala.Boolean,
    selector: semanticDashUiDashModalLib.SemanticUINs.ModalNs.SelectorSettings,
    silent: scala.Boolean,
    transition: java.lang.String,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(allowMultiple = allowMultiple, autofocus = autofocus, className = className.asInstanceOf[js.Any], closable = closable, context = context.asInstanceOf[js.Any], debug = debug, detachable = detachable, dimmerSettings = dimmerSettings.asInstanceOf[js.Any], duration = duration, error = error, keyboardShortcuts = keyboardShortcuts, name = name, namespace = namespace, observeChanges = observeChanges, offset = offset, onApprove = onApprove, onDeny = onDeny, onHidden = onHidden, onHide = onHide, onShow = onShow, onVisible = onVisible, performance = performance, queue = queue, selector = selector.asInstanceOf[js.Any], silent = silent, transition = transition, verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

