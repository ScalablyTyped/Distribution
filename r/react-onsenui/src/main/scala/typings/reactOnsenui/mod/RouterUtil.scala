package typings.reactOnsenui.mod

import typings.reactOnsenui.anon.Key
import typings.reactOnsenui.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RouterUtil {
  
  @JSImport("react-onsenui", "RouterUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(routes: js.Array[Route]): RouteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(routes.asInstanceOf[js.Any]).asInstanceOf[RouteConfig]
  
  inline def pop(config: Options): RouteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(config.asInstanceOf[js.Any]).asInstanceOf[RouteConfig]
  
  inline def postPop(routeConfig: RouteConfig): RouteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("postPop")(routeConfig.asInstanceOf[js.Any]).asInstanceOf[RouteConfig]
  
  inline def postPush(routeConfig: RouteConfig): RouteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("postPush")(routeConfig.asInstanceOf[js.Any]).asInstanceOf[RouteConfig]
  
  inline def push(config: Key): RouteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(config.asInstanceOf[js.Any]).asInstanceOf[RouteConfig]
  
  inline def replace(config: Key): RouteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(config.asInstanceOf[js.Any]).asInstanceOf[RouteConfig]
  
  inline def reset(config: Key): RouteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(config.asInstanceOf[js.Any]).asInstanceOf[RouteConfig]
}
