package typings.rcTreeSelect.contextMod

import typings.rcTree.interfaceMod.IconType
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.LegacyDataNode
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextProps extends js.Object {
  var checkable: Boolean | ReactNode = js.native
  var checkedKeys: js.Array[Key] = js.native
  var halfCheckedKeys: js.Array[Key] = js.native
  var showTreeIcon: Boolean = js.native
  var switcherIcon: IconType = js.native
  var treeDefaultExpandAll: Boolean = js.native
  var treeDefaultExpandedKeys: js.Array[Key] = js.native
  var treeExpandedKeys: js.Array[Key] = js.native
  var treeIcon: IconType = js.native
  var treeLine: Boolean = js.native
  var treeLoadedKeys: js.Array[Key] = js.native
  var treeMotion: js.Any = js.native
  var treeNodeFilterProp: String = js.native
  def loadData(treeNode: LegacyDataNode): js.Promise[_] = js.native
  def onTreeExpand(keys: js.Array[Key]): Unit = js.native
  def onTreeLoad(loadedKeys: js.Array[Key]): Unit = js.native
}

object ContextProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[Key],
    halfCheckedKeys: js.Array[Key],
    loadData: LegacyDataNode => js.Promise[_],
    onTreeExpand: js.Array[Key] => Unit,
    onTreeLoad: js.Array[Key] => Unit,
    showTreeIcon: Boolean,
    treeDefaultExpandAll: Boolean,
    treeDefaultExpandedKeys: js.Array[Key],
    treeExpandedKeys: js.Array[Key],
    treeLine: Boolean,
    treeLoadedKeys: js.Array[Key],
    treeMotion: js.Any,
    treeNodeFilterProp: String
  ): ContextProps = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onTreeExpand = js.Any.fromFunction1(onTreeExpand), onTreeLoad = js.Any.fromFunction1(onTreeLoad), showTreeIcon = showTreeIcon.asInstanceOf[js.Any], treeDefaultExpandAll = treeDefaultExpandAll.asInstanceOf[js.Any], treeDefaultExpandedKeys = treeDefaultExpandedKeys.asInstanceOf[js.Any], treeExpandedKeys = treeExpandedKeys.asInstanceOf[js.Any], treeLine = treeLine.asInstanceOf[js.Any], treeLoadedKeys = treeLoadedKeys.asInstanceOf[js.Any], treeMotion = treeMotion.asInstanceOf[js.Any], treeNodeFilterProp = treeNodeFilterProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextProps]
  }
  @scala.inline
  implicit class ContextPropsOps[Self <: ContextProps] (val x: Self) extends AnyVal {
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
    def setCheckedKeysVarargs(value: Key*): Self = this.set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def setCheckedKeys(value: js.Array[Key]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalfCheckedKeysVarargs(value: Key*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[Key]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadData(value: LegacyDataNode => js.Promise[_]): Self = this.set("loadData", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTreeExpand(value: js.Array[Key] => Unit): Self = this.set("onTreeExpand", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTreeLoad(value: js.Array[Key] => Unit): Self = this.set("onTreeLoad", js.Any.fromFunction1(value))
    @scala.inline
    def setShowTreeIcon(value: Boolean): Self = this.set("showTreeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeDefaultExpandAll(value: Boolean): Self = this.set("treeDefaultExpandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeDefaultExpandedKeysVarargs(value: Key*): Self = this.set("treeDefaultExpandedKeys", js.Array(value :_*))
    @scala.inline
    def setTreeDefaultExpandedKeys(value: js.Array[Key]): Self = this.set("treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeExpandedKeysVarargs(value: Key*): Self = this.set("treeExpandedKeys", js.Array(value :_*))
    @scala.inline
    def setTreeExpandedKeys(value: js.Array[Key]): Self = this.set("treeExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeLine(value: Boolean): Self = this.set("treeLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeLoadedKeysVarargs(value: Key*): Self = this.set("treeLoadedKeys", js.Array(value :_*))
    @scala.inline
    def setTreeLoadedKeys(value: js.Array[Key]): Self = this.set("treeLoadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeMotion(value: js.Any): Self = this.set("treeMotion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeNodeFilterProp(value: String): Self = this.set("treeNodeFilterProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckable(value: Boolean | ReactNode): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    @scala.inline
    def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = this.set("switcherIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setSwitcherIcon(value: IconType): Self = this.set("switcherIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitcherIcon: Self = this.set("switcherIcon", js.undefined)
    @scala.inline
    def setTreeIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = this.set("treeIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setTreeIcon(value: IconType): Self = this.set("treeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeIcon: Self = this.set("treeIcon", js.undefined)
  }
  
}

