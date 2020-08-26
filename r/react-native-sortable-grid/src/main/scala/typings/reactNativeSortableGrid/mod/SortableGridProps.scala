package typings.reactNativeSortableGrid.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSortableGrid.anon.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableGridProps extends js.Object {
  /**
    * How long should it take for the block that is being dragged to seek its
    * place after it's released (milliseconds)
    */
  var activeBlockCenteringDuration: js.UndefOr[Double] = js.native
  /**
    * How long should the transition of a passive block take when the active
    * block takes its place (milliseconds)
    */
  var blockTransitionDuration: js.UndefOr[Double] = js.native
  /**
    * Items to be rendered in the SortableGrid
    */
  var children: js.UndefOr[js.Array[SortableGridItem]] = js.native
  /**
    * How long will the execution wait for the second tap before deciding it
    * was a single tap (milliseconds). Will be omitted if no
    * onDoubleTap-property is given to the item being tapped - In which case
    * single-tap callback will be executed instantly
    */
  var doubleTapTreshold: js.UndefOr[Double] = js.native
  /**
    * How long must the user hold the press on the block until it becomes
    * active and can be dragged (milliseconds)
    */
  var dragActivationThreshold: js.UndefOr[Double] = js.native
  /**
    * Custom animation to override the default wiggle. Must be an object
    * containing a key transform, which is an array of transformations.
    */
  var dragStartAnimation: js.UndefOr[Transform] = js.native
  /**
    * When used together with itemsPerRow, sets the size of a block to
    * something other than the default square
    */
  var itemHeight: js.UndefOr[Double] = js.native
  /**
    * If set, itemsPerRow will be calculated to fit items of this size
    */
  var itemWidth: js.UndefOr[Double] = js.native
  /**
    * How many items should be placed on one row
    */
  var itemsPerRow: js.UndefOr[Double] = js.native
  /**
    * Function that is executed item is deleted. Will return the properties
    * of the deleted item.
    */
  var onDeleteItem: js.UndefOr[js.Function1[/* deletedItem */ OrderedItem, Unit]] = js.native
  /**
    * Function that is executed after the drag is released. Will return the
    * new item order.
    */
  var onDragRelease: js.UndefOr[js.Function1[/* itemOrder */ ItemOrder, Unit]] = js.native
  /**
    * Function that is called when the dragging starts. This can be used to
    * lock other touch responders from listening to the touch such as
    * ScrollViews and Swipers.
    */
  var onDragStart: js.UndefOr[js.Function1[/* item */ OrderedItem, Unit]] = js.native
  /**
    * Custom styles to override or complement the sortableGrid native style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object SortableGridProps {
  @scala.inline
  def apply(): SortableGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableGridProps]
  }
  @scala.inline
  implicit class SortableGridPropsOps[Self <: SortableGridProps] (val x: Self) extends AnyVal {
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
    def setActiveBlockCenteringDuration(value: Double): Self = this.set("activeBlockCenteringDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveBlockCenteringDuration: Self = this.set("activeBlockCenteringDuration", js.undefined)
    @scala.inline
    def setBlockTransitionDuration(value: Double): Self = this.set("blockTransitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockTransitionDuration: Self = this.set("blockTransitionDuration", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: SortableGridItem*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[SortableGridItem]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDoubleTapTreshold(value: Double): Self = this.set("doubleTapTreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleTapTreshold: Self = this.set("doubleTapTreshold", js.undefined)
    @scala.inline
    def setDragActivationThreshold(value: Double): Self = this.set("dragActivationThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragActivationThreshold: Self = this.set("dragActivationThreshold", js.undefined)
    @scala.inline
    def setDragStartAnimation(value: Transform): Self = this.set("dragStartAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragStartAnimation: Self = this.set("dragStartAnimation", js.undefined)
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    @scala.inline
    def setItemsPerRow(value: Double): Self = this.set("itemsPerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsPerRow: Self = this.set("itemsPerRow", js.undefined)
    @scala.inline
    def setOnDeleteItem(value: /* deletedItem */ OrderedItem => Unit): Self = this.set("onDeleteItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeleteItem: Self = this.set("onDeleteItem", js.undefined)
    @scala.inline
    def setOnDragRelease(value: /* itemOrder */ ItemOrder => Unit): Self = this.set("onDragRelease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragRelease: Self = this.set("onDragRelease", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* item */ OrderedItem => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

