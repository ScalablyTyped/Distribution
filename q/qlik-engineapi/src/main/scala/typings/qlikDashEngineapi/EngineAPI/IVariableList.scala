package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VariableListObject...
  */
trait IVariableList extends js.Object {
  var qItems: js.Array[INxVariableListItem]
}

object IVariableList {
  @scala.inline
  def apply(qItems: js.Array[INxVariableListItem]): IVariableList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVariableList]
  }
}

