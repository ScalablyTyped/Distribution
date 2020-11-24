package typings.rcTree.treeNodeMod

import typings.rcTree.anon.DragNodeHighlight
import typings.rcTree.rcTreeStrings.close
import typings.rcTree.rcTreeStrings.open
import typings.react.mod.Component
import typings.react.mod.DragEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree/es/TreeNode", "InternalTreeNode")
@js.native
class InternalTreeNode ()
  extends Component[InternalTreeNodeProps, TreeNodeState, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MInternalTreeNode(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInternalTreeNode(): Unit = js.native
  
  def getNodeState(): open | close = js.native
  
  def hasChildren(): Boolean = js.native
  
  def isCheckable(): js.Object = js.native
  
  def isDisabled(): Boolean = js.native
  
  def isLeaf(): Boolean = js.native
  
  def isSelectable(): Boolean = js.native
  
  def onCheck(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
  
  def onContextMenu(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
  
  def onDragEnd(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  def onDragEnter(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  def onDragLeave(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  def onDragOver(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  def onDragStart(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  def onDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  var onExpand: MouseEventHandler[HTMLDivElement] = js.native
  
  def onMouseEnter(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
  
  def onMouseLeave(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
  
  def onSelect(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
  
  def onSelectorClick(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
  
  def onSelectorDoubleClick(e: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
  
  def renderCheckbox(): Element = js.native
  
  def renderIcon(): Element = js.native
  
  def renderSelector(): Element = js.native
  
  def renderSwitcher(): Element = js.native
  
  var selectHandle: HTMLSpanElement = js.native
  
  def setSelectHandle(node: js.Any): Unit = js.native
  
  @JSName("state")
  var state_InternalTreeNode: DragNodeHighlight = js.native
  
  def syncLoadData(props: js.Any): Unit = js.native
}
