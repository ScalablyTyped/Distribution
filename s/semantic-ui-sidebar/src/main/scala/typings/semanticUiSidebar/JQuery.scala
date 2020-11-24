package typings.semanticUiSidebar

import typings.semanticUiSidebar.SemanticUI.Sidebar
import typings.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings
import typings.semanticUiSidebar.SemanticUI.SidebarSettings
import typings.semanticUiSidebar.semanticUiSidebarStrings.`add body CSS`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`attach events`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`get direction`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`get transition event`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`is hidden`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`is visible`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`pull page`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`push page`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`remove body CSS`
import typings.semanticUiSidebar.semanticUiSidebarStrings.auto
import typings.semanticUiSidebar.semanticUiSidebarStrings.className
import typings.semanticUiSidebar.semanticUiSidebarStrings.closable
import typings.semanticUiSidebar.semanticUiSidebarStrings.context
import typings.semanticUiSidebar.semanticUiSidebarStrings.debug
import typings.semanticUiSidebar.semanticUiSidebarStrings.defaultTransition
import typings.semanticUiSidebar.semanticUiSidebarStrings.delaySetup
import typings.semanticUiSidebar.semanticUiSidebarStrings.destroy
import typings.semanticUiSidebar.semanticUiSidebarStrings.dimPage
import typings.semanticUiSidebar.semanticUiSidebarStrings.duration
import typings.semanticUiSidebar.semanticUiSidebarStrings.easing
import typings.semanticUiSidebar.semanticUiSidebarStrings.error
import typings.semanticUiSidebar.semanticUiSidebarStrings.exclusive
import typings.semanticUiSidebar.semanticUiSidebarStrings.hide
import typings.semanticUiSidebar.semanticUiSidebarStrings.mobileTransition
import typings.semanticUiSidebar.semanticUiSidebarStrings.name
import typings.semanticUiSidebar.semanticUiSidebarStrings.namespace
import typings.semanticUiSidebar.semanticUiSidebarStrings.onChange
import typings.semanticUiSidebar.semanticUiSidebarStrings.onHidden
import typings.semanticUiSidebar.semanticUiSidebarStrings.onHide
import typings.semanticUiSidebar.semanticUiSidebarStrings.onShow
import typings.semanticUiSidebar.semanticUiSidebarStrings.onVisible
import typings.semanticUiSidebar.semanticUiSidebarStrings.performance
import typings.semanticUiSidebar.semanticUiSidebarStrings.regExp
import typings.semanticUiSidebar.semanticUiSidebarStrings.returnScroll
import typings.semanticUiSidebar.semanticUiSidebarStrings.scrollLock
import typings.semanticUiSidebar.semanticUiSidebarStrings.selector
import typings.semanticUiSidebar.semanticUiSidebarStrings.setting
import typings.semanticUiSidebar.semanticUiSidebarStrings.show
import typings.semanticUiSidebar.semanticUiSidebarStrings.silent
import typings.semanticUiSidebar.semanticUiSidebarStrings.toggle
import typings.semanticUiSidebar.semanticUiSidebarStrings.transition
import typings.semanticUiSidebar.semanticUiSidebarStrings.useLegacy
import typings.semanticUiSidebar.semanticUiSidebarStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def sidebar(): JQuery = js.native
  def sidebar(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def sidebar(behavior: setting, name: closable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def sidebar(behavior: setting, name: context, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def sidebar(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: defaultTransition, value: DefaultTransitionSettings): JQuery = js.native
  def sidebar(behavior: setting, name: delaySetup, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: delaySetup, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: dimPage, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: dimPage, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def sidebar(behavior: setting, name: duration, value: Double): JQuery = js.native
  def sidebar(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
  def sidebar(behavior: setting, name: easing, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def sidebar(behavior: setting, name: exclusive, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: mobileTransition, value: js.UndefOr[scala.Nothing]): String = js.native
  def sidebar(behavior: setting, name: mobileTransition, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def sidebar(behavior: setting, name: namespace, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def sidebar(behavior: setting, name: name, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sidebar(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sidebar(behavior: setting, name: onHidden, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sidebar(behavior: setting, name: onHidden, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sidebar(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sidebar(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sidebar(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sidebar(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sidebar(behavior: setting, name: onVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sidebar(behavior: setting, name: onVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sidebar(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def sidebar(behavior: setting, name: returnScroll, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: returnScroll, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: scrollLock, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: scrollLock, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def sidebar(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
  def sidebar(behavior: setting, name: transition, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: useLegacy, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
  def sidebar(behavior: setting, name: useLegacy, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: useLegacy, value: auto): JQuery = js.native
  def sidebar(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def sidebar(settings: SidebarSettings): JQuery = js.native
  @JSName("sidebar")
  def sidebar_DefaultTransitionSettings(behavior: setting, name: defaultTransition, value: js.UndefOr[scala.Nothing]): DefaultTransitionSettings = js.native
  @JSName("sidebar")
  def sidebar_ErrorSettings(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  @JSName("sidebar")
  def sidebar_JQuery(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  @JSName("sidebar")
  def sidebar_JQuery(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  @JSName("sidebar")
  var sidebar_Original: Sidebar = js.native
  @JSName("sidebar")
  def sidebar_RegExpSettings(behavior: setting, name: regExp, value: js.UndefOr[scala.Nothing]): RegExpSettings = js.native
  /**
    * Adds stylesheet to page head to trigger sidebar animations
    */
  @JSName("sidebar")
  def sidebar_addbodyCSS(behavior: `add body CSS`): JQuery = js.native
  /**
    * Attaches sidebar action to given selector. Default event if none specified is toggle
    */
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: String): JQuery = js.native
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: JQuery): JQuery = js.native
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  @JSName("sidebar")
  def sidebar_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns direction of current sidebar
    */
  @JSName("sidebar")
  def sidebar_getdirection(behavior: `get direction`): String = js.native
  /**
    * Returns vendor prefixed transition end event
    */
  @JSName("sidebar")
  def sidebar_gettransitionevent(behavior: `get transition event`): String = js.native
  /**
    * Hides sidebar
    */
  @JSName("sidebar")
  def sidebar_hide(behavior: hide): JQuery = js.native
  /**
    * Returns whether sidebar is hidden
    */
  @JSName("sidebar")
  def sidebar_ishidden(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether sidebar is visible
    */
  @JSName("sidebar")
  def sidebar_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Returns page content to original position
    */
  @JSName("sidebar")
  def sidebar_pullpage(behavior: `pull page`): JQuery = js.native
  /**
    * Pushes page content to be visible alongside sidebar
    */
  @JSName("sidebar")
  def sidebar_pushpage(behavior: `push page`): JQuery = js.native
  /**
    * Removes any inline stylesheets for sidebar animation
    */
  @JSName("sidebar")
  def sidebar_removebodyCSS(behavior: `remove body CSS`): JQuery = js.native
  @JSName("sidebar")
  def sidebar_setting(behavior: setting, value: SidebarSettings): JQuery = js.native
  /**
    * Shows sidebar
    */
  @JSName("sidebar")
  def sidebar_show(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of sidebar
    */
  @JSName("sidebar")
  def sidebar_toggle(behavior: toggle): JQuery = js.native
}
