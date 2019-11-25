package typings.snabbdom.vnodeMod

import typings.snabbdom.modulesAttributesMod._Global_.Element
import typings.std.Node
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends js.Object {
  var children: js.UndefOr[js.Array[VNode | String]] = js.undefined
  var data: js.UndefOr[VNodeData] = js.undefined
  var elm: js.UndefOr[Node] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var sel: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object VNode {
  @scala.inline
  def apply(
    children: js.Array[VNode | String] = null,
    data: VNodeData = null,
    elm: Node = null,
    key: Key = null,
    sel: String = null,
    text: String = null
  ): VNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (elm != null) __obj.updateDynamic("elm")(elm.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (sel != null) __obj.updateDynamic("sel")(sel.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
}

@JSImport("snabbdom/vnode", "vnode")
@js.native
object vnode extends js.Object {
  def apply(): VNode = js.native
  def apply(sel: String): VNode = js.native
  def apply(sel: String, data: js.Any): VNode = js.native
  def apply(sel: String, data: js.Any, children: js.Array[VNode | String]): VNode = js.native
  def apply(sel: String, data: js.Any, children: js.Array[VNode | String], text: String): VNode = js.native
  def apply(sel: String, data: js.Any, children: js.Array[VNode | String], text: String, elm: Element | Text): VNode = js.native
}

