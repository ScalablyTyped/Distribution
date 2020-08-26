package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the dimensions. Is the layout for DimensionListDef.
  */
@js.native
trait IDimensionList extends js.Object {
  /**
    * Information about the list of dimensions
    */
  var qItems: js.Array[IDimensionItemLayout] = js.native
}

object IDimensionList {
  @scala.inline
  def apply(qItems: js.Array[IDimensionItemLayout]): IDimensionList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimensionList]
  }
  @scala.inline
  implicit class IDimensionListOps[Self <: IDimensionList] (val x: Self) extends AnyVal {
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
    def setQItemsVarargs(value: IDimensionItemLayout*): Self = this.set("qItems", js.Array(value :_*))
    @scala.inline
    def setQItems(value: js.Array[IDimensionItemLayout]): Self = this.set("qItems", value.asInstanceOf[js.Any])
  }
  
}

