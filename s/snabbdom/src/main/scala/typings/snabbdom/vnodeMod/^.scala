package typings.snabbdom.vnodeMod

import typings.snabbdom.modulesAttributesMod.Global.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/vnode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(): VNode = js.native
  def default(sel: String): VNode = js.native
  def default(sel: String, data: js.Any): VNode = js.native
  def default(sel: String, data: js.Any, children: js.Array[VNode | String]): VNode = js.native
  def default(sel: String, data: js.Any, children: js.Array[VNode | String], text: String): VNode = js.native
  def default(sel: String, data: js.Any, children: js.Array[VNode | String], text: String, elm: Element | Text): VNode = js.native
  def vnode(): VNode = js.native
  def vnode(sel: String): VNode = js.native
  def vnode(sel: String, data: js.Any): VNode = js.native
  def vnode(sel: String, data: js.Any, children: js.Array[VNode | String]): VNode = js.native
  def vnode(sel: String, data: js.Any, children: js.Array[VNode | String], text: String): VNode = js.native
  def vnode(sel: String, data: js.Any, children: js.Array[VNode | String], text: String, elm: Element | Text): VNode = js.native
}

