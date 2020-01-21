package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentJSON extends NodeJSON {
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var nodes: js.UndefOr[js.Array[NodeJSON]] = js.undefined
  var `object`: js.UndefOr[document] = js.undefined
}

object DocumentJSON {
  @scala.inline
  def apply(
    data: StringDictionary[js.Any] = null,
    key: String = null,
    nodes: js.Array[NodeJSON] = null,
    `object`: document = null
  ): DocumentJSON = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentJSON]
  }
}

