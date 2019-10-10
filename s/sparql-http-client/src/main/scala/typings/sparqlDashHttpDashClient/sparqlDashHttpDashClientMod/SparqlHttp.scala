package typings.sparqlDashHttpDashClient.sparqlDashHttpDashClientMod

import typings.nodeDashFetch.nodeDashFetchMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sparql-http-client", "SparqlHttp")
@js.native
class SparqlHttp[TResponse /* <: Response */] () extends js.Object {
  def this(options: SparqlHttpOptions) = this()
  def constructQuery(query: String): js.Promise[TResponse] = js.native
  def constructQuery(query: String, options: QueryRequestInit): js.Promise[TResponse] = js.native
  def selectQuery(query: String): js.Promise[SelectResponse with TResponse] = js.native
  def selectQuery(query: String, options: QueryRequestInit): js.Promise[SelectResponse with TResponse] = js.native
  def updateQuery(query: String): js.Promise[Response] = js.native
  def updateQuery(query: String, options: QueryRequestInit): js.Promise[Response] = js.native
}

