package typings
package snabbdomLib.vnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends js.Object {
  var children: js.UndefOr[js.Array[VNode | java.lang.String]] = js.undefined
  var data: js.UndefOr[VNodeData] = js.undefined
  var elm: js.UndefOr[stdLib.Node] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var sel: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object VNode {
  @scala.inline
  def apply(
    children: js.Array[VNode | java.lang.String] = null,
    data: VNodeData = null,
    elm: stdLib.Node = null,
    key: Key = null,
    sel: java.lang.String = null,
    text: java.lang.String = null
  ): VNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (elm != null) __obj.updateDynamic("elm")(elm)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (sel != null) __obj.updateDynamic("sel")(sel)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[VNode]
  }
}

