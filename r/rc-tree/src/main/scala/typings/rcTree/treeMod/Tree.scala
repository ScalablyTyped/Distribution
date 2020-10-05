package typings.rcTree.treeMod

import typings.rcTree.anon.CheckedKeys
import typings.rcTree.anon.PartialTreeState
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
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tree
  extends Component[TreeProps, TreeState, js.Any] {
  var delayedDragEnterLogic: Record[Key, Double] = js.native
  var dragNode: NodeInstance = js.native
  var listRef: RefObject[NodeListRef] = js.native
  var onBlur: FocusEventHandler[HTMLDivElement] = js.native
  var onFocus: FocusEventHandler[HTMLDivElement] = js.native
  var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  var scrollTo: ScrollTo = js.native
  def cleanDragState(): Unit = js.native
  def getActiveItem(): FlattenNode = js.native
  def getTreeNodeRequiredProps(): CheckedKeys = js.native
  def offsetActiveKey(offset: Double): Unit = js.native
  def onActiveChange(newActiveKey: Key): Unit = js.native
  def onListChangeEnd(): Unit = js.native
  def onListChangeStart(): Unit = js.native
  def onNodeCheck(e: MouseEvent[HTMLDivElement, NativeMouseEvent], treeNode: EventDataNode, checked: Boolean): Unit = js.native
  def onNodeClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent], treeNode: EventDataNode): Unit = js.native
  def onNodeContextMenu(event: MouseEvent[HTMLDivElement, NativeMouseEvent], node: EventDataNode): Unit = js.native
  def onNodeDoubleClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent], treeNode: EventDataNode): Unit = js.native
  def onNodeDragEnd(event: MouseEvent[HTMLDivElement, NativeMouseEvent], node: NodeInstance): Unit = js.native
  /**
    * [Legacy] Select handler is less small than node,
    * so that this will trigger when drag enter node or select handler.
    * This is a little tricky if customize css without padding.
    * Better for use mouse move event to refresh drag state.
    * But let's just keep it to avoid event trigger logic change.
    */
  def onNodeDragEnter(event: MouseEvent[HTMLDivElement, NativeMouseEvent], node: NodeInstance): Unit = js.native
  def onNodeDragLeave(event: MouseEvent[HTMLDivElement, NativeMouseEvent], node: NodeInstance): Unit = js.native
  def onNodeDragOver(event: MouseEvent[HTMLDivElement, NativeMouseEvent], node: NodeInstance): Unit = js.native
  def onNodeDragStart(event: MouseEvent[HTMLDivElement, NativeMouseEvent], node: NodeInstance): Unit = js.native
  def onNodeDrop(event: MouseEvent[HTMLDivElement, NativeMouseEvent], node: NodeInstance): Unit = js.native
  def onNodeExpand(e: MouseEvent[HTMLDivElement, NativeMouseEvent], treeNode: EventDataNode): Unit = js.native
  def onNodeLoad(treeNode: EventDataNode): js.Promise[_] = js.native
  def onNodeMouseEnter(event: MouseEvent[HTMLDivElement, NativeMouseEvent], node: EventDataNode): Unit = js.native
  def onNodeMouseLeave(event: MouseEvent[HTMLDivElement, NativeMouseEvent], node: EventDataNode): Unit = js.native
  def onNodeSelect(e: MouseEvent[HTMLDivElement, NativeMouseEvent], treeNode: EventDataNode): Unit = js.native
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

