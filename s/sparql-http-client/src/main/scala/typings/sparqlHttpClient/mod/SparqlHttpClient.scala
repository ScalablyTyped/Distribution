package typings.sparqlHttpClient.mod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparqlHttpClient[TResponse /* <: Response */] extends js.Object {
  def constructQuery(query: String): js.Promise[TResponse] = js.native
  def constructQuery(query: String, options: QueryRequestInit): js.Promise[TResponse] = js.native
  def selectQuery(query: String): js.Promise[SelectResponse with TResponse] = js.native
  def selectQuery(query: String, options: QueryRequestInit): js.Promise[SelectResponse with TResponse] = js.native
  def updateQuery(query: String): js.Promise[Response] = js.native
  def updateQuery(query: String, options: QueryRequestInit): js.Promise[Response] = js.native
}

