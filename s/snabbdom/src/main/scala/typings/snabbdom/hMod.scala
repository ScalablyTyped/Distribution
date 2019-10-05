package typings.snabbdom

import typings.snabbdom.hMod.ArrayOrElement
import typings.snabbdom.hMod.VNodeChildElement
import typings.snabbdom.hMod.VNodeChildren
import typings.snabbdom.vnodeMod.VNode
import typings.snabbdom.vnodeMod.VNodeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/h", JSImport.Namespace)
@js.native
object hMod extends js.Object {
  def default(sel: String): VNode = js.native
  def default(sel: String, children: VNodeChildren): VNode = js.native
  def default(sel: String, data: VNodeData): VNode = js.native
  def default(sel: String, data: VNodeData, children: VNodeChildren): VNode = js.native
  def h(sel: String): VNode = js.native
  def h(sel: String, children: VNodeChildren): VNode = js.native
  def h(sel: String, data: VNodeData): VNode = js.native
  def h(sel: String, data: VNodeData, children: VNodeChildren): VNode = js.native
  type ArrayOrElement[T] = T | js.Array[T]
  type VNodeChildElement = js.UndefOr[VNode | String | Double | Null]
  type VNodeChildren = ArrayOrElement[VNodeChildElement]
  type VNodes = js.Array[VNode]
}

