package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentJSON extends NodeJSON {
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var nodes: js.UndefOr[js.Array[NodeJSON]] = js.undefined
  var `object`: js.UndefOr[slateLib.slateLibStrings.document] = js.undefined
}

object DocumentJSON {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: java.lang.String = null,
    nodes: js.Array[NodeJSON] = null,
    `object`: slateLib.slateLibStrings.document = null
  ): DocumentJSON = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (key != null) __obj.updateDynamic("key")(key)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[DocumentJSON]
  }
}

