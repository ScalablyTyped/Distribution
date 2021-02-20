package typings.reactOnsenui.mod

import typings.reactOnsenui.anon.Key
import typings.reactOnsenui.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RouterUtil {
  
  @JSImport("react-onsenui", "RouterUtil.init")
  @js.native
  def init(routes: js.Array[Route]): RouteConfig = js.native
  
  @JSImport("react-onsenui", "RouterUtil.pop")
  @js.native
  def pop(config: Options): RouteConfig = js.native
  
  @JSImport("react-onsenui", "RouterUtil.postPop")
  @js.native
  def postPop(routeConfig: RouteConfig): RouteConfig = js.native
  
  @JSImport("react-onsenui", "RouterUtil.postPush")
  @js.native
  def postPush(routeConfig: RouteConfig): RouteConfig = js.native
  
  @JSImport("react-onsenui", "RouterUtil.push")
  @js.native
  def push(config: Key): RouteConfig = js.native
  
  @JSImport("react-onsenui", "RouterUtil.replace")
  @js.native
  def replace(config: Key): RouteConfig = js.native
  
  @JSImport("react-onsenui", "RouterUtil.reset")
  @js.native
  def reset(config: Key): RouteConfig = js.native
}
