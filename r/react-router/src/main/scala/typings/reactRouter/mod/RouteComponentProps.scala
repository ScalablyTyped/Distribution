package typings.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouter.reactRouterStrings.RouteComponentProps with TopLevel[js.Any] */, C /* <: StaticContext */, S] extends StObject {
  
  var history: History[S] = js.native
  
  var location: Location[S] = js.native
  
  var `match`: typings.reactRouter.mod.`match`[Params] = js.native
  
  var staticContext: js.UndefOr[C] = js.native
}
object RouteComponentProps {
  
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.RouteComponentProps with TopLevel[js.Any] */, C /* <: StaticContext */, S](history: History[S], location: Location[S], `match`: `match`[Params]): RouteComponentProps[Params, C, S] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params, C, S]]
  }
  
  @scala.inline
  implicit class RouteComponentPropsMutableBuilder[Self <: RouteComponentProps[_, _, _], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.RouteComponentProps with TopLevel[js.Any] */, C /* <: StaticContext */, S] (val x: Self with (RouteComponentProps[Params, C, S])) extends AnyVal {
    
    @scala.inline
    def setHistory(value: History[S]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location[S]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: `match`[Params]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticContext(value: C): Self = StObject.set(x, "staticContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticContextUndefined: Self = StObject.set(x, "staticContext", js.undefined)
  }
}
