package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IMeassureList
  */
trait IMeassureList extends js.Object {
  var qItems: js.Array[IMeassureListItemLayout]
}

object IMeassureList {
  @scala.inline
  def apply(qItems: js.Array[IMeassureListItemLayout]): IMeassureList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMeassureList]
  }
}

