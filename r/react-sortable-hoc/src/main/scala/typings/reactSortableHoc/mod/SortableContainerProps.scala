package typings.reactSortableHoc.mod

import typings.react.mod.ReactElement
import typings.reactSortableHoc.anon.Cancel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableContainerProps extends js.Object {
  
  var axis: js.UndefOr[Axis] = js.native
  
  var distance: js.UndefOr[Double] = js.native
  
  var getContainer: js.UndefOr[ContainerGetter] = js.native
  
  var getHelperDimensions: js.UndefOr[js.Function1[/* sort */ SortStart, Dimensions]] = js.native
  
  var helperClass: js.UndefOr[String] = js.native
  
  var helperContainer: js.UndefOr[HTMLElement | HelperContainerGetter] = js.native
  
  var hideSortableGhost: js.UndefOr[Boolean] = js.native
  
  var keyCodes: js.UndefOr[Cancel] = js.native
  
  var keyboardSortingTransitionDuration: js.UndefOr[Double] = js.native
  
  var lockAxis: js.UndefOr[Axis] = js.native
  
  var lockOffset: js.UndefOr[Offset | (js.Tuple2[Offset, Offset])] = js.native
  
  var lockToContainerEdges: js.UndefOr[Boolean] = js.native
  
  var onSortEnd: js.UndefOr[SortEndHandler] = js.native
  
  var onSortMove: js.UndefOr[SortMoveHandler] = js.native
  
  var onSortOver: js.UndefOr[SortOverHandler] = js.native
  
  var onSortStart: js.UndefOr[SortStartHandler] = js.native
  
  var pressDelay: js.UndefOr[Double] = js.native
  
  var pressThreshold: js.UndefOr[Double] = js.native
  
  var shouldCancelStart: js.UndefOr[js.Function1[/* event */ SortEvent | SortEventWithTag, Boolean]] = js.native
  
  var transitionDuration: js.UndefOr[Double] = js.native
  
  var updateBeforeSortStart: js.UndefOr[SortStartHandler] = js.native
  
  var useDragHandle: js.UndefOr[Boolean] = js.native
  
  var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.native
}
object SortableContainerProps {
  
  @scala.inline
  def apply(): SortableContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableContainerProps]
  }
  
  @scala.inline
  implicit class SortableContainerPropsOps[Self <: SortableContainerProps] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: Axis): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setGetContainer(value: /* element */ ReactElement => HTMLElement | js.Promise[HTMLElement]): Self = this.set("getContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    
    @scala.inline
    def setGetHelperDimensions(value: /* sort */ SortStart => Dimensions): Self = this.set("getHelperDimensions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetHelperDimensions: Self = this.set("getHelperDimensions", js.undefined)
    
    @scala.inline
    def setHelperClass(value: String): Self = this.set("helperClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelperClass: Self = this.set("helperClass", js.undefined)
    
    @scala.inline
    def setHelperContainerFunction0(value: () => HTMLElement): Self = this.set("helperContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHelperContainer(value: HTMLElement | HelperContainerGetter): Self = this.set("helperContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelperContainer: Self = this.set("helperContainer", js.undefined)
    
    @scala.inline
    def setHideSortableGhost(value: Boolean): Self = this.set("hideSortableGhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideSortableGhost: Self = this.set("hideSortableGhost", js.undefined)
    
    @scala.inline
    def setKeyCodes(value: Cancel): Self = this.set("keyCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCodes: Self = this.set("keyCodes", js.undefined)
    
    @scala.inline
    def setKeyboardSortingTransitionDuration(value: Double): Self = this.set("keyboardSortingTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardSortingTransitionDuration: Self = this.set("keyboardSortingTransitionDuration", js.undefined)
    
    @scala.inline
    def setLockAxis(value: Axis): Self = this.set("lockAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockAxis: Self = this.set("lockAxis", js.undefined)
    
    @scala.inline
    def setLockOffset(value: Offset | (js.Tuple2[Offset, Offset])): Self = this.set("lockOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockOffset: Self = this.set("lockOffset", js.undefined)
    
    @scala.inline
    def setLockToContainerEdges(value: Boolean): Self = this.set("lockToContainerEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockToContainerEdges: Self = this.set("lockToContainerEdges", js.undefined)
    
    @scala.inline
    def setOnSortEnd(value: (/* sort */ SortEnd, /* event */ SortEvent) => Unit): Self = this.set("onSortEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSortEnd: Self = this.set("onSortEnd", js.undefined)
    
    @scala.inline
    def setOnSortMove(value: /* event */ SortEvent => Unit): Self = this.set("onSortMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSortMove: Self = this.set("onSortMove", js.undefined)
    
    @scala.inline
    def setOnSortOver(value: (/* sort */ SortOver, /* event */ SortEvent) => Unit): Self = this.set("onSortOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSortOver: Self = this.set("onSortOver", js.undefined)
    
    @scala.inline
    def setOnSortStart(value: (/* sort */ SortStart, /* event */ SortEvent) => Unit): Self = this.set("onSortStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSortStart: Self = this.set("onSortStart", js.undefined)
    
    @scala.inline
    def setPressDelay(value: Double): Self = this.set("pressDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressDelay: Self = this.set("pressDelay", js.undefined)
    
    @scala.inline
    def setPressThreshold(value: Double): Self = this.set("pressThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressThreshold: Self = this.set("pressThreshold", js.undefined)
    
    @scala.inline
    def setShouldCancelStart(value: /* event */ SortEvent | SortEventWithTag => Boolean): Self = this.set("shouldCancelStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldCancelStart: Self = this.set("shouldCancelStart", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setUpdateBeforeSortStart(value: (/* sort */ SortStart, /* event */ SortEvent) => Unit): Self = this.set("updateBeforeSortStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateBeforeSortStart: Self = this.set("updateBeforeSortStart", js.undefined)
    
    @scala.inline
    def setUseDragHandle(value: Boolean): Self = this.set("useDragHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDragHandle: Self = this.set("useDragHandle", js.undefined)
    
    @scala.inline
    def setUseWindowAsScrollContainer(value: Boolean): Self = this.set("useWindowAsScrollContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWindowAsScrollContainer: Self = this.set("useWindowAsScrollContainer", js.undefined)
  }
}
