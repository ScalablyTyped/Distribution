package typings.snabbdom

import typings.snabbdom.anon.PartialModule
import typings.snabbdom.attributesMod.global.Element
import typings.snabbdom.hMod.VNodeChildren
import typings.snabbdom.htmldomapiMod.DOMAPI
import typings.snabbdom.thunkMod.ThunkFn
import typings.snabbdom.vnodeMod.VNodeData
import typings.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val thunk: ThunkFn = js.native
  def h(sel: String): VNode_ = js.native
  def h(sel: String, children: VNodeChildren): VNode_ = js.native
  def h(sel: String, data: VNodeData): VNode_ = js.native
  def h(sel: String, data: VNodeData, children: VNodeChildren): VNode_ = js.native
  def init(modules: js.Array[PartialModule]): js.Function2[/* oldVnode */ Element | VNode_, /* vnode */ VNode_, VNode_] = js.native
  def init(modules: js.Array[PartialModule], domApi: DOMAPI): js.Function2[/* oldVnode */ Element | VNode_, /* vnode */ VNode_, VNode_] = js.native
}

