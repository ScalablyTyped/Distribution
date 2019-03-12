package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockJSON extends NodeJSON {
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var nodes: js.UndefOr[js.Array[BlockJSON | InlineJSON | TextJSON]] = js.undefined
  var `object`: slateLib.slateLibStrings.block
  var `type`: java.lang.String
}

object BlockJSON {
  @scala.inline
  def apply(
    `object`: slateLib.slateLibStrings.block,
    `type`: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: java.lang.String = null,
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

