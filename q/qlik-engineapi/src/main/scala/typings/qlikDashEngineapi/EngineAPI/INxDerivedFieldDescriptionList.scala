package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDerivedFieldDescriptionList
  */
trait INxDerivedFieldDescriptionList extends js.Object {
  /**
    * Information about the derived fields.
    */
  var qDerivedFieldLists: js.Array[INxDerivedFieldsData]
}

object INxDerivedFieldDescriptionList {
  @scala.inline
  def apply(qDerivedFieldLists: js.Array[INxDerivedFieldsData]): INxDerivedFieldDescriptionList = {
    val __obj = js.Dynamic.literal(qDerivedFieldLists = qDerivedFieldLists)
  
    __obj.asInstanceOf[INxDerivedFieldDescriptionList]
  }
}

