package typings.rcTree

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.interfaceMod.Key
import typings.rcTree.interfaceMod.ScrollTo
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeListMod {
  
  @JSImport("rc-tree/es/NodeList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-tree/es/NodeList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[NodeListProps & RefAttributes[NodeListRef]] = js.native
  
  @JSImport("rc-tree/es/NodeList", "MOTION_KEY")
  @js.native
  val MOTION_KEY: String = js.native
  
  @JSImport("rc-tree/es/NodeList", "MotionEntity")
  @js.native
  val MotionEntity: DataEntity = js.native
  
  inline def getMinimumRangeTransitionRange(list: js.Array[FlattenNode], virtual: Boolean, height: Double, itemHeight: Double): js.Array[FlattenNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMinimumRangeTransitionRange")(list.asInstanceOf[js.Any], virtual.asInstanceOf[js.Any], height.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode]]
  
  trait NodeListProps extends StObject {
    
    var activeItem: FlattenNode
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var checkedKeys: js.Array[Key]
    
    var data: js.Array[FlattenNode]
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dragOverNodeKey: Key
    
    var dragging: Boolean
    
    var dropPosition: Double
    
    var expandedKeys: js.Array[Key]
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var halfCheckedKeys: js.Array[Key]
    
    var height: Double
    
    var itemHeight: Double
    
    var keyEntities: Record[Key, DataEntity]
    
    var loadedKeys: js.Array[Key]
    
    var loadingKeys: js.Array[Key]
    
    var motion: js.Any
    
    def onActiveChange(key: Key): Unit
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    def onListChangeEnd(): Unit
    
    def onListChangeStart(): Unit
    
    var prefixCls: String
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selectedKeys: js.Array[Key]
    
    var style: CSSProperties
    
    var tabIndex: Double
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object NodeListProps {
    
    inline def apply(
      activeItem: FlattenNode,
      checkedKeys: js.Array[Key],
      data: js.Array[FlattenNode],
      dragOverNodeKey: Key,
      dragging: Boolean,
      dropPosition: Double,
      expandedKeys: js.Array[Key],
      halfCheckedKeys: js.Array[Key],
      height: Double,
      itemHeight: Double,
      keyEntities: Record[Key, DataEntity],
      loadedKeys: js.Array[Key],
      loadingKeys: js.Array[Key],
      motion: js.Any,
      onActiveChange: Key => Unit,
      onListChangeEnd: () => Unit,
      onListChangeStart: () => Unit,
      prefixCls: String,
      selectedKeys: js.Array[Key],
      style: CSSProperties,
      tabIndex: Double
    ): NodeListProps = {
      val __obj = js.Dynamic.literal(activeItem = activeItem.asInstanceOf[js.Any], checkedKeys = checkedKeys.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], onActiveChange = js.Any.fromFunction1(onActiveChange), onListChangeEnd = js.Any.fromFunction0(onListChangeEnd), onListChangeStart = js.Any.fromFunction0(onListChangeStart), prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeListProps]
    }
    
    extension [Self <: NodeListProps](x: Self) {
      
      inline def setActiveItem(value: FlattenNode): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      inline def setData(value: js.Array[FlattenNode]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: FlattenNode*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setKeyEntities(value: Record[Key, DataEntity]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      inline def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      inline def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
      
      inline def setLoadingKeys(value: js.Array[Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
      
      inline def setLoadingKeysVarargs(value: Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
      
      inline def setMotion(value: js.Any): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setOnActiveChange(value: Key => Unit): Self = StObject.set(x, "onActiveChange", js.Any.fromFunction1(value))
      
      inline def setOnBlur(value: FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnListChangeEnd(value: () => Unit): Self = StObject.set(x, "onListChangeEnd", js.Any.fromFunction0(value))
      
      inline def setOnListChangeStart(value: () => Unit): Self = StObject.set(x, "onListChangeStart", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  trait NodeListRef extends StObject {
    
    var scrollTo: ScrollTo
  }
  object NodeListRef {
    
    inline def apply(scrollTo: /* scroll */ typings.rcTree.anon.Key => Unit): NodeListRef = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[NodeListRef]
    }
    
    extension [Self <: NodeListRef](x: Self) {
      
      inline def setScrollTo(value: /* scroll */ typings.rcTree.anon.Key => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
    }
  }
}
