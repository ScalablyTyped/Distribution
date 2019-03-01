package typings
package qlikDashEngineapiLib.EngineAPINs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qDerivedFieldLists")(qDerivedFieldLists)
    __obj.asInstanceOf[INxDerivedFieldDescriptionList]
  }
}

