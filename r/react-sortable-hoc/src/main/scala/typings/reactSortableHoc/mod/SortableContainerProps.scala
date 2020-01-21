package typings.reactSortableHoc.mod

import typings.react.mod.ReactElement
import typings.reactSortableHoc.AnonCancel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableContainerProps extends js.Object {
  var axis: js.UndefOr[Axis] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var getContainer: js.UndefOr[ContainerGetter] = js.undefined
  var getHelperDimensions: js.UndefOr[js.Function1[/* sort */ SortStart, Dimensions]] = js.undefined
  var helperClass: js.UndefOr[String] = js.undefined
  var helperContainer: js.UndefOr[HTMLElement | HelperContainerGetter] = js.undefined
  var hideSortableGhost: js.UndefOr[Boolean] = js.undefined
  var keyCodes: js.UndefOr[AnonCancel] = js.undefined
  var keyboardSortingTransitionDuration: js.UndefOr[Double] = js.undefined
  var lockAxis: js.UndefOr[Axis] = js.undefined
  var lockOffset: js.UndefOr[Offset | (js.Tuple2[Offset, Offset])] = js.undefined
  var lockToContainerEdges: js.UndefOr[Boolean] = js.undefined
  var onSortEnd: js.UndefOr[SortEndHandler] = js.undefined
  var onSortMove: js.UndefOr[SortMoveHandler] = js.undefined
  var onSortOver: js.UndefOr[SortOverHandler] = js.undefined
  var onSortStart: js.UndefOr[SortStartHandler] = js.undefined
  var pressDelay: js.UndefOr[Double] = js.undefined
  var pressThreshold: js.UndefOr[Double] = js.undefined
  var shouldCancelStart: js.UndefOr[js.Function1[/* event */ SortEvent | SortEventWithTag, Boolean]] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var updateBeforeSortStart: js.UndefOr[SortStartHandler] = js.undefined
  var useDragHandle: js.UndefOr[Boolean] = js.undefined
  var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined
}

object SortableContainerProps {
  @scala.inline
  def apply(
    axis: Axis = null,
    distance: Int | Double = null,
    getContainer: /* element */ ReactElement => HTMLElement | js.Promise[HTMLElement] = null,
    getHelperDimensions: /* sort */ SortStart => Dimensions = null,
    helperClass: String = null,
    helperContainer: HTMLElement | HelperContainerGetter = null,
    hideSortableGhost: js.UndefOr[Boolean] = js.undefined,
    keyCodes: AnonCancel = null,
    keyboardSortingTransitionDuration: Int | Double = null,
    lockAxis: Axis = null,
    lockOffset: Offset | (js.Tuple2[Offset, Offset]) = null,
    lockToContainerEdges: js.UndefOr[Boolean] = js.undefined,
    onSortEnd: (/* sort */ SortEnd, /* event */ SortEvent) => Unit = null,
    onSortMove: /* event */ SortEvent => Unit = null,
    onSortOver: (/* sort */ SortOver, /* event */ SortEvent) => Unit = null,
    onSortStart: (/* sort */ SortStart, /* event */ SortEvent) => Unit = null,
    pressDelay: Int | Double = null,
    pressThreshold: Int | Double = null,
    shouldCancelStart: /* event */ SortEvent | SortEventWithTag => Boolean = null,
    transitionDuration: Int | Double = null,
    updateBeforeSortStart: (/* sort */ SortStart, /* event */ SortEvent) => Unit = null,
    useDragHandle: js.UndefOr[Boolean] = js.undefined,
    useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined
  ): SortableContainerProps = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction1(getContainer))
    if (getHelperDimensions != null) __obj.updateDynamic("getHelperDimensions")(js.Any.fromFunction1(getHelperDimensions))
    if (helperClass != null) __obj.updateDynamic("helperClass")(helperClass.asInstanceOf[js.Any])
    if (helperContainer != null) __obj.updateDynamic("helperContainer")(helperContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSortableGhost)) __obj.updateDynamic("hideSortableGhost")(hideSortableGhost.asInstanceOf[js.Any])
    if (keyCodes != null) __obj.updateDynamic("keyCodes")(keyCodes.asInstanceOf[js.Any])
    if (keyboardSortingTransitionDuration != null) __obj.updateDynamic("keyboardSortingTransitionDuration")(keyboardSortingTransitionDuration.asInstanceOf[js.Any])
    if (lockAxis != null) __obj.updateDynamic("lockAxis")(lockAxis.asInstanceOf[js.Any])
    if (lockOffset != null) __obj.updateDynamic("lockOffset")(lockOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(lockToContainerEdges)) __obj.updateDynamic("lockToContainerEdges")(lockToContainerEdges.asInstanceOf[js.Any])
    if (onSortEnd != null) __obj.updateDynamic("onSortEnd")(js.Any.fromFunction2(onSortEnd))
    if (onSortMove != null) __obj.updateDynamic("onSortMove")(js.Any.fromFunction1(onSortMove))
    if (onSortOver != null) __obj.updateDynamic("onSortOver")(js.Any.fromFunction2(onSortOver))
    if (onSortStart != null) __obj.updateDynamic("onSortStart")(js.Any.fromFunction2(onSortStart))
    if (pressDelay != null) __obj.updateDynamic("pressDelay")(pressDelay.asInstanceOf[js.Any])
    if (pressThreshold != null) __obj.updateDynamic("pressThreshold")(pressThreshold.asInstanceOf[js.Any])
    if (shouldCancelStart != null) __obj.updateDynamic("shouldCancelStart")(js.Any.fromFunction1(shouldCancelStart))
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (updateBeforeSortStart != null) __obj.updateDynamic("updateBeforeSortStart")(js.Any.fromFunction2(updateBeforeSortStart))
    if (!js.isUndefined(useDragHandle)) __obj.updateDynamic("useDragHandle")(useDragHandle.asInstanceOf[js.Any])
    if (!js.isUndefined(useWindowAsScrollContainer)) __obj.updateDynamic("useWindowAsScrollContainer")(useWindowAsScrollContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableContainerProps]
  }
}

