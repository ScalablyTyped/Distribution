package typings.snabbdom

import typings.snabbdom.hMod.VNodeChildren
import typings.snabbdom.htmldomapiMod.DOMAPI
import typings.snabbdom.modulesAttributesMod._Global_.Element
import typings.snabbdom.modulesModuleMod.Module
import typings.snabbdom.thunkMod.ThunkFn
import typings.snabbdom.vnodeMod.VNode
import typings.snabbdom.vnodeMod.VNodeData
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom", JSImport.Namespace)
@js.native
object snabbdomMod extends js.Object {
  val thunk: ThunkFn = js.native
  def h(sel: String): VNode = js.native
  def h(sel: String, children: VNodeChildren): VNode = js.native
  def h(sel: String, data: VNodeData): VNode = js.native
  def h(sel: String, data: VNodeData, children: VNodeChildren): VNode = js.native
  def init(modules: js.Array[Partial[Module]]): js.Function2[/* oldVnode */ Element | VNode, /* vnode */ VNode, VNode] = js.native
  def init(modules: js.Array[Partial[Module]], domApi: DOMAPI): js.Function2[/* oldVnode */ Element | VNode, /* vnode */ VNode, VNode] = js.native
}

