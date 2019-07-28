package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./networks/RelayQueryResponseCache
trait RelayQueryResponseCache extends js.Object {
  def clear(): Unit
  def get(queryID: String, variables: Variables): GraphQLResponse | Null
  def set(queryID: String, variables: Variables, payload: GraphQLResponse): Unit
}

object RelayQueryResponseCache {
  @scala.inline
  def apply(
    clear: () => Unit,
    get: (String, Variables) => GraphQLResponse | Null,
    set: (String, Variables, GraphQLResponse) => Unit
  ): RelayQueryResponseCache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction2(get), set = js.Any.fromFunction3(set))
  
    __obj.asInstanceOf[RelayQueryResponseCache]
  }
}

