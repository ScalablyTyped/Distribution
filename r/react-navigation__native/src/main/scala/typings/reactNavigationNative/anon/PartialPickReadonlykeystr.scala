package typings.reactNavigationNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | @react-navigation/core.@react-navigation/core.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'key' | 'index' | 'routeNames' | 'history' | 'type'>> */
trait PartialPickReadonlykeystr extends StObject {
  
  var history: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var routeNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialPickReadonlykeystr {
  
  inline def apply(): PartialPickReadonlykeystr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickReadonlykeystr]
  }
  
  extension [Self <: PartialPickReadonlykeystr](x: Self) {
    
    inline def setHistory(value: js.Array[js.Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    inline def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
    
    inline def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
