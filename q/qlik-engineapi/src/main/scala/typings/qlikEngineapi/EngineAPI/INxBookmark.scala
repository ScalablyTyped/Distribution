package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxBookmark...
  */
@js.native
trait INxBookmark extends js.Object {
  /**
    * List of selections for each state.
    */
  var qStateData: js.Array[IAlternateStateData] = js.native
  /**
    * Time when the bookmark was created.
    */
  var qUtcModifyTime: Double = js.native
  /**
    * List of the variables in the app at the time the bookmark was created.
    */
  var qVariableItems: js.Array[IBookmarkVariableItem] = js.native
}

object INxBookmark {
  @scala.inline
  def apply(
    qStateData: js.Array[IAlternateStateData],
    qUtcModifyTime: Double,
    qVariableItems: js.Array[IBookmarkVariableItem]
  ): INxBookmark = {
    val __obj = js.Dynamic.literal(qStateData = qStateData.asInstanceOf[js.Any], qUtcModifyTime = qUtcModifyTime.asInstanceOf[js.Any], qVariableItems = qVariableItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxBookmark]
  }
  @scala.inline
  implicit class INxBookmarkOps[Self <: INxBookmark] (val x: Self) extends AnyVal {
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
    def setQStateDataVarargs(value: IAlternateStateData*): Self = this.set("qStateData", js.Array(value :_*))
    @scala.inline
    def setQStateData(value: js.Array[IAlternateStateData]): Self = this.set("qStateData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQUtcModifyTime(value: Double): Self = this.set("qUtcModifyTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setQVariableItemsVarargs(value: IBookmarkVariableItem*): Self = this.set("qVariableItems", js.Array(value :_*))
    @scala.inline
    def setQVariableItems(value: js.Array[IBookmarkVariableItem]): Self = this.set("qVariableItems", value.asInstanceOf[js.Any])
  }
  
}

