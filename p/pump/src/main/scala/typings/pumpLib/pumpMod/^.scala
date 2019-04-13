package typings
package pumpLib.pumpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pump", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // callback have to be passed as last argument
  def apply(streams: (Stream | Callback)*): js.Array[Stream] = js.native
  def apply(streams: js.Array[Stream]): js.Array[Stream] = js.native
  def apply(streams: js.Array[Stream], callback: Callback): js.Array[Stream] = js.native
}

