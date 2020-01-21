package typings.snabbdom.thunkMod

import typings.snabbdom.vnodeMod.Key
import typings.snabbdom.vnodeMod.VNode_
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thunk_ extends VNode_ {
  @JSName("data")
  var data_Thunk_ : ThunkData
}

object Thunk_ {
  @scala.inline
  def apply(
    data: ThunkData,
    children: js.Array[VNode_ | String] = null,
    elm: Node = null,
    key: Key = null,
    sel: String = null,
    text: String = null
  ): Thunk_ = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (elm != null) __obj.updateDynamic("elm")(elm.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (sel != null) __obj.updateDynamic("sel")(sel.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thunk_]
  }
}

