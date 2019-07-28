package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.Anon_Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./networks/RelayQueryResponseCache
@JSImport("relay-runtime", "QueryResponseCache")
@js.native
class QueryResponseCache protected () extends RelayQueryResponseCache {
  def this(config: Anon_Size) = this()
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def get(queryID: String, variables: Variables): GraphQLResponse | Null = js.native
  /* CompleteClass */
  override def set(queryID: String, variables: Variables, payload: GraphQLResponse): Unit = js.native
}

