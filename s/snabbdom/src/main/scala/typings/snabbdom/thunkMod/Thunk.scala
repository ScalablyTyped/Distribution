package typings.snabbdom.thunkMod

import typings.snabbdom.vnodeMod.Key
import typings.snabbdom.vnodeMod.VNode
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thunk extends VNode {
  @JSName("data")
  var data_Thunk: ThunkData
}

object Thunk {
  @scala.inline
  def apply(
    data: ThunkData,
    children: js.Array[VNode | String] = null,
    elm: Node = null,
    key: Key = null,
    sel: String = null,
    text: String = null
  ): Thunk = {
    val __obj = js.Dynamic.literal(data = data)
    if (children != null) __obj.updateDynamic("children")(children)
    if (elm != null) __obj.updateDynamic("elm")(elm)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (sel != null) __obj.updateDynamic("sel")(sel)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Thunk]
  }
}

