package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITabBar
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
object ITabBar {
  
  inline def apply(): ITabBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabBar]
  }
  
  extension [Self <: ITabBar](x: Self) {
    
    inline def setActiveTab(value: js.Any): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
    
    inline def setGetActiveTab(value: () => js.Any): Self = StObject.set(x, "getActiveTab", js.Any.fromFunction0(value))
    
    inline def setGetActiveTabUndefined: Self = StObject.set(x, "getActiveTab", js.undefined)
    
    inline def setSetActiveTab(value: /* activeTab */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setActiveTab", js.Any.fromFunction1(value))
    
    inline def setSetActiveTabUndefined: Self = StObject.set(x, "setActiveTab", js.undefined)
  }
}
