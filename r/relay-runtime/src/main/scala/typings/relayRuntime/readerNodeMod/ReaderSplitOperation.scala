package typings.relayRuntime.readerNodeMod

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
    metadata: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined
  ): ReaderSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderSplitOperation]
  }
}

