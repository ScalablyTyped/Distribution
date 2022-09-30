package typings.reduxRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionCreatorsMod {
  
  @JSImport("redux-router/lib/actionCreators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def go(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def goBack(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def goForward(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def historyAPI(method: Any): js.Function1[/* repeated */ js.Object, ReduxRouterAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("historyAPI")(method.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Object, ReduxRouterAction]]
  
  inline def initRoutes(routes: Any): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("initRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  inline def push(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def pushState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("pushState")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def replace(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def replaceRoutes(routes: Any): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  inline def replaceState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceState")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  inline def routerDidChange(state: Any): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("routerDidChange")(state.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  inline def setState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setState")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReduxRouterAction]
  
  trait ReduxRouterAction extends StObject {
    
    var payload: Any
    
    var `type`: String
  }
  object ReduxRouterAction {
    
    inline def apply(payload: Any, `type`: String): ReduxRouterAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReduxRouterAction]
    }
    
    extension [Self <: ReduxRouterAction](x: Self) {
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
