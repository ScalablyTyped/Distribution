package typings.relayDashRuntime.libUtilReaderNodeMod

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
    val __obj = js.Dynamic.literal(kind = kind, name = name, selections = selections)
  
    __obj.asInstanceOf[ReaderInlineDataFragmentSpread]
  }
}

