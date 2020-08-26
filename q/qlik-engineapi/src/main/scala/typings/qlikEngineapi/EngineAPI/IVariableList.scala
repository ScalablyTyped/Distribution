package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VariableListObject...
  */
@js.native
trait IVariableList extends js.Object {
  var qItems: js.Array[INxVariableListItem] = js.native
}

object IVariableList {
  @scala.inline
  def apply(qItems: js.Array[INxVariableListItem]): IVariableList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVariableList]
  }
  @scala.inline
  implicit class IVariableListOps[Self <: IVariableList] (val x: Self) extends AnyVal {
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
    def setQItemsVarargs(value: INxVariableListItem*): Self = this.set("qItems", js.Array(value :_*))
    @scala.inline
    def setQItems(value: js.Array[INxVariableListItem]): Self = this.set("qItems", value.asInstanceOf[js.Any])
  }
  
}

