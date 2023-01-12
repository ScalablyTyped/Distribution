package typings.splitpanes.mod

import typings.std.Event
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitPaneMethods extends StObject {
  
  def addSplitter(paneIndex: Double, nextPaneNode: Node, isVeryFirst: Boolean): Unit
  
  def bindEvents(): Unit
  
  def calculatePanesSize(drag: CoordinateType): Unit
  
  def checkSplitpanesNodes(): Unit
  
  def doPushOtherPanes(sums: SumsType, dragPercent: Double): Null | js.Object
  
  def equalize(): Unit
  
  def equalizeAfterAddOrRemove(arg0: ChangedPaneType): Unit
  
  def findPrevExpandedPane(splitterIndex: Double): Pane | js.Object
  
  def getCurrentDragPercentage(drag: CoordinateType): Double
  
  def getCurrentMouseDrag(event: Event): CoordinateType
  
  def initialPanesSizing(): Unit
  
  def onMouseDown(event: Event, splitterIndex: Double): Unit
  
  def onMouseMove(event: Event): Unit
  
  def onMouseUp(): Unit
  
  def onPaneAdd(pane: Pane): Unit
  
  def onPaneClick(event: Event, splitterIndex: Double): Unit
  
  def onPaneRemove(pane: Pane): Unit
  
  def onSplitterClick(event: Event, splitterIndex: Double): Unit
  
  def onSplitterDblClick(event: Event, splitterIndex: Double): Pane | Unit
  
  def readjustSizes(leftToAllocate: Double, ungrowable: js.Array[Double], unshrinkable: js.Array[Double]): Unit
  
  def redoSplitters(): Unit
  
  def removeSplitter(node: Node): Unit
  
  def requestUpdate(arg0: RequestUpdateType): Unit
  
  def resetPaneSizes(changedPanes: ChangedPaneType): Unit
  
  def sumNextPanesSize(splitterIndex: Double): Double
  
  def sumPrevPanesSize(splitterIndex: Double): Double
  
  def unbindEvents(): Unit
  
  def updatePaneComponents(): Unit
}
object SplitPaneMethods {
  
