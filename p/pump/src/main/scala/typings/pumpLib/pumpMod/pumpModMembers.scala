package typings
package pumpLib.pumpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pump", JSImport.Namespace)
@js.native
object pumpModMembers extends js.Object {
  // callback have to be passed as last argument
  def apply(streams: (pumpLib.pumpMod.pumpNs.Stream | pumpLib.pumpMod.pumpNs.Callback)*): js.Array[pumpLib.pumpMod.pumpNs.Stream] = js.native
  def apply(streams: js.Array[pumpLib.pumpMod.pumpNs.Stream]): js.Array[pumpLib.pumpMod.pumpNs.Stream] = js.native
  def apply(streams: js.Array[pumpLib.pumpMod.pumpNs.Stream], callback: pumpLib.pumpMod.pumpNs.Callback): js.Array[pumpLib.pumpMod.pumpNs.Stream] = js.native
}

