package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineJSON extends NodeJSON {
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var nodes: js.UndefOr[js.Array[NodeJSON]] = js.undefined
  var `object`: slateLib.slateLibStrings.`inline`
  var `type`: java.lang.String
}

object InlineJSON {
  @scala.inline
  def apply(
    `object`: slateLib.slateLibStrings.`inline`,
    `type`: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: java.lang.String = null,
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

