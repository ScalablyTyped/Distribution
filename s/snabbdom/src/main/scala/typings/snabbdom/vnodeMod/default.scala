package typings.snabbdom.vnodeMod

import typings.snabbdom.modulesAttributesMod.Global.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/vnode", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): VNode = js.native
  def apply(sel: String): VNode = js.native
  def apply(sel: String, data: js.Any): VNode = js.native
  def apply(sel: String, data: js.Any, children: js.Array[VNode | String]): VNode = js.native
  def apply(sel: String, data: js.Any, children: js.Array[VNode | String], text: String): VNode = js.native
  def apply(sel: String, data: js.Any, children: js.Array[VNode | String], text: String, elm: Element | Text): VNode = js.native
}

