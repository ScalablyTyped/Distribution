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

@js.native
trait Impl extends js.Object {
  // endregion
  // region DOM Settings
  var className: ClassNameSettings = js.native
  /**
    * Whether sidebar can be closed by clicking on page
    *
    * @default true
    */
  var closable: Boolean = js.native
  // region Behavior
  /**
    * Context which sidebar will appear inside
    *
    * @default 'body'
    */
  var context: String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * Default transitions for each direction and screen size, used with transition: auto
    */
  var defaultTransition: DefaultTransitionSettings = js.native
  /**
    * When sidebar is initialized without the proper HTML, using this option will defer creation of DOM to use requestAnimationFrame.
    *
    * @default false
    */
  var delaySetup: Boolean = js.native
  /**
    * Whether to dim page contents when sidebar is visible
    *
    * @default true
    */
  var dimPage: Boolean = js.native
  /**
    * Duration of sidebar animation when using legacy Javascript animation
    *
    * @default 500
    */
  var duration: Double = js.native
  /**
    * Easing to use when using legacy Javascript animation
    *
    * @default 'easeInOutQuint'
    */
  var easing: String = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether multiple sidebars can be open at once
    *
    * @default false
    */
  var exclusive: Boolean = js.native
  /**
    * Named transition to use when animating when detecting mobile device. Defaults to 'auto' which selects transition from defaultTransition based on direction.
    *
    * @default 'auto'
    */
  var mobileTransition: String = js.native
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
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  var regExp: RegExpSettings = js.native
  /**
    * Whether to return to original scroll position when sidebar is hidden, automatically occurs with transition: scale
    *
    * @default false
    */
  var returnScroll: Boolean = js.native
  /**
    * Whether to lock page scroll when sidebar is visible
    *
    * @default false
    */
  var scrollLock: Boolean = js.native
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  // endregion
  // region Animation
  /**
    * Named transition to use when animating sidebar. Defaults to 'auto' which selects transition from defaultTransition based on direction.
    *
    * @default 'auto'
    */
  var transition: String = js.native
  /**
    * Whether Javascript animations should be used. Defaults to false. Setting to auto will use legacy animations only for browsers that do not support CSS transforms
    *
    * @default false
    */
  var useLegacy: auto | Boolean = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Is called when a sidebar begins to hide or show
    */
  def onChange(): Unit = js.native
  /**
    * Is called after a sidebar has finished animating out.
    */
  def onHidden(): Unit = js.native
  /**
    * Is called before a sidebar begins to animate out.
    */
  def onHide(): Unit = js.native
  /**
    * Is called when a sidebar has finished animating in.
    */
  def onShow(): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Is called when a sidebar begins animating in.
    */
  def onVisible(): Unit = js.native
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
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultTransition(value: DefaultTransitionSettings): Self = this.set("defaultTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelaySetup(value: Boolean): Self = this.set("delaySetup", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimPage(value: Boolean): Self = this.set("dimPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobileTransition(value: String): Self = this.set("mobileTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnHidden(value: () => Unit): Self = this.set("onHidden", js.Any.fromFunction0(value))
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def setOnVisible(value: () => Unit): Self = this.set("onVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnScroll(value: Boolean): Self = this.set("returnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollLock(value: Boolean): Self = this.set("scrollLock", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseLegacy(value: auto | Boolean): Self = this.set("useLegacy", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

