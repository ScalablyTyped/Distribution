package typings
package reactDashNativeDashSortableDashGridLib.reactDashNativeDashSortableDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SortableGridProps extends js.Object {
  /**
       * How long should it take for the block that is being dragged to seek its
       * place after it's released (milliseconds)
       */
  var activeBlockCenteringDuration: js.UndefOr[scala.Double] = js.undefined
  /**
       * How long should the transition of a passive block take when the active
       * block takes its place (milliseconds)
       */
  var blockTransitionDuration: js.UndefOr[scala.Double] = js.undefined
  /**
       * Items to be rendered in the SortableGrid
       */
  var children: js.UndefOr[js.Array[reactDashNativeDashSortableDashGridLib.SortableGridItem]] = js.undefined
  /**
       * How long will the execution wait for the second tap before deciding it
       * was a single tap (milliseconds). Will be omitted if no
       * onDoubleTap-property is given to the item being tapped - In which case
       * single-tap callback will be executed instantly
       */
  var doubleTapTreshold: js.UndefOr[scala.Double] = js.undefined
  /**
       * How long must the user hold the press on the block until it becomes
       * active and can be dragged (milliseconds)
       */
  var dragActivationThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
       * Custom animation to override the default wiggle. Must be an object
       * containing a key transform, which is an array of transformations.
       */
  var dragStartAnimation: js.UndefOr[reactDashNativeDashSortableDashGridLib.Anon_Transform] = js.undefined
  /**
       * When used together with itemsPerRow, sets the size of a block to
       * something other than the default square
       */
  var itemHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * If set, itemsPerRow will be calculated to fit items of this size
       */
  var itemWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * How many items should be placed on one row
       */
  var itemsPerRow: js.UndefOr[scala.Double] = js.undefined
  /**
       * Function that is executed item is deleted. Will return the properties
       * of the deleted item.
       */
  var onDeleteItem: js.UndefOr[js.Function1[/* deletedItem */ OrderedItem, scala.Unit]] = js.undefined
  /**
       * Function that is executed after the drag is released. Will return the
       * new item order.
       */
  var onDragRelease: js.UndefOr[js.Function1[/* itemOrder */ ItemOrder, scala.Unit]] = js.undefined
  /**
       * Function that is called when the dragging starts. This can be used to
       * lock other touch responders from listening to the touch such as
       * ScrollViews and Swipers.
       */
  var onDragStart: js.UndefOr[js.Function1[/* item */ OrderedItem, scala.Unit]] = js.undefined
  /**
       * Custom styles to override or complement the sortableGrid native style.
       */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

