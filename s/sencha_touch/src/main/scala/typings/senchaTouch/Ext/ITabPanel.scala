package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITabPanel extends IContainer {
  
  /** [Method] Updates this container with the new active item
    * @param tabBar Object
    * @param newTab Object
    * @returns Boolean
    */
  var doTabChange: js.UndefOr[
    js.Function2[/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any], Boolean]
  ] = js.native
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ITabPanel: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of tabBar
    * @returns Object
    */
  var getTabBar: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of tabBarPosition
    * @returns String
    */
  var getTabBarPosition: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ITabPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of tabBar
    * @param tabBar Object The new value.
    */
  var setTabBar: js.UndefOr[js.Function1[/* tabBar */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of tabBarPosition
    * @param tabBarPosition String The new value.
    */
  var setTabBarPosition: js.UndefOr[js.Function1[/* tabBarPosition */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var tabBarDock: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var tabBarPosition: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Updates the Ui for this component and the tabBar
    * @param newUi Object
    * @param oldUi Object
    */
  var updateUi: js.UndefOr[
    js.Function2[/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object ITabPanel {
  
  @scala.inline
  def apply(): ITabPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabPanel]
  }
  
  @scala.inline
  implicit class ITabPanelMutableBuilder[Self <: ITabPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoTabChange(value: (/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "doTabChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoTabChangeUndefined: Self = StObject.set(x, "doTabChange", js.undefined)
    
    @scala.inline
    def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    @scala.inline
    def setGetLayout(value: () => _): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
    
    @scala.inline
    def setGetTabBar(value: () => _): Self = StObject.set(x, "getTabBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTabBarPosition(value: () => java.lang.String): Self = StObject.set(x, "getTabBarPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTabBarPositionUndefined: Self = StObject.set(x, "getTabBarPosition", js.undefined)
    
    @scala.inline
    def setGetTabBarUndefined: Self = StObject.set(x, "getTabBar", js.undefined)
    
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    @scala.inline
    def setSetTabBar(value: /* tabBar */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTabBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTabBarPosition(value: /* tabBarPosition */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTabBarPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTabBarPositionUndefined: Self = StObject.set(x, "setTabBarPosition", js.undefined)
    
    @scala.inline
    def setSetTabBarUndefined: Self = StObject.set(x, "setTabBar", js.undefined)
    
    @scala.inline
    def setTabBar(value: js.Any): Self = StObject.set(x, "tabBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarDock(value: Boolean): Self = StObject.set(x, "tabBarDock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarDockUndefined: Self = StObject.set(x, "tabBarDock", js.undefined)
    
    @scala.inline
    def setTabBarPosition(value: java.lang.String): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
    
    @scala.inline
    def setTabBarUndefined: Self = StObject.set(x, "tabBar", js.undefined)
    
    @scala.inline
    def setUpdateUi(value: (/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateUi", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateUiUndefined: Self = StObject.set(x, "updateUi", js.undefined)
  }
}
