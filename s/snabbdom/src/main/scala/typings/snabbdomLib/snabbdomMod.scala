package typings
package snabbdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom", JSImport.Namespace)
@js.native
object snabbdomMod extends js.Object {
  val thunk: snabbdomLib.thunkMod.ThunkFn = js.native
  def h(sel: java.lang.String): snabbdomLib.vnodeMod.VNode = js.native
  def h(sel: java.lang.String, children: snabbdomLib.hMod.VNodeChildren): snabbdomLib.vnodeMod.VNode = js.native
  def h(sel: java.lang.String, data: snabbdomLib.vnodeMod.VNodeData): snabbdomLib.vnodeMod.VNode = js.native
  def h(
    sel: java.lang.String,
    data: snabbdomLib.vnodeMod.VNodeData,
    children: snabbdomLib.hMod.VNodeChildren
  ): snabbdomLib.vnodeMod.VNode = js.native
  def init(modules: js.Array[stdLib.Partial[snabbdomLib.modulesModuleMod.Module]]): js.Function2[
    /* oldVnode */ snabbdomLib.modulesAttributesMod.Global.Element | snabbdomLib.vnodeMod.VNode, 
    /* vnode */ snabbdomLib.vnodeMod.VNode, 
    snabbdomLib.vnodeMod.VNode
  ] = js.native
  def init(
    modules: js.Array[stdLib.Partial[snabbdomLib.modulesModuleMod.Module]],
    domApi: snabbdomLib.htmldomapiMod.DOMAPI
  ): js.Function2[
    /* oldVnode */ snabbdomLib.modulesAttributesMod.Global.Element | snabbdomLib.vnodeMod.VNode, 
    /* vnode */ snabbdomLib.vnodeMod.VNode, 
    snabbdomLib.vnodeMod.VNode
  ] = js.native
}

