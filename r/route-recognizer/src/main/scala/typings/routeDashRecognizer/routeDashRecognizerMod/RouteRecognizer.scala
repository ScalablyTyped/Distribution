package typings.routeDashRecognizer.routeDashRecognizerMod

import typings.routeDashRecognizer.Anon_As
import typings.routeDashRecognizer.distRouteDashRecognizerDslMod.Delegate
import typings.routeDashRecognizer.distRouteDashRecognizerDslMod.MatchCallback
import typings.routeDashRecognizer.distRouteDashRecognizerDslMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteRecognizer extends js.Object {
  var delegate: js.UndefOr[Delegate] = js.native
  var names: js.Any = js.native
  var rootState: js.Any = js.native
  var states: js.Any = js.native
  def add(routes: js.Array[Route]): Unit = js.native
  def add(routes: js.Array[Route], options: Anon_As): Unit = js.native
  def generate(name: String): String = js.native
  def generate(name: String, params: Params): String = js.native
  def generateQueryString(params: QueryParams): String = js.native
  def handlersFor(name: String): js.Array[_] = js.native
  def hasRoute(name: String): Boolean = js.native
  def map(context: MatchCallback): Unit = js.native
  def map(
    context: MatchCallback,
    addCallback: js.Function2[/* router */ this.type, /* routes */ js.Array[Route], Unit]
  ): Unit = js.native
  def parseQueryString(queryString: String): QueryParams = js.native
  def recognize(path: String): js.UndefOr[Results] = js.native
}

