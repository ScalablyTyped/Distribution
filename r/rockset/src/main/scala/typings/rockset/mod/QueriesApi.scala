package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueriesApi extends js.Object {
  
  def query(body: QueryRequest): QueryResponse = js.native
  def query(body: QueryRequest, callback: RequestCallback): QueryResponse = js.native
}
