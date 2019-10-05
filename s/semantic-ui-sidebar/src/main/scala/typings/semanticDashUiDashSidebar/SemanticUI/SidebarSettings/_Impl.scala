package typings.semanticDashUiDashSidebar.SemanticUI.SidebarSettings

import typings.semanticDashUiDashSidebar.JQuery
import typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.ClassNameSettings
import typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.ErrorSettings
import typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.RegExpSettings
import typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.SelectorSettings
import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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
  def onChange(`this`: JQuery): Unit
  /**
    * Is called after a sidebar has finished animating out.
    */
  def onHidden(`this`: JQuery): Unit
  /**
    * Is called before a sidebar begins to animate out.
    */
  def onHide(`this`: JQuery): Unit
  /**
    * Is called when a sidebar has finished animating in.
    */
  def onShow(`this`: JQuery): Unit
  // endregion
  // region Callbacks
  /**
    * Is called when a sidebar begins animating in.
    */
  def onVisible(`this`: JQuery): Unit
}

object _Impl {
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
    onChange: JQuery => Unit,
    onHidden: JQuery => Unit,
    onHide: JQuery => Unit,
    onShow: JQuery => Unit,
    onVisible: JQuery => Unit,
    performance: Boolean,
    regExp: RegExpSettings,
    returnScroll: Boolean,
    scrollLock: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    transition: String,
    useLegacy: auto | Boolean,
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(className = className, closable = closable, context = context.asInstanceOf[js.Any], debug = debug, defaultTransition = defaultTransition, delaySetup = delaySetup, dimPage = dimPage, duration = duration, easing = easing, error = error, exclusive = exclusive, mobileTransition = mobileTransition, name = name, namespace = namespace, onChange = js.Any.fromFunction1(onChange), onHidden = js.Any.fromFunction1(onHidden), onHide = js.Any.fromFunction1(onHide), onShow = js.Any.fromFunction1(onShow), onVisible = js.Any.fromFunction1(onVisible), performance = performance, regExp = regExp, returnScroll = returnScroll, scrollLock = scrollLock, selector = selector, silent = silent, transition = transition, useLegacy = useLegacy.asInstanceOf[js.Any], verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

