package typings.reduxRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionCreatorsMod {
  
  @JSImport("redux-router/lib/actionCreators", "go")
  @js.native
  def go(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router/lib/actionCreators", "goBack")
  @js.native
  def goBack(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router/lib/actionCreators", "goForward")
  @js.native
  def goForward(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router/lib/actionCreators", "historyAPI")
  @js.native
  def historyAPI(method: js.Any): js.Function1[/* repeated */ js.Object, ReduxRouterAction] = js.native
  
  @JSImport("redux-router/lib/actionCreators", "initRoutes")
  @js.native
  def initRoutes(routes: js.Any): ReduxRouterAction = js.native
  
  @JSImport("redux-router/lib/actionCreators", "push")
  @js.native
  def push(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router/lib/actionCreators", "pushState")
  @js.native
  def pushState(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router/lib/actionCreators", "replace")
  @js.native
  def replace(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router/lib/actionCreators", "replaceRoutes")
  @js.native
  def replaceRoutes(routes: js.Any): ReduxRouterAction = js.native
  
  @JSImport("redux-router/lib/actionCreators", "replaceState")
  @js.native
  def replaceState(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router/lib/actionCreators", "routerDidChange")
  @js.native
  def routerDidChange(state: js.Any): ReduxRouterAction = js.native
  
  @JSImport("redux-router/lib/actionCreators", "setState")
  @js.native
  def setState(args: js.Object*): ReduxRouterAction = js.native
  
  @js.native
  trait ReduxRouterAction extends StObject {
    
    var payload: js.Any = js.native
    
    var `type`: String = js.native
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
