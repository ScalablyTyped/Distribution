package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentProperties extends NodeProperties {
  var data: js.UndefOr[(Map[String, _]) | StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var nodes: js.UndefOr[List[Node] | js.Array[Node]] = js.undefined
}

object DocumentProperties {
  @scala.inline
  def apply(
    data: (Map[String, _]) | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: List[Node] | js.Array[Node] = null
  ): DocumentProperties = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProperties]
  }
}

