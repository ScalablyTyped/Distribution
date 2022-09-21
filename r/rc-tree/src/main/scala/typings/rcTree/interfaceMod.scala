package typings.rcTree

import typings.rcTree.anon.Active
import typings.rcTree.anon.FieldDataNodekeystringnum
import typings.rcTree.anon.IsTreeNode
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  trait BasicDataNode extends StObject {
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    /** Set style of TreeNode. This is not recommend if you don't have any force requirement */
    var className: js.UndefOr[String] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[IconType] = js.undefined
    
    var isLeaf: js.UndefOr[Boolean] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[IconType] = js.undefined
  }
  object BasicDataNode {
    
    inline def apply(): BasicDataNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicDataNode]
    }
    
    extension [Self <: BasicDataNode](x: Self) {
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-tree.rc-tree/es/interface.Entity, 'node' | 'parent' | 'children'> */
  trait DataEntity[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var children: js.UndefOr[js.Array[DataEntity[TreeDataType]]] = js.undefined
    
    var index: Double
    
    var key: Key
    
    var level: Double
    
    var node: TreeDataType
    
    var nodes: js.Array[TreeDataType]
    
    var parent: js.UndefOr[DataEntity[TreeDataType]] = js.undefined
    
    var pos: String
  }
  object DataEntity {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](
      index: Double,
      key: Key,
      level: Double,
      node: TreeDataType,
      nodes: js.Array[TreeDataType],
      pos: String
    ): DataEntity[TreeDataType] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataEntity[TreeDataType]]
    }
    
    extension [Self <: DataEntity[?], TreeDataType /* <: BasicDataNode */](x: Self & DataEntity[TreeDataType]) {
      
      inline def setChildren(value: js.Array[DataEntity[TreeDataType]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: DataEntity[TreeDataType]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNode(value: TreeDataType): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[TreeDataType]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: TreeDataType*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setParent(value: DataEntity[TreeDataType]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined rc-tree.rc-tree/es/interface.FieldDataNode<{  key :string | number,   title :react.react.ReactNode | (data : rc-tree.rc-tree/es/interface.DataNode): react.react.ReactNode | undefined}, 'children'> */
  trait DataNode extends StObject {
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Array[FieldDataNodekeystringnum]] = js.undefined
    
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
    
    var title: js.UndefOr[ReactNode | (js.Function1[/* data */ this.type, ReactNode])] = js.undefined
  }
  object DataNode {
    
    inline def apply(key: String | Double): DataNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataNode]
    }
    
    extension [Self <: DataNode](x: Self) {
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setChildren(value: js.Array[FieldDataNodekeystringnum]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: FieldDataNodekeystringnum*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setTitle(value: ReactNode | (js.Function1[DataNode, ReactNode])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: DataNode => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcTree.rcTreeStrings.ltr
    - typings.rcTree.rcTreeStrings.rtl
    - scala.Unit
  */
  type Direction = js.UndefOr[_Direction]
  
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
      
      inline def setChildrenVarargs(value: Entity*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNode(value: NodeElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Entity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  type EventDataNode[TreeDataType] = Active & TreeDataType & BasicDataNode
  
  type FieldDataNode[T, ChildFieldName /* <: String */] = BasicDataNode & T & (Partial[Record[ChildFieldName, js.Array[Any]]])
  
  trait FieldNames extends StObject {
    
    /** @private Internal usage for `rc-tree-select`, safe to remove if no need */
    var _title: js.UndefOr[js.Array[String]] = js.undefined
    
    var children: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object FieldNames {
    
    inline def apply(): FieldNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNames]
    }
    
    extension [Self <: FieldNames](x: Self) {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def set_title(value: js.Array[String]): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
      
      inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
      
      inline def set_titleVarargs(value: String*): Self = StObject.set(x, "_title", js.Array(value*))
    }
  }
  
  trait FlattenNode[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var children: js.Array[FlattenNode[TreeDataType]]
    
    var data: TreeDataType
    
    var isEnd: js.Array[Boolean]
    
    var isStart: js.Array[Boolean]
    
    var key: Key
    
    var parent: FlattenNode[TreeDataType] | Null
    
    var pos: String
    
    var title: ReactNode
  }
  object FlattenNode {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](
      children: js.Array[FlattenNode[TreeDataType]],
      data: TreeDataType,
      isEnd: js.Array[Boolean],
      isStart: js.Array[Boolean],
      key: Key,
      pos: String
    ): FlattenNode[TreeDataType] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], parent = null)
      __obj.asInstanceOf[FlattenNode[TreeDataType]]
    }
    
    extension [Self <: FlattenNode[?], TreeDataType /* <: BasicDataNode */](x: Self & FlattenNode[TreeDataType]) {
      
      inline def setChildren(value: js.Array[FlattenNode[TreeDataType]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: FlattenNode[TreeDataType]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: TreeDataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      inline def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value*))
      
      inline def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
      
      inline def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value*))
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setParent(value: FlattenNode[TreeDataType]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type GetCheckDisabled[RecordType] = js.Function1[/* record */ RecordType, Boolean]
  
  type GetKey[RecordType] = js.Function2[/* record */ RecordType, /* index */ js.UndefOr[Double], Key]
  
  type IconType = ReactNode | (js.Function1[/* props */ TreeNodeProps[DataNode], ReactNode])
  
  type Key = String | Double
  
  trait NodeElement
    extends StObject
       with ReactElement {
    
    var selectHandle: js.UndefOr[HTMLSpanElement] = js.undefined
    
    @JSName("type")
    var type_NodeElement: IsTreeNode
  }
  object NodeElement {
    
    inline def apply(props: Any, `type`: IsTreeNode): NodeElement = {
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
  trait NodeInstance[TreeDataType /* <: BasicDataNode */]
    extends Component[TreeNodeProps[TreeDataType], js.Object, Any] {
    
    var selectHandle: js.UndefOr[HTMLSpanElement] = js.native
  }
  
  trait _Direction extends StObject
}
