package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.JQuery
import typings.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings
import typings.semanticUiSidebar.SemanticUI.SidebarSettings.Param
import typings.semanticUiSidebar.semanticUiSidebarStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'defaultTransition'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl>> */
trait PickImpldefaultTransition
  extends StObject
     with Param {
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var closable: js.UndefOr[Boolean] = js.undefined
  
  var context: js.UndefOr[String | JQuery] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var defaultTransition: DefaultTransitionSettings
  
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
object PickImpldefaultTransition {
  
  inline def apply(defaultTransition: DefaultTransitionSettings): PickImpldefaultTransition = {
    val __obj = js.Dynamic.literal(defaultTransition = defaultTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldefaultTransition]
  }
  
  extension [Self <: PickImpldefaultTransition](x: Self) {
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
    
    inline def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDefaultTransition(value: DefaultTransitionSettings): Self = StObject.set(x, "defaultTransition", value.asInstanceOf[js.Any])
    
    inline def setDelaySetup(value: Boolean): Self = StObject.set(x, "delaySetup", value.asInstanceOf[js.Any])
    
    inline def setDelaySetupUndefined: Self = StObject.set(x, "delaySetup", js.undefined)
    
    inline def setDimPage(value: Boolean): Self = StObject.set(x, "dimPage", value.asInstanceOf[js.Any])
    
    inline def setDimPageUndefined: Self = StObject.set(x, "dimPage", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setMobileTransition(value: String): Self = StObject.set(x, "mobileTransition", value.asInstanceOf[js.Any])
    
    inline def setMobileTransitionUndefined: Self = StObject.set(x, "mobileTransition", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOnChange(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnHidden(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onHidden", value.asInstanceOf[js.Any])
    
    inline def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
    
    inline def setOnHide(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onVisible", value.asInstanceOf[js.Any])
    
    inline def setOnVisibleUndefined: Self = StObject.set(x, "onVisible", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    inline def setReturnScroll(value: Boolean): Self = StObject.set(x, "returnScroll", value.asInstanceOf[js.Any])
    
    inline def setReturnScrollUndefined: Self = StObject.set(x, "returnScroll", js.undefined)
    
    inline def setScrollLock(value: Boolean): Self = StObject.set(x, "scrollLock", value.asInstanceOf[js.Any])
    
    inline def setScrollLockUndefined: Self = StObject.set(x, "scrollLock", js.undefined)
    
    inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setUseLegacy(value: auto | Boolean): Self = StObject.set(x, "useLegacy", value.asInstanceOf[js.Any])
    
    inline def setUseLegacyUndefined: Self = StObject.set(x, "useLegacy", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
