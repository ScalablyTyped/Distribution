package typings.rcTree

import typings.rcTree.anon.IsTreeNode
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  /* Inlined parent std.Omit<rc-tree.rc-tree/es/interface.Entity, 'node' | 'parent' | 'children'> */
  trait DataEntity extends StObject {
    
    var children: js.UndefOr[js.Array[DataEntity]] = js.undefined
    
    var index: Double
    
    var key: Key
    
    var level: Double
    
    var node: DataNode
    
    var parent: js.UndefOr[DataEntity] = js.undefined
    
    var pos: String
  }
  object DataEntity {
    
    inline def apply(index: Double, key: Key, level: Double, node: DataNode, pos: String): DataEntity = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataEntity]
    }
    
    extension [Self <: DataEntity](x: Self) {
      
      inline def setChildren(value: js.Array[DataEntity]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: DataEntity*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNode(value: DataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParent(value: DataEntity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataNode extends StObject {
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Array[DataNode]] = js.undefined
    
    /** Set style of TreeNode. This is not recommend if you don't have any force requirement */
    var className: js.UndefOr[String] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[IconType] = js.undefined
    
    var isLeaf: js.UndefOr[Boolean] = js.undefined
    
    var key: String | Double
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[IconType] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object DataNode {
    
    inline def apply(key: String | Double): DataNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataNode]
    }
    
    extension [Self <: DataNode](x: Self) {
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setChildren(value: js.Array[DataNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: DataNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Entity extends StObject {
    
    var children: js.UndefOr[js.Array[Entity]] = js.undefined
    
    var index: Double
    
    var key: Key
    
    var node: NodeElement
    
    var parent: js.UndefOr[Entity] = js.undefined
    
    var pos: String
  }
  object Entity {
    
    inline def apply(index: Double, key: Key, node: NodeElement, pos: String): Entity = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    extension [Self <: Entity](x: Self) {
      
      inline def setChildren(value: js.Array[Entity]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Entity*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNode(value: NodeElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Entity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventDataNode
    extends StObject
       with DataNode {
    
    var active: Boolean
    
    var checked: Boolean
    
    var dragOver: Boolean
    
    var dragOverGapBottom: Boolean
    
    var dragOverGapTop: Boolean
    
    var expanded: Boolean
    
    var halfChecked: Boolean
    
    var loaded: Boolean
    
    var loading: Boolean
    
    var pos: String
    
    var selected: Boolean
  }
  object EventDataNode {
    
    inline def apply(
      active: Boolean,
      checked: Boolean,
      dragOver: Boolean,
      dragOverGapBottom: Boolean,
      dragOverGapTop: Boolean,
      expanded: Boolean,
      halfChecked: Boolean,
      key: String | Double,
      loaded: Boolean,
      loading: Boolean,
      pos: String,
      selected: Boolean
    ): EventDataNode = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], dragOver = dragOver.asInstanceOf[js.Any], dragOverGapBottom = dragOverGapBottom.asInstanceOf[js.Any], dragOverGapTop = dragOverGapTop.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDataNode]
    }
    
    extension [Self <: EventDataNode](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlattenNode extends StObject {
    
    var children: js.Array[FlattenNode]
    
    var data: DataNode
    
    var isEnd: js.Array[Boolean]
    
    var isStart: js.Array[Boolean]
    
    var parent: FlattenNode | Null
    
    var pos: String
  }
  object FlattenNode {
    
    inline def apply(
      children: js.Array[FlattenNode],
      data: DataNode,
      isEnd: js.Array[Boolean],
      isStart: js.Array[Boolean],
      pos: String
    ): FlattenNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], parent = null)
      __obj.asInstanceOf[FlattenNode]
    }
    
    extension [Self <: FlattenNode](x: Self) {
      
      inline def setChildren(value: js.Array[FlattenNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: FlattenNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setData(value: DataNode): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      inline def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value :_*))
      
      inline def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
      
      inline def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value :_*))
      
      inline def setParent(value: FlattenNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  type GetCheckDisabled[RecordType] = js.Function1[/* record */ RecordType, Boolean]
  
  type GetKey[RecordType] = js.Function2[/* record */ RecordType, /* index */ js.UndefOr[Double], Key]
  
  type IconType = ReactNode | (js.Function1[/* props */ TreeNodeProps, ReactNode])
  
  type Key = String | Double
  
  trait NodeElement
    extends StObject
       with ReactElement {
    
    var selectHandle: js.UndefOr[HTMLSpanElement] = js.undefined
    
    @JSName("type")
    var type_NodeElement: IsTreeNode
  }
  object NodeElement {
    
    inline def apply(props: js.Any, `type`: IsTreeNode): NodeElement = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeElement]
    }
    
    extension [Self <: NodeElement](x: Self) {
      
      inline def setSelectHandle(value: HTMLSpanElement): Self = StObject.set(x, "selectHandle", value.asInstanceOf[js.Any])
      
      inline def setSelectHandleUndefined: Self = StObject.set(x, "selectHandle", js.undefined)
      
      inline def setType(value: IsTreeNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeInstance
    extends Component[TreeNodeProps, js.Object, js.Any] {
    
    var selectHandle: js.UndefOr[HTMLSpanElement] = js.native
  }
  
  type ScrollTo = js.Function1[/* scroll */ typings.rcTree.anon.Key, Unit]
}
