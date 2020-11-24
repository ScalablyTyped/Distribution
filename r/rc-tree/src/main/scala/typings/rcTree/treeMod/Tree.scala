package typings.rcTree.treeMod

import typings.rcTree.anon.CheckedKeys
import typings.rcTree.anon.PartialTreeState
import typings.rcTree.contextTypesMod.NodeDragEventHandler
import typings.rcTree.contextTypesMod.NodeMouseEventHandler
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.interfaceMod.Key
import typings.rcTree.interfaceMod.NodeInstance
import typings.rcTree.interfaceMod.ScrollTo
import typings.rcTree.nodeListMod.NodeListRef
import typings.react.mod.Component
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tree
  extends Component[TreeProps, TreeState, js.Any] {
  
  def cleanDragState(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTree(): Unit = js.native
  
  var delayedDragEnterLogic: Record[Key, Double] = js.native
  
  var destroyed: Boolean = js.native
  
  var dragNode: NodeInstance = js.native
  
  def getActiveItem(): FlattenNode = js.native
  
  def getTreeNodeRequiredProps(): CheckedKeys = js.native
  
  var listRef: RefObject[NodeListRef] = js.native
  
  def offsetActiveKey(offset: Double): Unit = js.native
  
  def onActiveChange(newActiveKey: Key): Unit = js.native
  
  var onBlur: FocusEventHandler[HTMLDivElement] = js.native
  
  var onFocus: FocusEventHandler[HTMLDivElement] = js.native
  
  var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  
  def onListChangeEnd(): Unit = js.native
  
  def onListChangeStart(): Unit = js.native
  
  def onNodeCheck(e: MouseEvent[HTMLSpanElement, NativeMouseEvent], treeNode: EventDataNode, checked: Boolean): Unit = js.native
  
  var onNodeClick: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var onNodeContextMenu: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var onNodeDoubleClick: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var onNodeDragEnd: NodeDragEventHandler[HTMLDivElement] = js.native
  
  /**
    * [Legacy] Select handler is less small than node,
    * so that this will trigger when drag enter node or select handler.
    * This is a little tricky if customize css without padding.
    * Better for use mouse move event to refresh drag state.
    * But let's just keep it to avoid event trigger logic change.
    */
  var onNodeDragEnter: NodeDragEventHandler[HTMLDivElement] = js.native
  
  var onNodeDragLeave: NodeDragEventHandler[HTMLDivElement] = js.native
  
  var onNodeDragOver: NodeDragEventHandler[HTMLDivElement] = js.native
  
  var onNodeDragStart: NodeDragEventHandler[HTMLDivElement] = js.native
  
  var onNodeDrop: NodeDragEventHandler[HTMLDivElement] = js.native
  
  def onNodeExpand(e: MouseEvent[HTMLDivElement, NativeMouseEvent], treeNode: EventDataNode): Unit = js.native
  
  def onNodeLoad(treeNode: EventDataNode): js.Promise[_] = js.native
  
  var onNodeMouseEnter: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var onNodeMouseLeave: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var onNodeSelect: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var scrollTo: ScrollTo = js.native
  
  /** Set uncontrolled `expandedKeys`. This will also auto update `flattenNodes`. */
  def setExpandedKeys(expandedKeys: js.Array[Key]): Unit = js.native
  
  /**
    * Only update the value which is not in props
    */
  def setUncontrolledState(state: PartialTreeState): Unit = js.native
  def setUncontrolledState(state: PartialTreeState, atomic: js.UndefOr[scala.Nothing], forceState: PartialTreeState): Unit = js.native
  def setUncontrolledState(state: PartialTreeState, atomic: Boolean): Unit = js.native
  def setUncontrolledState(state: PartialTreeState, atomic: Boolean, forceState: PartialTreeState): Unit = js.native
}
