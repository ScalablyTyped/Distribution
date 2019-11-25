package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the dimensions. Is the layout for DimensionListDef.
  */
trait IDimensionList extends js.Object {
  /**
    * Information about the list of dimensions
    */
  var qItems: js.Array[IDimensionItemLayout]
}

object IDimensionList {
  @scala.inline
  def apply(qItems: js.Array[IDimensionItemLayout]): IDimensionList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDimensionList]
  }
}

