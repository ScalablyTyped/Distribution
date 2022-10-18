package typings.steamcommunity

import typings.steamcommunity.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInventoryhistoryMod {
  
  trait InventoryHistory extends StObject {
    
    /**
      * @deprecated Use GetTradeHistory instead: https://lab.xpaw.me/steam_api_documentation.html#IEconService_GetTradeHistory_v1
      * @param options
      * @param callback
      */
    def getInventoryHistory(options: js.Object, callback: Callback): Unit
  }
  object InventoryHistory {
    
    inline def apply(getInventoryHistory: (js.Object, Callback) => Unit): InventoryHistory = {
      val __obj = js.Dynamic.literal(getInventoryHistory = js.Any.fromFunction2(getInventoryHistory))
      __obj.asInstanceOf[InventoryHistory]
    }
    
    extension [Self <: InventoryHistory](x: Self) {
      
      inline def setGetInventoryHistory(value: (js.Object, Callback) => Unit): Self = StObject.set(x, "getInventoryHistory", js.Any.fromFunction2(value))
    }
  }
}
