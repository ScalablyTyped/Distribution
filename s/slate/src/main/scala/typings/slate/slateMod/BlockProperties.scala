package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.List
import typings.slate.slateStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockProperties extends NodeProperties {
  var data: js.UndefOr[Data | StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var nodes: js.UndefOr[(List[Block | Text | Inline]) | (js.Array[Block | Text | Inline])] = js.undefined
  var `object`: js.UndefOr[block] = js.undefined
  var `type`: String
}

object BlockProperties {
  @scala.inline
  def apply(
    `type`: String,
    data: Data | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: (List[Block | Text | Inline]) | (js.Array[Block | Text | Inline]) = null,
    `object`: block = null
  ): BlockProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockProperties]
  }
}

