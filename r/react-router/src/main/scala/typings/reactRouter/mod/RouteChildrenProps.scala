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
  
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.RouteChildrenProps & TopLevel[js.Any] */, S](history: History[LocationState], location: Location[S]): RouteChildrenProps[Params, S] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(null)
    __obj.asInstanceOf[RouteChildrenProps[Params, S]]
  }
  
  @scala.inline
  implicit class RouteChildrenPropsMutableBuilder[Self <: RouteChildrenProps[?, ?], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.RouteChildrenProps & TopLevel[js.Any] */, S] (val x: Self & (RouteChildrenProps[Params, S])) extends AnyVal {
    
    @scala.inline
    def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location[S]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: `match`[Params]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchNull: Self = StObject.set(x, "match", null)
  }
}
