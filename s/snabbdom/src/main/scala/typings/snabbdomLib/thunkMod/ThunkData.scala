package typings
package snabbdomLib.thunkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThunkData
  extends snabbdomLib.vnodeMod.VNodeData {
  @JSName("args")
  var args_ThunkData: js.Array[_]
  @JSName("fn")
  def fn_MThunkData(): snabbdomLib.vnodeMod.VNode
}

object ThunkData {
  @scala.inline
  def apply(
    args: js.Array[_],
    fn: () => snabbdomLib.vnodeMod.VNode,
    attachData: snabbdomLib.helpersAttachtoMod.AttachData = null,
    attrs: snabbdomLib.modulesAttributesMod.Attrs = null,
    `class`: snabbdomLib.modulesClassMod.Classes = null,
    dataset: snabbdomLib.modulesDatasetMod.Dataset = null,
    hero: snabbdomLib.modulesHeroMod.Hero = null,
    hook: snabbdomLib.hooksMod.Hooks = null,
    key: snabbdomLib.vnodeMod.Key = null,
    ns: java.lang.String = null,
    on: snabbdomLib.modulesEventlistenersMod.On = null,
    props: snabbdomLib.modulesPropsMod.Props = null,
    style: snabbdomLib.modulesStyleMod.VNodeStyle = null
  ): ThunkData = {
    val __obj = js.Dynamic.literal(args = args, fn = js.Any.fromFunction0(fn))
    if (attachData != null) __obj.updateDynamic("attachData")(attachData)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (hero != null) __obj.updateDynamic("hero")(hero)
    if (hook != null) __obj.updateDynamic("hook")(hook)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns)
    if (on != null) __obj.updateDynamic("on")(on)
    if (props != null) __obj.updateDynamic("props")(props)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ThunkData]
  }
}

