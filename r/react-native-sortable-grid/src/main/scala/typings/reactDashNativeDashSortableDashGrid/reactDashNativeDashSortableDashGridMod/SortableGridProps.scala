package typings.reactDashNativeDashSortableDashGrid.reactDashNativeDashSortableDashGridMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashSortableDashGrid.Anon_Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableGridProps extends js.Object {
  /**
    * How long should it take for the block that is being dragged to seek its
    * place after it's released (milliseconds)
    */
  var activeBlockCenteringDuration: js.UndefOr[Double] = js.undefined
  /**
    * How long should the transition of a passive block take when the active
    * block takes its place (milliseconds)
    */
  var blockTransitionDuration: js.UndefOr[Double] = js.undefined
  /**
    * Items to be rendered in the SortableGrid
    */
  var children: js.UndefOr[js.Array[SortableGridItem]] = js.undefined
  /**
    * How long will the execution wait for the second tap before deciding it
    * was a single tap (milliseconds). Will be omitted if no
    * onDoubleTap-property is given to the item being tapped - In which case
    * single-tap callback will be executed instantly
    */
  var doubleTapTreshold: js.UndefOr[Double] = js.undefined
  /**
    * How long must the user hold the press on the block until it becomes
    * active and can be dragged (milliseconds)
    */
  var dragActivationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Custom animation to override the default wiggle. Must be an object
    * containing a key transform, which is an array of transformations.
    */
  var dragStartAnimation: js.UndefOr[Anon_Transform] = js.undefined
  /**
    * When used together with itemsPerRow, sets the size of a block to
    * something other than the default square
    */
  var itemHeight: js.UndefOr[Double] = js.undefined
  /**
    * If set, itemsPerRow will be calculated to fit items of this size
    */
  var itemWidth: js.UndefOr[Double] = js.undefined
  /**
    * How many items should be placed on one row
    */
  var itemsPerRow: js.UndefOr[Double] = js.undefined
  /**
    * Function that is executed item is deleted. Will return the properties
    * of the deleted item.
    */
  var onDeleteItem: js.UndefOr[js.Function1[/* deletedItem */ OrderedItem, Unit]] = js.undefined
  /**
    * Function that is executed after the drag is released. Will return the
    * new item order.
    */
  var onDragRelease: js.UndefOr[js.Function1[/* itemOrder */ ItemOrder, Unit]] = js.undefined
  /**
    * Function that is called when the dragging starts. This can be used to
    * lock other touch responders from listening to the touch such as
    * ScrollViews and Swipers.
    */
  var onDragStart: js.UndefOr[js.Function1[/* item */ OrderedItem, Unit]] = js.undefined
  /**
    * Custom styles to override or complement the sortableGrid native style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object SortableGridProps {
  @scala.inline
  def apply(
    activeBlockCenteringDuration: Int | Double = null,
    blockTransitionDuration: Int | Double = null,
    children: js.Array[SortableGridItem] = null,
    doubleTapTreshold: Int | Double = null,
    dragActivationThreshold: Int | Double = null,
    dragStartAnimation: Anon_Transform = null,
    itemHeight: Int | Double = null,
    itemWidth: Int | Double = null,
    itemsPerRow: Int | Double = null,
    onDeleteItem: /* deletedItem */ OrderedItem => Unit = null,
    onDragRelease: /* itemOrder */ ItemOrder => Unit = null,
    onDragStart: /* item */ OrderedItem => Unit = null,
    style: StyleProp[ViewStyle] = null
  ): SortableGridProps = {
    val __obj = js.Dynamic.literal()
    if (activeBlockCenteringDuration != null) __obj.updateDynamic("activeBlockCenteringDuration")(activeBlockCenteringDuration.asInstanceOf[js.Any])
    if (blockTransitionDuration != null) __obj.updateDynamic("blockTransitionDuration")(blockTransitionDuration.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (doubleTapTreshold != null) __obj.updateDynamic("doubleTapTreshold")(doubleTapTreshold.asInstanceOf[js.Any])
    if (dragActivationThreshold != null) __obj.updateDynamic("dragActivationThreshold")(dragActivationThreshold.asInstanceOf[js.Any])
    if (dragStartAnimation != null) __obj.updateDynamic("dragStartAnimation")(dragStartAnimation)
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow.asInstanceOf[js.Any])
    if (onDeleteItem != null) __obj.updateDynamic("onDeleteItem")(js.Any.fromFunction1(onDeleteItem))
    if (onDragRelease != null) __obj.updateDynamic("onDragRelease")(js.Any.fromFunction1(onDragRelease))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableGridProps]
  }
}

