package typings
package snabbdomLib.modulesModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  @JSName("create")
  var create_Original: snabbdomLib.hooksMod.CreateHook = js.native
  @JSName("destroy")
  var destroy_Original: snabbdomLib.hooksMod.DestroyHook = js.native
  @JSName("post")
  var post_Original: snabbdomLib.hooksMod.PostHook = js.native
  @JSName("pre")
  var pre_Original: snabbdomLib.hooksMod.PreHook = js.native
  @JSName("remove")
  var remove_Original: snabbdomLib.hooksMod.RemoveHook = js.native
  @JSName("update")
  var update_Original: snabbdomLib.hooksMod.UpdateHook = js.native
  def create(emptyVNode: snabbdomLib.vnodeMod.VNode, vNode: snabbdomLib.vnodeMod.VNode): js.Any = js.native
  def destroy(vNode: snabbdomLib.vnodeMod.VNode): js.Any = js.native
  def post(): js.Any = js.native
  def pre(): js.Any = js.native
  def remove(vNode: snabbdomLib.vnodeMod.VNode, removeCallback: js.Function0[scala.Unit]): js.Any = js.native
  def update(oldVNode: snabbdomLib.vnodeMod.VNode, vNode: snabbdomLib.vnodeMod.VNode): js.Any = js.native
}

