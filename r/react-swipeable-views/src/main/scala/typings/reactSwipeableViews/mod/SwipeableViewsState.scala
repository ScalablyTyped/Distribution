package typings.reactSwipeableViews.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeableViewsState extends js.Object {
  var displaySameSlide: js.UndefOr[Boolean] = js.native
  var heightLatest: js.UndefOr[Double] = js.native
  var indexCurrent: js.UndefOr[Double] = js.native
  var indexLatest: js.UndefOr[Double] = js.native
  var isDragging: js.UndefOr[Boolean] = js.native
  var isFirstRender: js.UndefOr[Boolean] = js.native
}

object SwipeableViewsState {
  @scala.inline
  def apply(): SwipeableViewsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableViewsState]
  }
  @scala.inline
  implicit class SwipeableViewsStateOps[Self <: SwipeableViewsState] (val x: Self) extends AnyVal {
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
    def setDisplaySameSlide(value: Boolean): Self = this.set("displaySameSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplaySameSlide: Self = this.set("displaySameSlide", js.undefined)
    @scala.inline
    def setHeightLatest(value: Double): Self = this.set("heightLatest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightLatest: Self = this.set("heightLatest", js.undefined)
    @scala.inline
    def setIndexCurrent(value: Double): Self = this.set("indexCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexCurrent: Self = this.set("indexCurrent", js.undefined)
    @scala.inline
    def setIndexLatest(value: Double): Self = this.set("indexLatest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexLatest: Self = this.set("indexLatest", js.undefined)
    @scala.inline
    def setIsDragging(value: Boolean): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDragging: Self = this.set("isDragging", js.undefined)
    @scala.inline
    def setIsFirstRender(value: Boolean): Self = this.set("isFirstRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFirstRender: Self = this.set("isFirstRender", js.undefined)
  }
  
}

