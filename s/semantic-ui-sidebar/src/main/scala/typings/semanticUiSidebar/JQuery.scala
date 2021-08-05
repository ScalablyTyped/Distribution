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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def sidebar(): JQuery
  def sidebar(behavior: setting, name: className, value: Unit): ClassNameSettings
  def sidebar(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def sidebar(behavior: setting, name: closable, value: Boolean): JQuery
  def sidebar(behavior: setting, name: closable, value: Unit): Boolean
  def sidebar(behavior: setting, name: context, value: String): JQuery
  def sidebar(behavior: setting, name: context, value: Unit): String | JQuery
  def sidebar(behavior: setting, name: context, value: JQuery): JQuery
  def sidebar(behavior: setting, name: debug, value: Boolean): JQuery
  def sidebar(behavior: setting, name: debug, value: Unit): Boolean
  def sidebar(behavior: setting, name: defaultTransition, value: Unit): DefaultTransitionSettings
  def sidebar(behavior: setting, name: defaultTransition, value: DefaultTransitionSettings): JQuery
  def sidebar(behavior: setting, name: delaySetup, value: Boolean): JQuery
  def sidebar(behavior: setting, name: delaySetup, value: Unit): Boolean
  def sidebar(behavior: setting, name: dimPage, value: Boolean): JQuery
  def sidebar(behavior: setting, name: dimPage, value: Unit): Boolean
  def sidebar(behavior: setting, name: duration, value: Double): JQuery
  def sidebar(behavior: setting, name: duration, value: Unit): Double
  def sidebar(behavior: setting, name: easing, value: String): JQuery
  def sidebar(behavior: setting, name: easing, value: Unit): String
  def sidebar(behavior: setting, name: error, value: Unit): ErrorSettings
  def sidebar(behavior: setting, name: error, value: ErrorSettings): JQuery
  def sidebar(behavior: setting, name: exclusive, value: Boolean): JQuery
  def sidebar(behavior: setting, name: exclusive, value: Unit): Boolean
  def sidebar(behavior: setting, name: mobileTransition, value: String): JQuery
  def sidebar(behavior: setting, name: mobileTransition, value: Unit): String
  def sidebar(behavior: setting, name: namespace, value: String): JQuery
  def sidebar(behavior: setting, name: namespace, value: Unit): String
  def sidebar(behavior: setting, name: name, value: String): JQuery
  def sidebar(behavior: setting, name: name, value: Unit): String
  def sidebar(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def sidebar(behavior: setting, name: onChange, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def sidebar(behavior: setting, name: onHidden, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def sidebar(behavior: setting, name: onHidden, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def sidebar(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def sidebar(behavior: setting, name: onHide, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def sidebar(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def sidebar(behavior: setting, name: onShow, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def sidebar(behavior: setting, name: onVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def sidebar(behavior: setting, name: onVisible, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def sidebar(behavior: setting, name: performance, value: Boolean): JQuery
  def sidebar(behavior: setting, name: performance, value: Unit): Boolean
  def sidebar(behavior: setting, name: regExp, value: Unit): RegExpSettings
  def sidebar(behavior: setting, name: regExp, value: RegExpSettings): JQuery
  def sidebar(behavior: setting, name: returnScroll, value: Boolean): JQuery
  def sidebar(behavior: setting, name: returnScroll, value: Unit): Boolean
  def sidebar(behavior: setting, name: scrollLock, value: Boolean): JQuery
  def sidebar(behavior: setting, name: scrollLock, value: Unit): Boolean
  def sidebar(behavior: setting, name: selector, value: Unit): SelectorSettings
  def sidebar(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def sidebar(behavior: setting, name: silent, value: Boolean): JQuery
  def sidebar(behavior: setting, name: silent, value: Unit): Boolean
  def sidebar(behavior: setting, name: transition, value: String): JQuery
  def sidebar(behavior: setting, name: transition, value: Unit): String
  def sidebar(behavior: setting, name: useLegacy, value: Boolean): JQuery
  def sidebar(behavior: setting, name: useLegacy, value: Unit): auto | Boolean
  def sidebar(behavior: setting, name: useLegacy, value: auto): JQuery
  def sidebar(behavior: setting, name: verbose, value: Boolean): JQuery
  def sidebar(behavior: setting, name: verbose, value: Unit): Boolean
  def sidebar(settings: SidebarSettings): JQuery
  @JSName("sidebar")
  var sidebar_Original: Sidebar
  /**
    * Adds stylesheet to page head to trigger sidebar animations
    */
  @JSName("sidebar")
  def sidebar_addbodyCSS(behavior: `add body CSS`): JQuery
  /**
    * Attaches sidebar action to given selector. Default event if none specified is toggle
    */
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: String): JQuery
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: String, event: String): JQuery
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: JQuery): JQuery
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery
  @JSName("sidebar")
  def sidebar_destroy(behavior: destroy): JQuery
  /**
    * Returns direction of current sidebar
    */
  @JSName("sidebar")
  def sidebar_getdirection(behavior: `get direction`): String
  /**
    * Returns vendor prefixed transition end event
    */
  @JSName("sidebar")
  def sidebar_gettransitionevent(behavior: `get transition event`): String
  /**
    * Hides sidebar
    */
  @JSName("sidebar")
  def sidebar_hide(behavior: hide): JQuery
  /**
    * Returns whether sidebar is hidden
    */
  @JSName("sidebar")
  def sidebar_ishidden(behavior: `is hidden`): Boolean
  /**
    * Returns whether sidebar is visible
    */
  @JSName("sidebar")
  def sidebar_isvisible(behavior: `is visible`): Boolean
  /**
    * Returns page content to original position
    */
  @JSName("sidebar")
  def sidebar_pullpage(behavior: `pull page`): JQuery
  /**
    * Pushes page content to be visible alongside sidebar
    */
  @JSName("sidebar")
  def sidebar_pushpage(behavior: `push page`): JQuery
  /**
    * Removes any inline stylesheets for sidebar animation
    */
  @JSName("sidebar")
  def sidebar_removebodyCSS(behavior: `remove body CSS`): JQuery
  @JSName("sidebar")
  def sidebar_setting(behavior: setting, value: SidebarSettings): JQuery
  /**
    * Shows sidebar
    */
  @JSName("sidebar")
  def sidebar_show(behavior: show): JQuery
  /**
    * Toggles visibility of sidebar
    */
  @JSName("sidebar")
  def sidebar_toggle(behavior: toggle): JQuery
}
object JQuery {
  
  inline def apply(sidebar: Sidebar): JQuery = {
    val __obj = js.Dynamic.literal(sidebar = sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setSidebar(value: Sidebar): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
  }
}
