package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueriesApi extends js.Object {
  def query(body: QueryRequest): QueryResponse = js.native
  def query(body: QueryRequest, callback: RequestCallback): QueryResponse = js.native
}

