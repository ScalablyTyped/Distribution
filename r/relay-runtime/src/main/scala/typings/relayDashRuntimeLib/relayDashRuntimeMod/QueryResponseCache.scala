package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "QueryResponseCache")
@js.native
class QueryResponseCache protected () extends js.Object {
  def this(options: relayDashRuntimeLib.Anon_Size) = this()
  def clear(): scala.Unit = js.native
  def get(queryID: java.lang.String, variables: Variables): QueryPayload | scala.Null = js.native
  def set(queryID: java.lang.String, variables: Variables, payload: QueryPayload): scala.Unit = js.native
}

