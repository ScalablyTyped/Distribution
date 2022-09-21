package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITabPanel
  extends StObject
     with IContainer {
  
  /** [Method] Updates this container with the new active item
    * @param tabBar Object
    * @param newTab Object
    * @returns Boolean
    */
  var doTabChange: js.UndefOr[
    js.Function2[/* tabBar */ js.UndefOr[Any], /* newTab */ js.UndefOr[Any], Boolean]
  ] = js.undefined
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ITabPanel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of tabBar
    * @returns Object
    */
  var getTabBar: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of tabBarPosition
    * @returns String
    */
  var getTabBarPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ITabPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of tabBar
    * @param tabBar Object The new value.
    */
  var setTabBar: js.UndefOr[js.Function1[/* tabBar */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of tabBarPosition
    * @param tabBarPosition String The new value.
    */
  var setTabBarPosition: js.UndefOr[js.Function1[/* tabBarPosition */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var tabBarDock: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var tabBarPosition: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Updates the Ui for this component and the tabBar
    * @param newUi Object
    * @param oldUi Object
    */
  var updateUi: js.UndefOr[js.Function2[/* newUi */ js.UndefOr[Any], /* oldUi */ js.UndefOr[Any], Unit]] = js.undefined
}
object ITabPanel {
  
  inline def apply(): ITabPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabPanel]
  }
  
  extension [Self <: ITabPanel](x: Self) {
    
    inline def setDoTabChange(value: (/* tabBar */ js.UndefOr[Any], /* newTab */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "doTabChange", js.Any.fromFunction2(value))
    
    inline def setDoTabChangeUndefined: Self = StObject.set(x, "doTabChange", js.undefined)
    
    inline def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setGetLayout(value: () => Any): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
    
    inline def setGetTabBar(value: () => Any): Self = StObject.set(x, "getTabBar", js.Any.fromFunction0(value))
    
    inline def setGetTabBarPosition(value: () => java.lang.String): Self = StObject.set(x, "getTabBarPosition", js.Any.fromFunction0(value))
    
    inline def setGetTabBarPositionUndefined: Self = StObject.set(x, "getTabBarPosition", js.undefined)
    
    inline def setGetTabBarUndefined: Self = StObject.set(x, "getTabBar", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetTabBar(value: /* tabBar */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setTabBar", js.Any.fromFunction1(value))
    
    inline def setSetTabBarPosition(value: /* tabBarPosition */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTabBarPosition", js.Any.fromFunction1(value))
    
    inline def setSetTabBarPositionUndefined: Self = StObject.set(x, "setTabBarPosition", js.undefined)
    
    inline def setSetTabBarUndefined: Self = StObject.set(x, "setTabBar", js.undefined)
    
    inline def setTabBar(value: Any): Self = StObject.set(x, "tabBar", value.asInstanceOf[js.Any])
    
    inline def setTabBarDock(value: Boolean): Self = StObject.set(x, "tabBarDock", value.asInstanceOf[js.Any])
    
    inline def setTabBarDockUndefined: Self = StObject.set(x, "tabBarDock", js.undefined)
    
    inline def setTabBarPosition(value: java.lang.String): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
    
    inline def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
    
    inline def setTabBarUndefined: Self = StObject.set(x, "tabBar", js.undefined)
    
    inline def setUpdateUi(value: (/* newUi */ js.UndefOr[Any], /* oldUi */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "updateUi", js.Any.fromFunction2(value))
    
    inline def setUpdateUiUndefined: Self = StObject.set(x, "updateUi", js.undefined)
  }
}
