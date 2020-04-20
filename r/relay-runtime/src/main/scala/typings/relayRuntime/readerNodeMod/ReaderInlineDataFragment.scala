package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.relayConcreteNodeMod.GeneratedNode
import typings.relayRuntime.relayRuntimeStrings.InlineDataFragment
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
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderInlineDataFragment]
  }
}

