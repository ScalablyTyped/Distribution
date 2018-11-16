package typings
package routeDashRecognizerLib.routeDashRecognizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteRecognizer extends js.Object {
  var delegate: js.UndefOr[routeDashRecognizerLib.distRouteDashRecognizerDslMod.Delegate] = js.native
  var names: js.Any = js.native
  var rootState: js.Any = js.native
  var states: js.Any = js.native
  def add(routes: js.Array[routeDashRecognizerLib.distRouteDashRecognizerDslMod.Route]): scala.Unit = js.native
  def add(
    routes: js.Array[routeDashRecognizerLib.distRouteDashRecognizerDslMod.Route],
    options: routeDashRecognizerLib.Anon_As
  ): scala.Unit = js.native
  def generate(name: java.lang.String): java.lang.String = js.native
  def generate(name: java.lang.String, params: Params): java.lang.String = js.native
  def generateQueryString(params: QueryParams): java.lang.String = js.native
  def handlersFor(name: java.lang.String): js.Array[_] = js.native
  def hasRoute(name: java.lang.String): scala.Boolean = js.native
  def map(context: routeDashRecognizerLib.distRouteDashRecognizerDslMod.MatchCallback): scala.Unit = js.native
  def map(
    context: routeDashRecognizerLib.distRouteDashRecognizerDslMod.MatchCallback,
    addCallback: js.Function2[
      /* router */ this.type, 
      /* routes */ js.Array[routeDashRecognizerLib.distRouteDashRecognizerDslMod.Route], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def parseQueryString(queryString: java.lang.String): QueryParams = js.native
  def recognize(path: java.lang.String): js.UndefOr[Results] = js.native
}

