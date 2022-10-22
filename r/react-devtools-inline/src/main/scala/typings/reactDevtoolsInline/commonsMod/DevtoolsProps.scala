package typings.reactDevtoolsInline.commonsMod

import typings.std.Element
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevtoolsProps extends StObject {
  
  var bridge: js.UndefOr[FrontendBridge] = js.undefined
  
  var browserTheme: js.UndefOr[BrowserTheme] = js.undefined
  
  var canViewElementSourceFunction: js.UndefOr[CanViewElementSource | Null] = js.undefined
  
  var componentsPortalContainer: js.UndefOr[Element] = js.undefined
  
  var defaultTab: js.UndefOr[TabID] = js.undefined
  
  var enabledInspectedElementContextMenu: js.UndefOr[Boolean] = js.undefined
  
  var fetchFileWithCaching: js.UndefOr[FetchFileWithCaching | Null] = js.undefined
  
  var hideLogAction: js.UndefOr[Boolean] = js.undefined
  
  var hideSettings: js.UndefOr[Boolean] = js.undefined
  
  var hideToggleErrorAction: js.UndefOr[Boolean] = js.undefined
  
  var hideToggleSuspenseAction: js.UndefOr[Boolean] = js.undefined
  
  var hideViewSourceAction: js.UndefOr[Boolean] = js.undefined
  
  var hookNamesModuleLoaderFunction: js.UndefOr[HookNamesModuleLoaderFunction | Null] = js.undefined
  
  var overrideTab: js.UndefOr[TabID] = js.undefined
  
  var profilerPortalContainer: js.UndefOr[Element] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var showTabBar: js.UndefOr[Boolean] = js.undefined
  
  var store: js.UndefOr[Store] = js.undefined
  
  var viewAttributeSourceFunction: js.UndefOr[ViewAttributeSource | Null] = js.undefined
  
  var viewElementSourceFunction: js.UndefOr[ViewElementSource | Null] = js.undefined
  
  var viewUrlSourceFunction: js.UndefOr[ViewUrlSourceFunction | Null] = js.undefined
  
  var warnIfLegacyBackendDetected: js.UndefOr[Boolean] = js.undefined
  
  var warnIfUnsupportedVersionDetected: js.UndefOr[Boolean] = js.undefined
}
object DevtoolsProps {
  
