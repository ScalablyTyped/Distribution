package typings.snabbdom

import typings.snabbdom.vnodeMod.VNodeData
import typings.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/h", JSImport.Namespace)
@js.native
object hMod extends js.Object {
  def default(sel: String): VNode_ = js.native
  def default(sel: String, children: VNodeChildren): VNode_ = js.native
  def default(sel: String, data: VNodeData): VNode_ = js.native
  def default(sel: String, data: VNodeData, children: VNodeChildren): VNode_ = js.native
  def h(sel: String): VNode_ = js.native
  def h(sel: String, children: VNodeChildren): VNode_ = js.native
  def h(sel: String, data: VNodeData): VNode_ = js.native
  def h(sel: String, data: VNodeData, children: VNodeChildren): VNode_ = js.native
  type ArrayOrElement[T] = T | js.Array[T]
  type VNodeChildElement = js.UndefOr[VNode_ | String | Double | Null]
  type VNodeChildren = ArrayOrElement[VNodeChildElement]
  type VNodes = js.Array[VNode_]
}

