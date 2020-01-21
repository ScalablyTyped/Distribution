package typings.semanticUiModal.SemanticUI.ModalSettings

import typings.semanticUiDimmer.SemanticUI.DimmerSettings
import typings.semanticUiModal.JQuery
import typings.semanticUiModal.SemanticUI.Modal.ClassNameSettings
import typings.semanticUiModal.SemanticUI.Modal.ErrorSettings
import typings.semanticUiModal.SemanticUI.Modal.SelectorSettings
import typings.semanticUiModal.semanticUiModalBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * If set to true will not close other visible modals when opening a new one
    *
    * @default false
    */
  var allowMultiple: Boolean
  /**
    * When true, the first form input inside the modal will receive focus when shown. Set this to false to prevent this behavior.
    *
    * @default true
    */
  var autofocus: Boolean
  var className: ClassNameSettings
  /**
    * Setting to false will not allow you to close the modal by clicking on the dimmer
    *
    * @default true
    */
  var closable: Boolean
  /**
    * Selector or jquery object specifying the area to dim
    *
    * @default 'body'
    */
  var context: String | JQuery
  /**
    * Debug output to console
    */
  var debug: Boolean
  // region Modal Settings
  /**
    * If set to false will prevent the modal from being moved to inside the dimmer
    *
    * @default true
    */
  var detachable: Boolean
  /**
    * You can specify custom settings to extend UI dimmer
    *
    * @see {@link http://semantic-ui.com/modules/dimmer.html}
    */
  var dimmerSettings: DimmerSettings
  /**
    * Duration of animation
    *
    * @default 400
    */
  var duration: Double
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Whether to automatically bind keyboard shortcuts
    *
    * @default true
    */
  var keyboardShortcuts: Boolean
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
    * Whether any change in modal DOM should automatically refresh cached positions
    *
    * @default false
    */
  var observeChanges: Boolean
  /**
    * A vertical offset to allow for content outside of modal, for example a close button, to be centered.
    *
    * @default 0
    */
  var offset: Double
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  /**
    * Whether additional animations should queue
    *
    * @default false
    */
  var queue: Boolean
  // endregion
  // region DOM Settings
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Named transition to use when animating menu in and out, full list can be found in ui transitions docs.
    *
    * @default 'scale'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Is called after a positive, approve or ok button is pressed. If the function returns false, the modal will not hide.
    */
  def onApprove($element: JQuery): `false` | Unit
  /**
    * Is called after a negative, deny or cancel button is pressed. If the function returns false the modal will not hide.
    */
  def onDeny($element: JQuery): `false` | Unit
  /**
    * Is called after a modal has finished hiding animation.
    */
  def onHidden(): Unit
  /**
    * Is called after a modal starts to hide. If the function returns false, the modal will not hide.
    */
  def onHide($element: JQuery): `false` | Unit
  // endregion
  // region Callbacks
  /**
    * Is called when a modal starts to show.
    */
  def onShow(): Unit
  /**
    * Is called after a modal has finished showing animating.
    */
  def onVisible(): Unit
}

object Impl {
  @scala.inline
  def apply(
    allowMultiple: Boolean,
    autofocus: Boolean,
    className: ClassNameSettings,
    closable: Boolean,
    context: String | JQuery,
    debug: Boolean,
    detachable: Boolean,
    dimmerSettings: DimmerSettings,
    duration: Double,
    error: ErrorSettings,
    keyboardShortcuts: Boolean,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    offset: Double,
    onApprove: JQuery => `false` | Unit,
    onDeny: JQuery => `false` | Unit,
    onHidden: () => Unit,
    onHide: JQuery => `false` | Unit,
    onShow: () => Unit,
    onVisible: () => Unit,
    performance: Boolean,
    queue: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    transition: String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(allowMultiple = allowMultiple.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], detachable = detachable.asInstanceOf[js.Any], dimmerSettings = dimmerSettings.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onApprove = js.Any.fromFunction1(onApprove), onDeny = js.Any.fromFunction1(onDeny), onHidden = js.Any.fromFunction0(onHidden), onHide = js.Any.fromFunction1(onHide), onShow = js.Any.fromFunction0(onShow), onVisible = js.Any.fromFunction0(onVisible), performance = performance.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

