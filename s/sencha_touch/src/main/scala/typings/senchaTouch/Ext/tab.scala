package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tab {
  
  trait IBar
    extends StObject
       with IToolbar {
    
    /** [Config Option] (Number/String/Ext.Component) */
    var activeTab: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Returns the value of activeTab
      * @returns Number/String/Ext.Component
      */
    var getActiveTab: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Sets the value of activeTab
      * @param activeTab Number/String/Ext.Component The new value.
      */
    var setActiveTab: js.UndefOr[js.Function1[/* activeTab */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IBar {
    
    inline def apply(): IBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBar]
    }
    
    extension [Self <: IBar](x: Self) {
      
      inline def setActiveTab(value: js.Any): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      inline def setGetActiveTab(value: () => js.Any): Self = StObject.set(x, "getActiveTab", js.Any.fromFunction0(value))
      
      inline def setGetActiveTabUndefined: Self = StObject.set(x, "getActiveTab", js.undefined)
      
      inline def setSetActiveTab(value: /* activeTab */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setActiveTab", js.Any.fromFunction1(value))
      
      inline def setSetActiveTabUndefined: Self = StObject.set(x, "setActiveTab", js.undefined)
    }
  }
  
  trait IPanel
    extends StObject
       with IContainer {
    
    /** [Method] Updates this container with the new active item
      * @param tabBar Object
      * @param newTab Object
      * @returns Boolean
      */
    var doTabChange: js.UndefOr[
        js.Function2[/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any], Boolean]
      ] = js.undefined
    
    /** [Method] Returns the value of cls
      * @returns String
      */
    @JSName("getCls")
    var getCls_IPanel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of layout
      * @returns Object
      */
    var getLayout: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of tabBar
      * @returns Object
      */
    var getTabBar: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of tabBarPosition
      * @returns String
      */
    var getTabBarPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Sets the value of cls
      * @param cls String The new value.
      */
    @JSName("setCls")
    var setCls_IPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of tabBar
      * @param tabBar Object The new value.
      */
    var setTabBar: js.UndefOr[js.Function1[/* tabBar */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of tabBarPosition
      * @param tabBarPosition String The new value.
      */
    var setTabBarPosition: js.UndefOr[js.Function1[/* tabBarPosition */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var tabBar: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var tabBarDock: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var tabBarPosition: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Updates the Ui for this component and the tabBar
      * @param newUi Object
      * @param oldUi Object
      */
    var updateUi: js.UndefOr[
        js.Function2[/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any], Unit]
      ] = js.undefined
  }
  object IPanel {
    
    inline def apply(): typings.senchaTouch.Ext.tab.IPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.tab.IPanel]
    }
    
    extension [Self <: typings.senchaTouch.Ext.tab.IPanel](x: Self) {
      
      inline def setDoTabChange(value: (/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "doTabChange", js.Any.fromFunction2(value))
      
      inline def setDoTabChangeUndefined: Self = StObject.set(x, "doTabChange", js.undefined)
      
      inline def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
      
      inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
      
      inline def setGetLayout(value: () => js.Any): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
      
      inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      inline def setGetTabBar(value: () => js.Any): Self = StObject.set(x, "getTabBar", js.Any.fromFunction0(value))
      
      inline def setGetTabBarPosition(value: () => java.lang.String): Self = StObject.set(x, "getTabBarPosition", js.Any.fromFunction0(value))
      
      inline def setGetTabBarPositionUndefined: Self = StObject.set(x, "getTabBarPosition", js.undefined)
      
      inline def setGetTabBarUndefined: Self = StObject.set(x, "getTabBar", js.undefined)
      
      inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
      
      inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      
      inline def setSetTabBar(value: /* tabBar */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTabBar", js.Any.fromFunction1(value))
      
      inline def setSetTabBarPosition(value: /* tabBarPosition */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTabBarPosition", js.Any.fromFunction1(value))
      
      inline def setSetTabBarPositionUndefined: Self = StObject.set(x, "setTabBarPosition", js.undefined)
      
      inline def setSetTabBarUndefined: Self = StObject.set(x, "setTabBar", js.undefined)
      
      inline def setTabBar(value: js.Any): Self = StObject.set(x, "tabBar", value.asInstanceOf[js.Any])
      
      inline def setTabBarDock(value: Boolean): Self = StObject.set(x, "tabBarDock", value.asInstanceOf[js.Any])
      
      inline def setTabBarDockUndefined: Self = StObject.set(x, "tabBarDock", js.undefined)
      
      inline def setTabBarPosition(value: java.lang.String): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      inline def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
      
      inline def setTabBarUndefined: Self = StObject.set(x, "tabBar", js.undefined)
      
      inline def setUpdateUi(value: (/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateUi", js.Any.fromFunction2(value))
      
      inline def setUpdateUiUndefined: Self = StObject.set(x, "updateUi", js.undefined)
    }
  }
  
  trait ITab
    extends StObject
       with IButton {
    
    /** [Config Option] (Boolean) */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var activeCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the value of active
      * @returns Boolean
      */
    var getActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of activeCls
      * @returns String
      */
    var getActiveCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of title
      * @returns String
      */
    var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Sets the value of active
      * @param active Boolean The new value.
      */
    var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of activeCls
      * @param activeCls String The new value.
      */
    var setActiveCls: js.UndefOr[js.Function1[/* activeCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of title
      * @param title String The new value.
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var title: js.UndefOr[java.lang.String] = js.undefined
  }
  object ITab {
    
    inline def apply(): typings.senchaTouch.Ext.tab.ITab = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.tab.ITab]
    }
    
    extension [Self <: typings.senchaTouch.Ext.tab.ITab](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveCls(value: java.lang.String): Self = StObject.set(x, "activeCls", value.asInstanceOf[js.Any])
      
      inline def setActiveClsUndefined: Self = StObject.set(x, "activeCls", js.undefined)
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setGetActive(value: () => Boolean): Self = StObject.set(x, "getActive", js.Any.fromFunction0(value))
      
      inline def setGetActiveCls(value: () => java.lang.String): Self = StObject.set(x, "getActiveCls", js.Any.fromFunction0(value))
      
      inline def setGetActiveClsUndefined: Self = StObject.set(x, "getActiveCls", js.undefined)
      
      inline def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
      
      inline def setGetTitle(value: () => java.lang.String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
      
      inline def setSetActive(value: /* active */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
      
      inline def setSetActiveCls(value: /* activeCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setActiveCls", js.Any.fromFunction1(value))
      
      inline def setSetActiveClsUndefined: Self = StObject.set(x, "setActiveCls", js.undefined)
      
      inline def setSetActiveUndefined: Self = StObject.set(x, "setActive", js.undefined)
      
      inline def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
