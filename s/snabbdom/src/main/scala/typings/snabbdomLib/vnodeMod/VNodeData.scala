package typings
package snabbdomLib.vnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeData
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var attachData: js.UndefOr[snabbdomLib.helpersAttachtoMod.AttachData] = js.undefined
  var attrs: js.UndefOr[snabbdomLib.modulesAttributesMod.Attrs] = js.undefined
  var `class`: js.UndefOr[snabbdomLib.modulesClassMod.Classes] = js.undefined
  var dataset: js.UndefOr[snabbdomLib.modulesDatasetMod.Dataset] = js.undefined
  var fn: js.UndefOr[js.Function0[VNode]] = js.undefined
  var hero: js.UndefOr[snabbdomLib.modulesHeroMod.Hero] = js.undefined
  var hook: js.UndefOr[snabbdomLib.hooksMod.Hooks] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var ns: js.UndefOr[java.lang.String] = js.undefined
  var on: js.UndefOr[snabbdomLib.modulesEventlistenersMod.On] = js.undefined
  var props: js.UndefOr[snabbdomLib.modulesPropsMod.Props] = js.undefined
  var style: js.UndefOr[snabbdomLib.modulesStyleMod.VNodeStyle] = js.undefined
}

object VNodeData {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    args: js.Array[_] = null,
    attachData: snabbdomLib.helpersAttachtoMod.AttachData = null,
    attrs: snabbdomLib.modulesAttributesMod.Attrs = null,
    `class`: snabbdomLib.modulesClassMod.Classes = null,
    dataset: snabbdomLib.modulesDatasetMod.Dataset = null,
    fn: js.Function0[VNode] = null,
    hero: snabbdomLib.modulesHeroMod.Hero = null,
    hook: snabbdomLib.hooksMod.Hooks = null,
    key: Key = null,
    ns: java.lang.String = null,
    on: snabbdomLib.modulesEventlistenersMod.On = null,
    props: snabbdomLib.modulesPropsMod.Props = null,
    style: snabbdomLib.modulesStyleMod.VNodeStyle = null
  ): VNodeData = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (args != null) __obj.updateDynamic("args")(args)
    if (attachData != null) __obj.updateDynamic("attachData")(attachData)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (fn != null) __obj.updateDynamic("fn")(fn)
    if (hero != null) __obj.updateDynamic("hero")(hero)
    if (hook != null) __obj.updateDynamic("hook")(hook)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns)
    if (on != null) __obj.updateDynamic("on")(on)
    if (props != null) __obj.updateDynamic("props")(props)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[VNodeData]
  }
}

