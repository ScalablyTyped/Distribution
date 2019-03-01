package typings
package snabbdomLib.thunkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thunk
  extends snabbdomLib.vnodeMod.VNode {
  @JSName("data")
  var data_Thunk: ThunkData
}

object Thunk {
  @scala.inline
  def apply(
    data: ThunkData,
    children: js.Array[snabbdomLib.vnodeMod.VNode | java.lang.String] = null,
    elm: stdLib.Node = null,
    key: snabbdomLib.vnodeMod.Key = null,
    sel: java.lang.String = null,
    text: java.lang.String = null
  ): Thunk = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    if (children != null) __obj.updateDynamic("children")(children)
    if (elm != null) __obj.updateDynamic("elm")(elm)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (sel != null) __obj.updateDynamic("sel")(sel)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Thunk]
  }
}

