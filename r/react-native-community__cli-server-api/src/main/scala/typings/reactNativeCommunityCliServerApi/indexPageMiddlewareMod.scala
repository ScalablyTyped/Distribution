package typings.reactNativeCommunityCliServerApi

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexPageMiddlewareMod {
  
  @JSImport("@react-native-community/cli-server-api/build/indexPageMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(req: IncomingMessage, res: ServerResponse, next: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
