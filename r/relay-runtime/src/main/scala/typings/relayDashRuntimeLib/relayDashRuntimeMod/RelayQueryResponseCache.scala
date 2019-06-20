package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./networks/RelayQueryResponseCache
trait RelayQueryResponseCache extends js.Object {
  def clear(): scala.Unit
  def get(queryID: java.lang.String, variables: Variables): GraphQLResponse | scala.Null
  def set(queryID: java.lang.String, variables: Variables, payload: GraphQLResponse): scala.Unit
}

object RelayQueryResponseCache {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    get: (java.lang.String, Variables) => GraphQLResponse | scala.Null,
    set: (java.lang.String, Variables, GraphQLResponse) => scala.Unit
  ): RelayQueryResponseCache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction2(get), set = js.Any.fromFunction3(set))
  
    __obj.asInstanceOf[RelayQueryResponseCache]
  }
}

