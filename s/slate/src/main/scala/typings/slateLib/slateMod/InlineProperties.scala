package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineProperties extends NodeProperties {
  var data: js.UndefOr[
    (immutableLib.immutableMod.Map[java.lang.String, _]) | org.scalablytyped.runtime.StringDictionary[js.Any]
  ] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var nodes: js.UndefOr[immutableLib.immutableMod.List[Node]] = js.undefined
  var `type`: java.lang.String
}

object InlineProperties {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    data: (immutableLib.immutableMod.Map[java.lang.String, _]) | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: java.lang.String = null,
    nodes: immutableLib.immutableMod.List[Node] = null
  ): InlineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[InlineProperties]
  }
}

