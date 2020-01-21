package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderInlineDataFragmentSpread extends js.Object {
  val kind: String
  val name: String
  val selections: js.Array[ReaderSelection]
}

object ReaderInlineDataFragmentSpread {
  @scala.inline
  def apply(kind: String, name: String, selections: js.Array[ReaderSelection]): ReaderInlineDataFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReaderInlineDataFragmentSpread]
  }
}

