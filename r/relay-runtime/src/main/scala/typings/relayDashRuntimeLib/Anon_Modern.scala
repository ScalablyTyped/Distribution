package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Modern
  extends relayDashRuntimeLib.relayDashRuntimeMod._GraphQLTaggedNode {
  def modern(): relayDashRuntimeLib.relayDashRuntimeMod.ReaderFragment | relayDashRuntimeLib.relayDashRuntimeMod.ConcreteRequest
}

object Anon_Modern {
  @scala.inline
  def apply(
    modern: () => relayDashRuntimeLib.relayDashRuntimeMod.ReaderFragment | relayDashRuntimeLib.relayDashRuntimeMod.ConcreteRequest
  ): Anon_Modern = {
    val __obj = js.Dynamic.literal(modern = js.Any.fromFunction0(modern))
  
    __obj.asInstanceOf[Anon_Modern]
  }
}

