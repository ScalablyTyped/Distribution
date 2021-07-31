package typings.reactNativeCommunityCliServerApi

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusPageMiddlewareMod {
  
  @JSImport("@react-native-community/cli-server-api/build/statusPageMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(_req: IncomingMessage, res: ServerResponse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
