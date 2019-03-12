package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentProperties extends NodeProperties {
  var data: js.UndefOr[
    (immutableLib.immutableMod.Map[java.lang.String, _]) | org.scalablytyped.runtime.StringDictionary[js.Any]
  ] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var nodes: js.UndefOr[immutableLib.immutableMod.List[Node] | js.Array[Node]] = js.undefined
}

object DocumentProperties {
  @scala.inline
  def apply(
    data: (immutableLib.immutableMod.Map[java.lang.String, _]) | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: java.lang.String = null,
    nodes: immutableLib.immutableMod.List[Node] | js.Array[Node] = null
  ): DocumentProperties = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProperties]
  }
}

