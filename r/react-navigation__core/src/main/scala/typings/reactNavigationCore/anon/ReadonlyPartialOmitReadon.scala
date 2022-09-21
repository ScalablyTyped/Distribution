package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreStrings.key
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Partial<std.Omit<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string,   path :string | undefined}> & std.Readonly<{  params :std.Readonly<object | undefined> | undefined}> & {  state :std.Readonly<any> | @react-navigation/routers.@react-navigation/routers.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'stale' | 'routes'>> & {  routes :std.Array<std.Omit<@react-navigation/routers.@react-navigation/routers.Route<string, object | undefined>, 'key'> & any>}> */
trait ReadonlyPartialOmitReadon extends StObject {
  
  val history: js.UndefOr[js.Array[Any]] = js.undefined
  
  val index: js.UndefOr[Double] = js.undefined
  
  val key: js.UndefOr[String] = js.undefined
  
  val routeNames: js.UndefOr[js.Array[String]] = js.undefined
  
  val routes: js.Array[
    (Omit[
      typings.reactNavigationRouters.typesMod.Route[String, js.UndefOr[js.Object]], 
      typings.reactNavigationCore.reactNavigationCoreStrings.key
    ]) & Any
  ]
  
  val `type`: js.UndefOr[String] = js.undefined
}
object ReadonlyPartialOmitReadon {
  
  inline def apply(
    routes: js.Array[
      (Omit[typings.reactNavigationRouters.typesMod.Route[String, js.UndefOr[js.Object]], key]) & Any
    ]
  ): ReadonlyPartialOmitReadon = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPartialOmitReadon]
  }
  
  extension [Self <: ReadonlyPartialOmitReadon](x: Self) {
    
    inline def setHistory(value: js.Array[Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: Any*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    inline def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
    
    inline def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value*))
    
    inline def setRoutes(
      value: js.Array[
          (Omit[typings.reactNavigationRouters.typesMod.Route[String, js.UndefOr[js.Object]], key]) & Any
        ]
    ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(
      value: ((Omit[typings.reactNavigationRouters.typesMod.Route[String, js.UndefOr[js.Object]], key]) & Any)*
    ): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
