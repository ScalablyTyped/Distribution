package typings.routeRecognizer.dslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("route-recognizer/dist/route-recognizer/dsl", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[T /* <: RouteRecognizer */](callback: MatchCallback): Unit = js.native
  def apply[T /* <: RouteRecognizer */](
    callback: MatchCallback,
    addRouteCallback: js.Function2[/* routeRecognizer */ T, /* routes */ js.Array[Route], Unit]
  ): Unit = js.native
}
