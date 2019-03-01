package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DerivedFieldsInTableData...
  */
trait IDerivedFieldsInTableData extends js.Object {
  /**
    * Is set to true is the derived field is in use.
    */
  var qActive: scala.Boolean
  /**
    * Name of the derived definition.
    */
  var qDefinitionName: java.lang.String
  /**
    * List of tags.
    */
  var qTags: js.Array[java.lang.String]
}

object IDerivedFieldsInTableData {
  @scala.inline
  def apply(qActive: scala.Boolean, qDefinitionName: java.lang.String, qTags: js.Array[java.lang.String]): IDerivedFieldsInTableData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qActive")(qActive)
    __obj.updateDynamic("qDefinitionName")(qDefinitionName)
    __obj.updateDynamic("qTags")(qTags)
    __obj.asInstanceOf[IDerivedFieldsInTableData]
  }
}

