package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldListObject...
  */
trait IFieldList extends js.Object {
  /**
    * NxFieldDescription[]
    */
  var qItems: js.Array[INxFieldDescription]
}

object IFieldList {
  @scala.inline
  def apply(qItems: js.Array[INxFieldDescription]): IFieldList = {
    val __obj = js.Dynamic.literal(qItems = qItems)
  
    __obj.asInstanceOf[IFieldList]
  }
}

