package typings.relayDashRuntime.relayDashRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderSplitOperation extends ReaderSelectableNode {
  val kind: String
  val metadata: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
   // 'SplitOperation';
  val name: String
  val selections: js.Array[ReaderSelection]
}

object ReaderSplitOperation {
  @scala.inline
  def apply(
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    metadata: StringDictionary[js.Any] = null
  ): ReaderSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, selections = selections)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ReaderSplitOperation]
  }
}

