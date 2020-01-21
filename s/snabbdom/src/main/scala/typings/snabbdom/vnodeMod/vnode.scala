package typings.snabbdom.vnodeMod

import typings.snabbdom.attributesMod._Global_.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/vnode", "vnode")
@js.native
object vnode extends js.Object {
  def apply(): VNode_ = js.native
  def apply(sel: String): VNode_ = js.native
  def apply(sel: String, data: js.Any): VNode_ = js.native
  def apply(sel: String, data: js.Any, children: js.Array[VNode_ | String]): VNode_ = js.native
  def apply(sel: String, data: js.Any, children: js.Array[VNode_ | String], text: String): VNode_ = js.native
  def apply(sel: String, data: js.Any, children: js.Array[VNode_ | String], text: String, elm: Element | Text): VNode_ = js.native
}

