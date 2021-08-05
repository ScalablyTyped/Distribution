package typings.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteChildrenProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouter.reactRouterStrings.RouteChildrenProps & TopLevel[js.Any] */, S] extends StObject {
  
  var history: History[LocationState]
  
  var location: Location[S]
  
  var `match`: typings.reactRouter.mod.`match`[Params] | Null
}
object RouteChildrenProps {
  
  inline def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.RouteChildrenProps & TopLevel[js.Any] */, S](history: History[LocationState], location: Location[S]): RouteChildrenProps[Params, S] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(null)
    __obj.asInstanceOf[RouteChildrenProps[Params, S]]
  }
  
  extension [Self <: RouteChildrenProps[?, ?], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.RouteChildrenProps & TopLevel[js.Any] */, S](x: Self & (RouteChildrenProps[Params, S])) {
    
    inline def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location[S]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: `match`[Params]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchNull: Self = StObject.set(x, "match", null)
  }
}
