package typings.snabbdom.vnodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.attachtoMod.AttachData
import typings.snabbdom.attributesMod.Attrs
import typings.snabbdom.classMod.Classes
import typings.snabbdom.datasetMod.Dataset
import typings.snabbdom.eventlistenersMod.On
import typings.snabbdom.heroMod.Hero
import typings.snabbdom.hooksMod.Hooks
import typings.snabbdom.propsMod.Props
import typings.snabbdom.styleMod.VNodeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNodeData
  extends /* key */ StringDictionary[js.Any] {
  var args: js.UndefOr[js.Array[_]] = js.native
  var attachData: js.UndefOr[AttachData] = js.native
  var attrs: js.UndefOr[Attrs] = js.native
  var `class`: js.UndefOr[Classes] = js.native
  var dataset: js.UndefOr[Dataset] = js.native
  var fn: js.UndefOr[js.Function0[VNode_]] = js.native
  var hero: js.UndefOr[Hero] = js.native
  var hook: js.UndefOr[Hooks] = js.native
  var key: js.UndefOr[Key] = js.native
  var ns: js.UndefOr[String] = js.native
  var on: js.UndefOr[On] = js.native
  var props: js.UndefOr[Props] = js.native
  var style: js.UndefOr[VNodeStyle] = js.native
}

object VNodeData {
  @scala.inline
  def apply(): VNodeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VNodeData]
  }
  @scala.inline
  implicit class VNodeDataOps[Self <: VNodeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setAttachData(value: AttachData): Self = this.set("attachData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachData: Self = this.set("attachData", js.undefined)
    @scala.inline
    def setAttrs(value: Attrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setClass(value: Classes): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setDataset(value: Dataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    @scala.inline
    def setFn(value: () => VNode_): Self = this.set("fn", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setHero(value: Hero): Self = this.set("hero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHero: Self = this.set("hero", js.undefined)
    @scala.inline
    def setHook(value: Hooks): Self = this.set("hook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHook: Self = this.set("hook", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
    @scala.inline
    def setOn(value: On): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setProps(value: Props): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setStyle(value: VNodeStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

