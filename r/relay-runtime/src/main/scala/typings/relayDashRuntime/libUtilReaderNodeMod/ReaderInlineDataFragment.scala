package typings.relayDashRuntime.libUtilReaderNodeMod

import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.GeneratedNode
import typings.relayDashRuntime.relayDashRuntimeStrings.InlineDataFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderInlineDataFragment extends GeneratedNode {
  val kind: InlineDataFragment
  val name: String
}

object ReaderInlineDataFragment {
  @scala.inline
  def apply(kind: InlineDataFragment, name: String): ReaderInlineDataFragment = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[ReaderInlineDataFragment]
  }
}

