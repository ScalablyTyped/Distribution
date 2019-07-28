package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockProperties extends NodeProperties {
  var data: js.UndefOr[(Map[String, _]) | StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var nodes: js.UndefOr[List[Node]] = js.undefined
  var `type`: String
}

object BlockProperties {
  @scala.inline
  def apply(
    `type`: String,
    data: (Map[String, _]) | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: List[Node] = null
  ): BlockProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[BlockProperties]
  }
}

