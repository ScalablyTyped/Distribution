package typings.routeRecognizer.mod

import typings.routeRecognizer.anon.As
import typings.routeRecognizer.dslMod.Delegate
import typings.routeRecognizer.dslMod.MatchCallback
import typings.routeRecognizer.dslMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteRecognizer extends js.Object {
  
  def add(routes: js.Array[Route]): Unit = js.native
  def add(routes: js.Array[Route], options: As): Unit = js.native
  
  var delegate: js.UndefOr[Delegate] = js.native
  
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
  
  var names: js.Any = js.native
  
  def parseQueryString(queryString: String): QueryParams = js.native
  
  def recognize(path: String): js.UndefOr[Results] = js.native
  
  var rootState: js.Any = js.native
  
  var states: js.Any = js.native
}
