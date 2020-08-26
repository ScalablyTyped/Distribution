package typings.reactNativeDraggableFlatlist.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.VirtualizedListWithoutRenderItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableFlatListProps[Item] extends VirtualizedListWithoutRenderItemProps[Item] {
  /**
    * Items to be rendered.
    */
  @JSName("data")
  var data_DraggableFlatListProps: js.Array[Item] | Null = js.native
  /**
    * Function that is called when row becomes active.
    */
  var onMoveBegin: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  /**
    *  Function that returns updated ordering of data
    */
  var onMoveEnd: js.UndefOr[js.Function1[/* info */ OnMoveEndInfo[Item], Unit]] = js.native
  /**
    * Sets where scrolling begins.
    *
    * Default is 5
    */
  var scrollPercent: js.UndefOr[Double] = js.native
  /**
    * Function that calls move when the row should become active (in an onPress, onLongPress, etc). Calls moveEnd when the gesture is complete (in onPressOut).
    */
  def renderItem(info: RenderItemInfo[Item]): ReactElement | Null = js.native
}

object DraggableFlatListProps {
  @scala.inline
  def apply[Item](renderItem: RenderItemInfo[Item] => ReactElement | Null): DraggableFlatListProps[Item] = {
    val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction1(renderItem))
    __obj.asInstanceOf[DraggableFlatListProps[Item]]
  }
  @scala.inline
  implicit class DraggableFlatListPropsOps[Self <: DraggableFlatListProps[_], Item] (val x: Self with DraggableFlatListProps[Item]) extends AnyVal {
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
    def setRenderItem(value: RenderItemInfo[Item] => ReactElement | Null): Self = this.set("renderItem", js.Any.fromFunction1(value))
    @scala.inline
    def setDataVarargs(value: Item*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Item]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setOnMoveBegin(value: /* index */ Double => Unit): Self = this.set("onMoveBegin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMoveBegin: Self = this.set("onMoveBegin", js.undefined)
    @scala.inline
    def setOnMoveEnd(value: /* info */ OnMoveEndInfo[Item] => Unit): Self = this.set("onMoveEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMoveEnd: Self = this.set("onMoveEnd", js.undefined)
    @scala.inline
    def setScrollPercent(value: Double): Self = this.set("scrollPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPercent: Self = this.set("scrollPercent", js.undefined)
  }
  
}

