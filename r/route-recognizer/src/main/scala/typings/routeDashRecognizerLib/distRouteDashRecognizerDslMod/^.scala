package typings
package routeDashRecognizerLib.distRouteDashRecognizerDslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-recognizer/dist/route-recognizer/dsl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[T /* <: RouteRecognizer */](`this`: T, callback: MatchCallback): scala.Unit = js.native
  def default[T /* <: RouteRecognizer */](
    `this`: T,
    callback: MatchCallback,
    addRouteCallback: js.Function2[/* routeRecognizer */ T, /* routes */ js.Array[Route], scala.Unit]
  ): scala.Unit = js.native
}

