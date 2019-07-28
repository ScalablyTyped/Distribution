package typings.reactDashSortableDashHoc.reactDashSortableDashHocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableContainerProps extends js.Object {
  var axis: js.UndefOr[Axis] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var getContainer: js.UndefOr[ContainerGetter] = js.undefined
  var getHelperDimensions: js.UndefOr[js.Function1[/* sort */ SortStart, Dimensions]] = js.undefined
  var helperClass: js.UndefOr[String] = js.undefined
  var hideSortableGhost: js.UndefOr[Boolean] = js.undefined
  var lockAxis: js.UndefOr[Axis] = js.undefined
  var lockOffset: js.UndefOr[Offset | (js.Tuple2[Offset, Offset])] = js.undefined
  var lockToContainerEdges: js.UndefOr[Boolean] = js.undefined
  var onSortEnd: js.UndefOr[SortEndHandler] = js.undefined
  var onSortMove: js.UndefOr[SortMoveHandler] = js.undefined
  var onSortStart: js.UndefOr[SortStartHandler] = js.undefined
  var pressDelay: js.UndefOr[Double] = js.undefined
  var pressThreshold: js.UndefOr[Double] = js.undefined
  var shouldCancelStart: js.UndefOr[js.Function1[/* event */ SortEvent | SortEventWithTag, Boolean]] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var useDragHandle: js.UndefOr[Boolean] = js.undefined
  var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined
}

object SortableContainerProps {
  @scala.inline
  def apply(
    axis: Axis = null,
    distance: Int | Double = null,
    getContainer: ContainerGetter = null,
    getHelperDimensions: /* sort */ SortStart => Dimensions = null,
    helperClass: String = null,
    hideSortableGhost: js.UndefOr[Boolean] = js.undefined,
    lockAxis: Axis = null,
    lockOffset: Offset | (js.Tuple2[Offset, Offset]) = null,
    lockToContainerEdges: js.UndefOr[Boolean] = js.undefined,
    onSortEnd: SortEndHandler = null,
    onSortMove: SortMoveHandler = null,
    onSortStart: SortStartHandler = null,
    pressDelay: Int | Double = null,
    pressThreshold: Int | Double = null,
    shouldCancelStart: /* event */ SortEvent | SortEventWithTag => Boolean = null,
    transitionDuration: Int | Double = null,
    useDragHandle: js.UndefOr[Boolean] = js.undefined,
    useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined
  ): SortableContainerProps = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer)
    if (getHelperDimensions != null) __obj.updateDynamic("getHelperDimensions")(js.Any.fromFunction1(getHelperDimensions))
    if (helperClass != null) __obj.updateDynamic("helperClass")(helperClass)
    if (!js.isUndefined(hideSortableGhost)) __obj.updateDynamic("hideSortableGhost")(hideSortableGhost)
    if (lockAxis != null) __obj.updateDynamic("lockAxis")(lockAxis)
    if (lockOffset != null) __obj.updateDynamic("lockOffset")(lockOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(lockToContainerEdges)) __obj.updateDynamic("lockToContainerEdges")(lockToContainerEdges)
    if (onSortEnd != null) __obj.updateDynamic("onSortEnd")(onSortEnd)
    if (onSortMove != null) __obj.updateDynamic("onSortMove")(onSortMove)
    if (onSortStart != null) __obj.updateDynamic("onSortStart")(onSortStart)
    if (pressDelay != null) __obj.updateDynamic("pressDelay")(pressDelay.asInstanceOf[js.Any])
    if (pressThreshold != null) __obj.updateDynamic("pressThreshold")(pressThreshold.asInstanceOf[js.Any])
    if (shouldCancelStart != null) __obj.updateDynamic("shouldCancelStart")(js.Any.fromFunction1(shouldCancelStart))
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(useDragHandle)) __obj.updateDynamic("useDragHandle")(useDragHandle)
    if (!js.isUndefined(useWindowAsScrollContainer)) __obj.updateDynamic("useWindowAsScrollContainer")(useWindowAsScrollContainer)
    __obj.asInstanceOf[SortableContainerProps]
  }
}

