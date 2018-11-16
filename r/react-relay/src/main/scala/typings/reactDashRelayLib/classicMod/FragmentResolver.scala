package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentResolver extends js.Object {
  def dispose(): scala.Unit = js.native
  def resolve(fragment: js.Any, dataIDs: js.Array[relayDashRuntimeLib.relayDashRuntimeMod.DataID]): js.UndefOr[StoreReaderData | js.Array[StoreReaderData] | scala.Null] = js.native
  def resolve(fragment: js.Any, dataIDs: relayDashRuntimeLib.relayDashRuntimeMod.DataID): js.UndefOr[StoreReaderData | js.Array[StoreReaderData] | scala.Null] = js.native
}

