package typings.reduxRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionCreatorsMod {
  
  @JSImport("redux-router/lib/actionCreators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def go(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def goBack(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def goForward(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def historyAPI(method: js.Any): js.Function1[/* repeated */ js.Object, ReduxRouterAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("historyAPI")(method.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Object, ReduxRouterAction]]
  
  @scala.inline
  def initRoutes(routes: js.Any): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("initRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def push(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def pushState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("pushState")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def replace(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def replaceRoutes(routes: js.Any): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def replaceState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceState")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def routerDidChange(state: js.Any): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("routerDidChange")(state.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  @scala.inline
  def setState(args: js.Object*): ReduxRouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setState")(args.asInstanceOf[js.Any]).asInstanceOf[ReduxRouterAction]
  
  trait ReduxRouterAction extends StObject {
    
    var payload: js.Any
    
    var `type`: String
  }
  object ReduxRouterAction {
    
    @scala.inline
    def apply(payload: js.Any, `type`: String): ReduxRouterAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReduxRouterAction]
    }
    
    @scala.inline
    implicit class ReduxRouterActionMutableBuilder[Self <: ReduxRouterAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
