package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockJSON extends NodeJSON {
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var nodes: js.UndefOr[js.Array[BlockJSON | InlineJSON | TextJSON]] = js.undefined
  var `object`: block
  var `type`: String
}

object BlockJSON {
  @scala.inline
  def apply(
    `object`: block,
    `type`: String,
    data: StringDictionary[js.Any] = null,
    key: String = null,
    nodes: js.Array[BlockJSON | InlineJSON | TextJSON] = null
  ): BlockJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (key != null) __obj.updateDynamic("key")(key)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[BlockJSON]
  }
}

