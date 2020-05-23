package typings.semanticUiSidebar.anon

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

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[String | JQuery] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var defaultTransition: js.UndefOr[DefaultTransitionSettings] = js.undefined
  var delaySetup: js.UndefOr[Boolean] = js.undefined
  var dimPage: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var mobileTransition: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onHidden: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onVisible: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var regExp: js.UndefOr[RegExpSettings] = js.undefined
  var returnScroll: js.UndefOr[Boolean] = js.undefined
  var scrollLock: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var useLegacy: js.UndefOr[auto | Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    className: ClassNameSettings = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    context: String | JQuery = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultTransition: DefaultTransitionSettings = null,
    delaySetup: js.UndefOr[Boolean] = js.undefined,
    dimPage: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: String = null,
    error: ErrorSettings = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    mobileTransition: String = null,
    name: String = null,
    namespace: String = null,
    onChange: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onHidden: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onHide: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onShow: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onVisible: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    regExp: RegExpSettings = null,
    returnScroll: js.UndefOr[Boolean] = js.undefined,
    scrollLock: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    transition: String = null,
    useLegacy: auto | Boolean = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (defaultTransition != null) __obj.updateDynamic("defaultTransition")(defaultTransition.asInstanceOf[js.Any])
    if (!js.isUndefined(delaySetup)) __obj.updateDynamic("delaySetup")(delaySetup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dimPage)) __obj.updateDynamic("dimPage")(dimPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    if (mobileTransition != null) __obj.updateDynamic("mobileTransition")(mobileTransition.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(onHidden.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (onVisible != null) __obj.updateDynamic("onVisible")(onVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.get.asInstanceOf[js.Any])
    if (regExp != null) __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    if (!js.isUndefined(returnScroll)) __obj.updateDynamic("returnScroll")(returnScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollLock)) __obj.updateDynamic("scrollLock")(scrollLock.get.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (useLegacy != null) __obj.updateDynamic("useLegacy")(useLegacy.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

