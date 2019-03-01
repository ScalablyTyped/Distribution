package typings
package semanticDashUiDashSidebarLib.SemanticUINs.SidebarSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  // endregion
  // region DOM Settings
  var className: semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.ClassNameSettings
  /**
    * Whether sidebar can be closed by clicking on page
    *
    * @default true
    */
  var closable: scala.Boolean
  // region Behavior
  /**
    * Context which sidebar will appear inside
    *
    * @default 'body'
    */
  var context: java.lang.String | semanticDashUiDashSidebarLib.JQuery
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  /**
    * Default transitions for each direction and screen size, used with transition: auto
    */
  var defaultTransition: semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.DefaultTransitionSettings
  /**
    * When sidebar is initialized without the proper HTML, using this option will defer creation of DOM to use requestAnimationFrame.
    *
    * @default false
    */
  var delaySetup: scala.Boolean
  /**
    * Whether to dim page contents when sidebar is visible
    *
    * @default true
    */
  var dimPage: scala.Boolean
  /**
    * Duration of sidebar animation when using legacy Javascript animation
    *
    * @default 500
    */
  var duration: scala.Double
  /**
    * Easing to use when using legacy Javascript animation
    *
    * @default 'easeInOutQuint'
    */
  var easing: java.lang.String
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.ErrorSettings
  /**
    * Whether multiple sidebars can be open at once
    *
    * @default false
    */
  var exclusive: scala.Boolean
  /**
    * Named transition to use when animating when detecting mobile device. Defaults to 'auto' which selects transition from defaultTransition based on direction.
    *
    * @default 'auto'
    */
  var mobileTransition: java.lang.String
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
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  var regExp: semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.RegExpSettings
  /**
    * Whether to return to original scroll position when sidebar is hidden, automatically occurs with transition: scale
    *
    * @default false
    */
  var returnScroll: scala.Boolean
  /**
    * Whether to lock page scroll when sidebar is visible
    *
    * @default false
    */
  var scrollLock: scala.Boolean
  var selector: semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  // endregion
  // region Animation
  /**
    * Named transition to use when animating sidebar. Defaults to 'auto' which selects transition from defaultTransition based on direction.
    *
    * @default 'auto'
    */
  var transition: java.lang.String
  /**
    * Whether Javascript animations should be used. Defaults to false. Setting to auto will use legacy animations only for browsers that do not support CSS transforms
    *
    * @default false
    */
  var useLegacy: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.auto | scala.Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Is called when a sidebar begins to hide or show
    */
  def onChange(`this`: semanticDashUiDashSidebarLib.JQuery): scala.Unit
  /**
    * Is called after a sidebar has finished animating out.
    */
  def onHidden(`this`: semanticDashUiDashSidebarLib.JQuery): scala.Unit
  /**
    * Is called before a sidebar begins to animate out.
    */
  def onHide(`this`: semanticDashUiDashSidebarLib.JQuery): scala.Unit
  /**
    * Is called when a sidebar has finished animating in.
    */
  def onShow(`this`: semanticDashUiDashSidebarLib.JQuery): scala.Unit
  // endregion
  // region Callbacks
  /**
    * Is called when a sidebar begins animating in.
    */
  def onVisible(`this`: semanticDashUiDashSidebarLib.JQuery): scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    className: semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.ClassNameSettings,
    closable: scala.Boolean,
    context: java.lang.String | semanticDashUiDashSidebarLib.JQuery,
    debug: scala.Boolean,
    defaultTransition: semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.DefaultTransitionSettings,
    delaySetup: scala.Boolean,
    dimPage: scala.Boolean,
    duration: scala.Double,
    easing: java.lang.String,
    error: semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.ErrorSettings,
    exclusive: scala.Boolean,
    mobileTransition: java.lang.String,
    name: java.lang.String,
    namespace: java.lang.String,
    onChange: js.Function1[semanticDashUiDashSidebarLib.JQuery, scala.Unit],
    onHidden: js.Function1[semanticDashUiDashSidebarLib.JQuery, scala.Unit],
    onHide: js.Function1[semanticDashUiDashSidebarLib.JQuery, scala.Unit],
    onShow: js.Function1[semanticDashUiDashSidebarLib.JQuery, scala.Unit],
    onVisible: js.Function1[semanticDashUiDashSidebarLib.JQuery, scala.Unit],
    performance: scala.Boolean,
    regExp: semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.RegExpSettings,
    returnScroll: scala.Boolean,
    scrollLock: scala.Boolean,
    selector: semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.SelectorSettings,
    silent: scala.Boolean,
    transition: java.lang.String,
    useLegacy: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.auto | scala.Boolean,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.updateDynamic("closable")(closable)
    __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("defaultTransition")(defaultTransition.asInstanceOf[js.Any])
    __obj.updateDynamic("delaySetup")(delaySetup)
    __obj.updateDynamic("dimPage")(dimPage)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("easing")(easing)
    __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.updateDynamic("exclusive")(exclusive)
    __obj.updateDynamic("mobileTransition")(mobileTransition)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("onHidden")(onHidden)
    __obj.updateDynamic("onHide")(onHide)
    __obj.updateDynamic("onShow")(onShow)
    __obj.updateDynamic("onVisible")(onVisible)
    __obj.updateDynamic("performance")(performance)
    __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    __obj.updateDynamic("returnScroll")(returnScroll)
    __obj.updateDynamic("scrollLock")(scrollLock)
    __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("transition")(transition)
    __obj.updateDynamic("useLegacy")(useLegacy.asInstanceOf[js.Any])
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[_Impl]
  }
}