  inline def apply(
    addSplitter: (Double, Node, Boolean) => Unit,
    bindEvents: () => Unit,
    calculatePanesSize: CoordinateType => Unit,
    checkSplitpanesNodes: () => Unit,
    doPushOtherPanes: (SumsType, Double) => Null | js.Object,
    equalize: () => Unit,
    equalizeAfterAddOrRemove: ChangedPaneType => Unit,
    findPrevExpandedPane: Double => Pane | js.Object,
    getCurrentDragPercentage: CoordinateType => Double,
    getCurrentMouseDrag: Event => CoordinateType,
    initialPanesSizing: () => Unit,
    onMouseDown: (Event, Double) => Unit,
    onMouseMove: Event => Unit,
    onMouseUp: () => Unit,
    onPaneAdd: Pane => Unit,
    onPaneClick: (Event, Double) => Unit,
    onPaneRemove: Pane => Unit,
    onSplitterClick: (Event, Double) => Unit,
    onSplitterDblClick: (Event, Double) => Pane | Unit,
    readjustSizes: (Double, js.Array[Double], js.Array[Double]) => Unit,
    redoSplitters: () => Unit,
    removeSplitter: Node => Unit,
    requestUpdate: RequestUpdateType => Unit,
    resetPaneSizes: ChangedPaneType => Unit,
    sumNextPanesSize: Double => Double,
    sumPrevPanesSize: Double => Double,
    unbindEvents: () => Unit,
    updatePaneComponents: () => Unit
  ): SplitPaneMethods = {
    val __obj = js.Dynamic.literal(addSplitter = js.Any.fromFunction3(addSplitter), bindEvents = js.Any.fromFunction0(bindEvents), calculatePanesSize = js.Any.fromFunction1(calculatePanesSize), checkSplitpanesNodes = js.Any.fromFunction0(checkSplitpanesNodes), doPushOtherPanes = js.Any.fromFunction2(doPushOtherPanes), equalize = js.Any.fromFunction0(equalize), equalizeAfterAddOrRemove = js.Any.fromFunction1(equalizeAfterAddOrRemove), findPrevExpandedPane = js.Any.fromFunction1(findPrevExpandedPane), getCurrentDragPercentage = js.Any.fromFunction1(getCurrentDragPercentage), getCurrentMouseDrag = js.Any.fromFunction1(getCurrentMouseDrag), initialPanesSizing = js.Any.fromFunction0(initialPanesSizing), onMouseDown = js.Any.fromFunction2(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp), onPaneAdd = js.Any.fromFunction1(onPaneAdd), onPaneClick = js.Any.fromFunction2(onPaneClick), onPaneRemove = js.Any.fromFunction1(onPaneRemove), onSplitterClick = js.Any.fromFunction2(onSplitterClick), onSplitterDblClick = js.Any.fromFunction2(onSplitterDblClick), readjustSizes = js.Any.fromFunction3(readjustSizes), redoSplitters = js.Any.fromFunction0(redoSplitters), removeSplitter = js.Any.fromFunction1(removeSplitter), requestUpdate = js.Any.fromFunction1(requestUpdate), resetPaneSizes = js.Any.fromFunction1(resetPaneSizes), sumNextPanesSize = js.Any.fromFunction1(sumNextPanesSize), sumPrevPanesSize = js.Any.fromFunction1(sumPrevPanesSize), unbindEvents = js.Any.fromFunction0(unbindEvents), updatePaneComponents = js.Any.fromFunction0(updatePaneComponents))
    __obj.asInstanceOf[SplitPaneMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitPaneMethods] (val x: Self) extends AnyVal {
    
    inline def setAddSplitter(value: (Double, Node, Boolean) => Unit): Self = StObject.set(x, "addSplitter", js.Any.fromFunction3(value))
    
    inline def setBindEvents(value: () => Unit): Self = StObject.set(x, "bindEvents", js.Any.fromFunction0(value))
    
    inline def setCalculatePanesSize(value: CoordinateType => Unit): Self = StObject.set(x, "calculatePanesSize", js.Any.fromFunction1(value))
    
    inline def setCheckSplitpanesNodes(value: () => Unit): Self = StObject.set(x, "checkSplitpanesNodes", js.Any.fromFunction0(value))
    
    inline def setDoPushOtherPanes(value: (SumsType, Double) => Null | js.Object): Self = StObject.set(x, "doPushOtherPanes", js.Any.fromFunction2(value))
    
    inline def setEqualize(value: () => Unit): Self = StObject.set(x, "equalize", js.Any.fromFunction0(value))
    
    inline def setEqualizeAfterAddOrRemove(value: ChangedPaneType => Unit): Self = StObject.set(x, "equalizeAfterAddOrRemove", js.Any.fromFunction1(value))
    
    inline def setFindPrevExpandedPane(value: Double => Pane | js.Object): Self = StObject.set(x, "findPrevExpandedPane", js.Any.fromFunction1(value))
    
    inline def setGetCurrentDragPercentage(value: CoordinateType => Double): Self = StObject.set(x, "getCurrentDragPercentage", js.Any.fromFunction1(value))
    
    inline def setGetCurrentMouseDrag(value: Event => CoordinateType): Self = StObject.set(x, "getCurrentMouseDrag", js.Any.fromFunction1(value))
    
    inline def setInitialPanesSizing(value: () => Unit): Self = StObject.set(x, "initialPanesSizing", js.Any.fromFunction0(value))
    
    inline def setOnMouseDown(value: (Event, Double) => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
    
    inline def setOnMouseMove(value: Event => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseUp(value: () => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction0(value))
    
    inline def setOnPaneAdd(value: Pane => Unit): Self = StObject.set(x, "onPaneAdd", js.Any.fromFunction1(value))
    
    inline def setOnPaneClick(value: (Event, Double) => Unit): Self = StObject.set(x, "onPaneClick", js.Any.fromFunction2(value))
    
    inline def setOnPaneRemove(value: Pane => Unit): Self = StObject.set(x, "onPaneRemove", js.Any.fromFunction1(value))
    
    inline def setOnSplitterClick(value: (Event, Double) => Unit): Self = StObject.set(x, "onSplitterClick", js.Any.fromFunction2(value))
    
    inline def setOnSplitterDblClick(value: (Event, Double) => Pane | Unit): Self = StObject.set(x, "onSplitterDblClick", js.Any.fromFunction2(value))
    
    inline def setReadjustSizes(value: (Double, js.Array[Double], js.Array[Double]) => Unit): Self = StObject.set(x, "readjustSizes", js.Any.fromFunction3(value))
    
    inline def setRedoSplitters(value: () => Unit): Self = StObject.set(x, "redoSplitters", js.Any.fromFunction0(value))
    
    inline def setRemoveSplitter(value: Node => Unit): Self = StObject.set(x, "removeSplitter", js.Any.fromFunction1(value))
    
    inline def setRequestUpdate(value: RequestUpdateType => Unit): Self = StObject.set(x, "requestUpdate", js.Any.fromFunction1(value))
    
    inline def setResetPaneSizes(value: ChangedPaneType => Unit): Self = StObject.set(x, "resetPaneSizes", js.Any.fromFunction1(value))
    
    inline def setSumNextPanesSize(value: Double => Double): Self = StObject.set(x, "sumNextPanesSize", js.Any.fromFunction1(value))
    
    inline def setSumPrevPanesSize(value: Double => Double): Self = StObject.set(x, "sumPrevPanesSize", js.Any.fromFunction1(value))
    
    inline def setUnbindEvents(value: () => Unit): Self = StObject.set(x, "unbindEvents", js.Any.fromFunction0(value))
    
    inline def setUpdatePaneComponents(value: () => Unit): Self = StObject.set(x, "updatePaneComponents", js.Any.fromFunction0(value))
  }
}
