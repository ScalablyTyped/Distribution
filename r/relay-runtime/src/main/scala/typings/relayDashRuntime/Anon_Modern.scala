package typings.relayDashRuntime

import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typings.relayDashRuntime.relayDashRuntimeMod._GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Modern extends _GraphQLTaggedNode {
  def modern(): ReaderFragment | ConcreteRequest
}

object Anon_Modern {
  @scala.inline
  def apply(modern: () => ReaderFragment | ConcreteRequest): Anon_Modern = {
    val __obj = js.Dynamic.literal(modern = js.Any.fromFunction0(modern))
  
    __obj.asInstanceOf[Anon_Modern]
  }
}

