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

@js.native
trait Impl extends js.Object {
  /**
    * If set to true will not close other visible modals when opening a new one
    *
    * @default false
    */
  var allowMultiple: Boolean = js.native
  /**
    * When true, the first form input inside the modal will receive focus when shown. Set this to false to prevent this behavior.
    *
    * @default true
    */
  var autofocus: Boolean = js.native
  var className: ClassNameSettings = js.native
  /**
    * Setting to false will not allow you to close the modal by clicking on the dimmer
    *
    * @default true
    */
  var closable: Boolean = js.native
  /**
    * Selector or jquery object specifying the area to dim
    *
    * @default 'body'
    */
  var context: String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  // region Modal Settings
  /**
    * If set to false will prevent the modal from being moved to inside the dimmer
    *
    * @default true
    */
  var detachable: Boolean = js.native
  /**
    * You can specify custom settings to extend UI dimmer
    *
    * @see {@link http://semantic-ui.com/modules/dimmer.html}
    */
  var dimmerSettings: DimmerSettings = js.native
  /**
    * Duration of animation
    *
    * @default 400
    */
  var duration: Double = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether to automatically bind keyboard shortcuts
    *
    * @default true
    */
  var keyboardShortcuts: Boolean = js.native
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  /**
    * Whether any change in modal DOM should automatically refresh cached positions
    *
    * @default false
    */
  var observeChanges: Boolean = js.native
  /**
    * A vertical offset to allow for content outside of modal, for example a close button, to be centered.
    *
    * @default 0
    */
  var offset: Double = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  /**
    * Whether additional animations should queue
    *
    * @default false
    */
  var queue: Boolean = js.native
  // endregion
  // region DOM Settings
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Named transition to use when animating menu in and out, full list can be found in ui transitions docs.
    *
    * @default 'scale'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Is called after a positive, approve or ok button is pressed. If the function returns false, the modal will not hide.
    */
  def onApprove($element: JQuery): `false` | Unit = js.native
  /**
    * Is called after a negative, deny or cancel button is pressed. If the function returns false the modal will not hide.
    */
  def onDeny($element: JQuery): `false` | Unit = js.native
  /**
    * Is called after a modal has finished hiding animation.
    */
  def onHidden(): Unit = js.native
  /**
    * Is called after a modal starts to hide. If the function returns false, the modal will not hide.
    */
  def onHide($element: JQuery): `false` | Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Is called when a modal starts to show.
    */
  def onShow(): Unit = js.native
  /**
    * Is called after a modal has finished showing animating.
    */
  def onVisible(): Unit = js.native
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
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetachable(value: Boolean): Self = this.set("detachable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimmerSettings(value: DimmerSettings): Self = this.set("dimmerSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardShortcuts(value: Boolean): Self = this.set("keyboardShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnApprove(value: JQuery => `false` | Unit): Self = this.set("onApprove", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDeny(value: JQuery => `false` | Unit): Self = this.set("onDeny", js.Any.fromFunction1(value))
    @scala.inline
    def setOnHidden(value: () => Unit): Self = this.set("onHidden", js.Any.fromFunction0(value))
    @scala.inline
    def setOnHide(value: JQuery => `false` | Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def setOnVisible(value: () => Unit): Self = this.set("onVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: Boolean): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

