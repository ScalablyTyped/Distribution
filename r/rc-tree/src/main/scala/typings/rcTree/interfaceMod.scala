package typings.rcTree

import org.scalablytyped.runtime.StringDictionary
import typings.rcTree.anon.IsTreeNode
import typings.rcTree.anon.ReadonlyTreeNodeProps
import typings.rcTree.anon.ReadonlyTreeNodePropsRead
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.CSSProperties
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.std.Error
import typings.std.HTMLSpanElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  /* Inlined parent std.Omit<rc-tree.rc-tree/es/interface.Entity, 'node' | 'parent' | 'children'> */
  @js.native
  trait DataEntity extends StObject {
    
    var children: js.UndefOr[js.Array[DataEntity]] = js.native
    
    var index: Double = js.native
    
    var key: Key = js.native
    
    var level: Double = js.native
    
    var node: DataNode = js.native
    
    var parent: js.UndefOr[DataEntity] = js.native
    
    var pos: String = js.native
  }
  object DataEntity {
    
    @scala.inline
    def apply(index: Double, key: Key, level: Double, node: DataNode, pos: String): DataEntity = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataEntity]
    }
    
    @scala.inline
    implicit class DataEntityMutableBuilder[Self <: DataEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[DataEntity]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: DataEntity*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: DataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: DataEntity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataNode extends StObject {
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[js.Array[DataNode]] = js.native
    
    /** Set style of TreeNode. This is not recommend if you don't have any force requirement */
    var className: js.UndefOr[String] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[IconType] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var key: String | Double = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[IconType] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
  }
  object DataNode {
    
    @scala.inline
    def apply(key: String | Double): DataNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataNode]
    }
    
    @scala.inline
    implicit class DataNodeMutableBuilder[Self <: DataNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[DataNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: DataNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Entity extends StObject {
    
    var children: js.UndefOr[js.Array[Entity]] = js.native
    
    var index: Double = js.native
    
    var key: Key = js.native
    
    var node: NodeElement = js.native
    
    var parent: js.UndefOr[Entity] = js.native
    
    var pos: String = js.native
  }
  object Entity {
    
    @scala.inline
    def apply(index: Double, key: Key, node: NodeElement, pos: String): Entity = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    @scala.inline
    implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[Entity]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: Entity*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: NodeElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Entity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventDataNode extends DataNode {
    
    var active: Boolean = js.native
    
    var checked: Boolean = js.native
    
    var dragOver: Boolean = js.native
    
    var dragOverGapBottom: Boolean = js.native
    
    var dragOverGapTop: Boolean = js.native
    
    var expanded: Boolean = js.native
    
    var halfChecked: Boolean = js.native
    
    var loaded: Boolean = js.native
    
    var loading: Boolean = js.native
    
    var pos: String = js.native
    
    var selected: Boolean = js.native
  }
  object EventDataNode {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class EventDataNodeMutableBuilder[Self <: EventDataNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FlattenNode extends StObject {
    
    var children: js.Array[FlattenNode] = js.native
    
    var data: DataNode = js.native
    
    var isEnd: js.Array[Boolean] = js.native
    
    var isStart: js.Array[Boolean] = js.native
    
    var parent: FlattenNode | Null = js.native
    
    var pos: String = js.native
  }
  object FlattenNode {
    
    @scala.inline
    def apply(
      children: js.Array[FlattenNode],
      data: DataNode,
      isEnd: js.Array[Boolean],
      isStart: js.Array[Boolean],
      pos: String
    ): FlattenNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenNode]
    }
    
    @scala.inline
    implicit class FlattenNodeMutableBuilder[Self <: FlattenNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[FlattenNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: FlattenNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: DataNode): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value :_*))
      
      @scala.inline
      def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value :_*))
      
      @scala.inline
      def setParent(value: FlattenNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  type GetCheckDisabled[RecordType] = js.Function1[/* record */ RecordType, Boolean]
  
  type GetKey[RecordType] = js.Function2[/* record */ RecordType, /* index */ js.UndefOr[Double], Key]
  
  type IconType = ReactNode | (js.Function1[/* props */ TreeNodeProps, ReactNode])
  
  type Key = String | Double
  
  /* Inlined react.react.ReactElement & {  selectHandle :std.HTMLSpanElement | undefined,   type :{  isTreeNode :boolean}} */
  @js.native
  trait NodeElement extends StObject {
    
    var key: typings.react.mod.Key | Null = js.native
    
    var props: js.Any = js.native
    
    var selectHandle: js.UndefOr[HTMLSpanElement] = js.native
    
    var `type`: js.Any with IsTreeNode = js.native
  }
  object NodeElement {
    
    @scala.inline
    def apply(props: js.Any, `type`: js.Any with IsTreeNode): NodeElement = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeElement]
    }
    
    @scala.inline
    implicit class NodeElementMutableBuilder[Self <: NodeElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectHandle(value: HTMLSpanElement): Self = StObject.set(x, "selectHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectHandleUndefined: Self = StObject.set(x, "selectHandle", js.undefined)
      
      @scala.inline
      def setType(value: js.Any with IsTreeNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.Component<rc-tree.rc-tree/es/TreeNode.TreeNodeProps, {}, any> & {  selectHandle :std.HTMLSpanElement | undefined} */
  @js.native
  trait NodeInstance extends StObject {
    
    /**
      * Called immediately before mounting occurs, and before `Component#render`.
      * Avoid introducing any side-effects or subscriptions in this method.
      *
      * This method will not stop working in React 17.
      *
      * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
      * prevents this from being invoked.
      *
      * @deprecated 16.3, use componentDidMount or the constructor instead
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#initializing-state
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
      */
    var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called when the component may be receiving new props.
      * React may call this even if props have not changed, so be sure to compare new and existing
      * props if you only want to handle changes.
      *
      * Calling `Component#setState` generally does not trigger this method.
      *
      * This method will not stop working in React 17.
      *
      * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
      * prevents this from being invoked.
      *
      * @deprecated 16.3, use static getDerivedStateFromProps instead
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#updating-state-based-on-props
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
      */
    var UNSAFE_componentWillReceiveProps: js.UndefOr[
        js.Function2[/* nextProps */ ReadonlyTreeNodeProps, /* nextContext */ js.Any, Unit]
      ] = js.native
    
    /**
      * Called immediately before rendering when new props or state is received. Not called for the initial render.
      *
      * Note: You cannot call `Component#setState` here.
      *
      * This method will not stop working in React 17.
      *
      * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
      * prevents this from being invoked.
      *
      * @deprecated 16.3, use getSnapshotBeforeUpdate instead
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#reading-dom-properties-before-an-update
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
      */
    var UNSAFE_componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyTreeNodeProps, 
          /* nextState */ js.Object, 
          /* nextContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    /**
      * Catches exceptions generated in descendant components. Unhandled exceptions will cause
      * the entire component tree to unmount.
      */
    var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
    
    /**
      * Called immediately after a component is mounted. Setting state here will trigger re-rendering.
      */
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called immediately after updating occurs. Not called for the initial render.
      *
      * The snapshot is only present if getSnapshotBeforeUpdate is present and returns non-null.
      */
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ ReadonlyTreeNodeProps, 
          /* prevState */ js.Object, 
          /* snapshot */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /**
      * Called immediately before mounting occurs, and before `Component#render`.
      * Avoid introducing any side-effects or subscriptions in this method.
      *
      * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
      * prevents this from being invoked.
      *
      * @deprecated 16.3, use componentDidMount or the constructor instead; will stop working in React 17
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#initializing-state
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
      */
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called when the component may be receiving new props.
      * React may call this even if props have not changed, so be sure to compare new and existing
      * props if you only want to handle changes.
      *
      * Calling `Component#setState` generally does not trigger this method.
      *
      * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
      * prevents this from being invoked.
      *
      * @deprecated 16.3, use static getDerivedStateFromProps instead; will stop working in React 17
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#updating-state-based-on-props
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
      */
    var componentWillReceiveProps: js.UndefOr[
        js.Function2[/* nextProps */ ReadonlyTreeNodeProps, /* nextContext */ js.Any, Unit]
      ] = js.native
    
    /**
      * Called immediately before a component is destroyed. Perform any necessary cleanup in this method, such as
      * cancelled network requests, or cleaning up any DOM elements created in `componentDidMount`.
      */
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called immediately before rendering when new props or state is received. Not called for the initial render.
      *
      * Note: You cannot call `Component#setState` here.
      *
      * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
      * prevents this from being invoked.
      *
      * @deprecated 16.3, use getSnapshotBeforeUpdate instead; will stop working in React 17
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#reading-dom-properties-before-an-update
      * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
      */
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyTreeNodeProps, 
          /* nextState */ js.Object, 
          /* nextContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    /**
      * If using the new style context, re-declare this in your class to be the
      * `React.ContextType` of your `static contextType`.
      * Should be used with type annotation or static contextType.
      *
      * ```ts
      * static contextType = MyContext
      * // For TS pre-3.7:
      * context!: React.ContextType<typeof MyContext>
      * // For TS 3.7 and above:
      * declare context: React.ContextType<typeof MyContext>
      * ```
      *
      * @see https://reactjs.org/docs/context.html
      */
    // TODO (TypeScript 3.0): unknown
    var context: js.Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Runs before React applies the result of `render` to the document, and
      * returns an object to be given to componentDidUpdate. Useful for saving
      * things such as scroll position before `render` causes changes to it.
      *
      * Note: the presence of getSnapshotBeforeUpdate prevents any of the deprecated
      * lifecycle events from running.
      */
    var getSnapshotBeforeUpdate: js.UndefOr[
        js.Function2[/* prevProps */ ReadonlyTreeNodeProps, /* prevState */ js.Object, _ | Null]
      ] = js.native
    
    // React.Props<T> is now deprecated, which means that the `children`
    // property is not available on `P` by default, even though you can
    // always pass children as variadic arguments to `createElement`.
    // In the future, if we can define its call signature conditionally
    // on the existence of `children` in `P`, then we should remove this.
    val props: ReadonlyTreeNodePropsRead = js.native
    
    /**
      * @deprecated
      * https://reactjs.org/docs/refs-and-the-dom.html#legacy-api-string-refs
      */
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): ReactNode = js.native
    
    var selectHandle: js.UndefOr[HTMLSpanElement] = js.native
    
    // We MUST keep setState() as a unified signature because it allows proper checking of the method return type.
    // See: https://github.com/DefinitelyTyped/DefinitelyTyped/issues/18365#issuecomment-351013257
    // Also, the ` | S` allows intellisense to not be dumbisense
    def setState[K /* <: /* keyof {} */ String */](): Unit = js.native
    def setState[K /* <: /* keyof {} */ String */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* props */ ReadonlyTreeNodeProps, 
          (Pick[js.Object, K]) | js.Object | Null
        ]
    ): Unit = js.native
    def setState[K /* <: /* keyof {} */ String */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* props */ ReadonlyTreeNodeProps, 
          (Pick[js.Object, K]) | js.Object | Null
        ],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def setState[K /* <: /* keyof {} */ String */](state: js.Object): Unit = js.native
    def setState[K /* <: /* keyof {} */ String */](state: js.Object, callback: js.Function0[Unit]): Unit = js.native
    def setState[K /* <: /* keyof {} */ String */](state: Null, callback: js.Function0[Unit]): Unit = js.native
    def setState[K /* <: /* keyof {} */ String */](state: Pick[js.Object, K]): Unit = js.native
    def setState[K /* <: /* keyof {} */ String */](state: Pick[js.Object, K], callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Called to determine whether the change in props and state should trigger a re-render.
      *
      * `Component` always returns true.
      * `PureComponent` implements a shallow comparison on props and state and returns true if any
      * props or states have changed.
      *
      * If false is returned, `Component#render`, `componentWillUpdate`
      * and `componentDidUpdate` will not be called.
      */
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyTreeNodeProps, 
          /* nextState */ js.Object, 
          /* nextContext */ js.Any, 
          Boolean
        ]
      ] = js.native
  }
  
  type ScrollTo = js.Function1[/* scroll */ typings.rcTree.anon.Key, Unit]
}
