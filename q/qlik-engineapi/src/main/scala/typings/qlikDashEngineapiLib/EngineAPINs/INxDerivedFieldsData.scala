package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDerivedFieldsData...
  */
trait INxDerivedFieldsData extends js.Object {
  /**
    * Name of the derived definition.
    */
  var qDerivedDefinitionName: java.lang.String
  /**
    * List of the derived fields.
    */
  var qFieldDefs: js.Array[INxDerivedField]
  /**
    * List of the derived groups.
    */
  var qGroupDefs: js.Array[INxDerivedGroup]
  /**
    * List of tags on the derived fields.
    */
  var qTags: js.Array[java.lang.String]
}

object INxDerivedFieldsData {
  @scala.inline
  def apply(
    qDerivedDefinitionName: java.lang.String,
    qFieldDefs: js.Array[INxDerivedField],
    qGroupDefs: js.Array[INxDerivedGroup],
    qTags: js.Array[java.lang.String]
  ): INxDerivedFieldsData = {
    val __obj = js.Dynamic.literal(qDerivedDefinitionName = qDerivedDefinitionName, qFieldDefs = qFieldDefs, qGroupDefs = qGroupDefs, qTags = qTags)
  
    __obj.asInstanceOf[INxDerivedFieldsData]
  }
}

