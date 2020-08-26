package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BookmarkVariableItem...
  */
@js.native
trait IBookmarkVariableItem extends js.Object {
  /**
    * Name of the variable.
    */
  var qName: String = js.native
  /**
    * Value of the variable.
    */
  var qValue: IFieldValue = js.native
}

object IBookmarkVariableItem {
  @scala.inline
  def apply(qName: String, qValue: IFieldValue): IBookmarkVariableItem = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBookmarkVariableItem]
  }
  @scala.inline
  implicit class IBookmarkVariableItemOps[Self <: IBookmarkVariableItem] (val x: Self) extends AnyVal {
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
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQValue(value: IFieldValue): Self = this.set("qValue", value.asInstanceOf[js.Any])
  }
  
}

