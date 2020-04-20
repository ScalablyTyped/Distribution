package typings.semanticUiSidebar.SemanticUI.SidebarSettings

import typings.semanticUiSidebar.JQuery
import typings.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings
import typings.semanticUiSidebar.semanticUiSidebarStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  // endregion
  // region DOM Settings
  var className: ClassNameSettings
  /**
    * Whether sidebar can be closed by clicking on page
    *
    * @default true
    */
  var closable: Boolean
  // region Behavior
  /**
    * Context which sidebar will appear inside
    *
    * @default 'body'
    */
  var context: String | JQuery
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * Default transitions for each direction and screen size, used with transition: auto
    */
  var defaultTransition: DefaultTransitionSettings
  /**
    * When sidebar is initialized without the proper HTML, using this option will defer creation of DOM to use requestAnimationFrame.
    *
    * @default false
    */
  var delaySetup: Boolean
  /**
    * Whether to dim page contents when sidebar is visible
    *
    * @default true
    */
  var dimPage: Boolean
  /**
    * Duration of sidebar animation when using legacy Javascript animation
    *
    * @default 500
    */
  var duration: Double
  /**
    * Easing to use when using legacy Javascript animation
    *
    * @default 'easeInOutQuint'
    */
  var easing: String
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Whether multiple sidebars can be open at once
    *
    * @default false
    */
  var exclusive: Boolean
  /**
    * Named transition to use when animating when detecting mobile device. Defaults to 'auto' which selects transition from defaultTransition based on direction.
    *
    * @default 'auto'
    */
  var mobileTransition: String
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
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  var regExp: RegExpSettings
  /**
    * Whether to return to original scroll position when sidebar is hidden, automatically occurs with transition: scale
    *
    * @default false
    */
  var returnScroll: Boolean
  /**
    * Whether to lock page scroll when sidebar is visible
    *
    * @default false
    */
  var scrollLock: Boolean
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  // endregion
  // region Animation
  /**
    * Named transition to use when animating sidebar. Defaults to 'auto' which selects transition from defaultTransition based on direction.
    *
    * @default 'auto'
    */
  var transition: String
  /**
    * Whether Javascript animations should be used. Defaults to false. Setting to auto will use legacy animations only for browsers that do not support CSS transforms
    *
    * @default false
    */
  var useLegacy: auto | Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Is called when a sidebar begins to hide or show
    */
  def onChange(): Unit
  /**
    * Is called after a sidebar has finished animating out.
    */
  def onHidden(): Unit
  /**
    * Is called before a sidebar begins to animate out.
    */
  def onHide(): Unit
  /**
    * Is called when a sidebar has finished animating in.
    */
  def onShow(): Unit
  // endregion
  // region Callbacks
  /**
    * Is called when a sidebar begins animating in.
    */
  def onVisible(): Unit
}

object Impl {
  @scala.inline
  def apply(
    className: ClassNameSettings,
    closable: Boolean,
    context: String | JQuery,
    debug: Boolean,
    defaultTransition: DefaultTransitionSettings,
    delaySetup: Boolean,
    dimPage: Boolean,
    duration: Double,
    easing: String,
    error: ErrorSettings,
    exclusive: Boolean,
    mobileTransition: String,
    name: String,
    namespace: String,
    onChange: () => Unit,
    onHidden: () => Unit,
    onHide: () => Unit,
    onShow: () => Unit,
    onVisible: () => Unit,
    performance: Boolean,
    regExp: RegExpSettings,
    returnScroll: Boolean,
    scrollLock: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    transition: String,
    useLegacy: auto | Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultTransition = defaultTransition.asInstanceOf[js.Any], delaySetup = delaySetup.asInstanceOf[js.Any], dimPage = dimPage.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], mobileTransition = mobileTransition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onHidden = js.Any.fromFunction0(onHidden), onHide = js.Any.fromFunction0(onHide), onShow = js.Any.fromFunction0(onShow), onVisible = js.Any.fromFunction0(onVisible), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], returnScroll = returnScroll.asInstanceOf[js.Any], scrollLock = scrollLock.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useLegacy = useLegacy.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

