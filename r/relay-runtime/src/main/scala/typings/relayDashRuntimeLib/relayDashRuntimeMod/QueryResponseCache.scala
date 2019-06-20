package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./networks/RelayQueryResponseCache
@JSImport("relay-runtime", "QueryResponseCache")
@js.native
class QueryResponseCache protected () extends RelayQueryResponseCache {
  def this(config: relayDashRuntimeLib.Anon_Size) = this()
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def get(queryID: java.lang.String, variables: Variables): GraphQLResponse | scala.Null = js.native
  /* CompleteClass */
  override def set(queryID: java.lang.String, variables: Variables, payload: GraphQLResponse): scala.Unit = js.native
}