  inline def apply(): DevtoolsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevtoolsProps]
  }
  
  extension [Self <: DevtoolsProps](x: Self) {
    
    inline def setBridge(value: FrontendBridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    inline def setBridgeUndefined: Self = StObject.set(x, "bridge", js.undefined)
    
    inline def setBrowserTheme(value: BrowserTheme): Self = StObject.set(x, "browserTheme", value.asInstanceOf[js.Any])
    
    inline def setBrowserThemeUndefined: Self = StObject.set(x, "browserTheme", js.undefined)
    
    inline def setCanViewElementSourceFunction(value: /* inspectedElement */ InspectedElement => Boolean): Self = StObject.set(x, "canViewElementSourceFunction", js.Any.fromFunction1(value))
    
    inline def setCanViewElementSourceFunctionNull: Self = StObject.set(x, "canViewElementSourceFunction", null)
    
    inline def setCanViewElementSourceFunctionUndefined: Self = StObject.set(x, "canViewElementSourceFunction", js.undefined)
    
    inline def setComponentsPortalContainer(value: Element): Self = StObject.set(x, "componentsPortalContainer", value.asInstanceOf[js.Any])
    
    inline def setComponentsPortalContainerUndefined: Self = StObject.set(x, "componentsPortalContainer", js.undefined)
    
    inline def setDefaultTab(value: TabID): Self = StObject.set(x, "defaultTab", value.asInstanceOf[js.Any])
    
    inline def setDefaultTabUndefined: Self = StObject.set(x, "defaultTab", js.undefined)
    
    inline def setEnabledInspectedElementContextMenu(value: Boolean): Self = StObject.set(x, "enabledInspectedElementContextMenu", value.asInstanceOf[js.Any])
    
    inline def setEnabledInspectedElementContextMenuUndefined: Self = StObject.set(x, "enabledInspectedElementContextMenu", js.undefined)
    
    inline def setFetchFileWithCaching(value: /* url */ String => js.Promise[String]): Self = StObject.set(x, "fetchFileWithCaching", js.Any.fromFunction1(value))
    
    inline def setFetchFileWithCachingNull: Self = StObject.set(x, "fetchFileWithCaching", null)
    
    inline def setFetchFileWithCachingUndefined: Self = StObject.set(x, "fetchFileWithCaching", js.undefined)
    
    inline def setHideLogAction(value: Boolean): Self = StObject.set(x, "hideLogAction", value.asInstanceOf[js.Any])
    
    inline def setHideLogActionUndefined: Self = StObject.set(x, "hideLogAction", js.undefined)
    
    inline def setHideSettings(value: Boolean): Self = StObject.set(x, "hideSettings", value.asInstanceOf[js.Any])
    
    inline def setHideSettingsUndefined: Self = StObject.set(x, "hideSettings", js.undefined)
    
    inline def setHideToggleErrorAction(value: Boolean): Self = StObject.set(x, "hideToggleErrorAction", value.asInstanceOf[js.Any])
    
    inline def setHideToggleErrorActionUndefined: Self = StObject.set(x, "hideToggleErrorAction", js.undefined)
    
    inline def setHideToggleSuspenseAction(value: Boolean): Self = StObject.set(x, "hideToggleSuspenseAction", value.asInstanceOf[js.Any])
    
    inline def setHideToggleSuspenseActionUndefined: Self = StObject.set(x, "hideToggleSuspenseAction", js.undefined)
    
    inline def setHideViewSourceAction(value: Boolean): Self = StObject.set(x, "hideViewSourceAction", value.asInstanceOf[js.Any])
    
    inline def setHideViewSourceActionUndefined: Self = StObject.set(x, "hideViewSourceAction", js.undefined)
    
    inline def setHookNamesModuleLoaderFunction(value: () => PromiseLike[ParseHookNamesModule]): Self = StObject.set(x, "hookNamesModuleLoaderFunction", js.Any.fromFunction0(value))
    
    inline def setHookNamesModuleLoaderFunctionNull: Self = StObject.set(x, "hookNamesModuleLoaderFunction", null)
    
    inline def setHookNamesModuleLoaderFunctionUndefined: Self = StObject.set(x, "hookNamesModuleLoaderFunction", js.undefined)
    
    inline def setOverrideTab(value: TabID): Self = StObject.set(x, "overrideTab", value.asInstanceOf[js.Any])
    
    inline def setOverrideTabUndefined: Self = StObject.set(x, "overrideTab", js.undefined)
    
    inline def setProfilerPortalContainer(value: Element): Self = StObject.set(x, "profilerPortalContainer", value.asInstanceOf[js.Any])
    
    inline def setProfilerPortalContainerUndefined: Self = StObject.set(x, "profilerPortalContainer", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setShowTabBar(value: Boolean): Self = StObject.set(x, "showTabBar", value.asInstanceOf[js.Any])
    
    inline def setShowTabBarUndefined: Self = StObject.set(x, "showTabBar", js.undefined)
    
    inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setViewAttributeSourceFunction(value: (/* id */ Double, /* path */ js.Array[String | Double]) => Unit): Self = StObject.set(x, "viewAttributeSourceFunction", js.Any.fromFunction2(value))
    
    inline def setViewAttributeSourceFunctionNull: Self = StObject.set(x, "viewAttributeSourceFunction", null)
    
    inline def setViewAttributeSourceFunctionUndefined: Self = StObject.set(x, "viewAttributeSourceFunction", js.undefined)
    
    inline def setViewElementSourceFunction(value: (/* id */ Double, /* inspectedElement */ InspectedElement) => Unit): Self = StObject.set(x, "viewElementSourceFunction", js.Any.fromFunction2(value))
    
    inline def setViewElementSourceFunctionNull: Self = StObject.set(x, "viewElementSourceFunction", null)
    
    inline def setViewElementSourceFunctionUndefined: Self = StObject.set(x, "viewElementSourceFunction", js.undefined)
    
    inline def setViewUrlSourceFunction(value: (/* url */ String, /* line */ Double, /* col */ Double) => Unit): Self = StObject.set(x, "viewUrlSourceFunction", js.Any.fromFunction3(value))
    
    inline def setViewUrlSourceFunctionNull: Self = StObject.set(x, "viewUrlSourceFunction", null)
    
    inline def setViewUrlSourceFunctionUndefined: Self = StObject.set(x, "viewUrlSourceFunction", js.undefined)
    
    inline def setWarnIfLegacyBackendDetected(value: Boolean): Self = StObject.set(x, "warnIfLegacyBackendDetected", value.asInstanceOf[js.Any])
    
    inline def setWarnIfLegacyBackendDetectedUndefined: Self = StObject.set(x, "warnIfLegacyBackendDetected", js.undefined)
    
    inline def setWarnIfUnsupportedVersionDetected(value: Boolean): Self = StObject.set(x, "warnIfUnsupportedVersionDetected", value.asInstanceOf[js.Any])
    
    inline def setWarnIfUnsupportedVersionDetectedUndefined: Self = StObject.set(x, "warnIfUnsupportedVersionDetected", js.undefined)
  }
}
