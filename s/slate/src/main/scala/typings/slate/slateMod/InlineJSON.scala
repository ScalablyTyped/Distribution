package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.`inline`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineJSON extends NodeJSON {
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var nodes: js.UndefOr[js.Array[NodeJSON]] = js.undefined
  var `object`: `inline`
  var `type`: String
}

object InlineJSON {
  @scala.inline
  def apply(
    `object`: `inline`,
    `type`: String,
    data: StringDictionary[js.Any] = null,
    key: String = null,
    nodes: js.Array[NodeJSON] = null
  ): InlineJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (key != null) __obj.updateDynamic("key")(key)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[InlineJSON]
  }
}

