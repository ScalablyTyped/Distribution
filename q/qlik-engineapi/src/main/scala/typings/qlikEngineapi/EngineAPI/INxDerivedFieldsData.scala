package typings.qlikEngineapi.EngineAPI

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
  var qDerivedDefinitionName: String
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
  var qTags: js.Array[String]
}

object INxDerivedFieldsData {
  @scala.inline
  def apply(
    qDerivedDefinitionName: String,
    qFieldDefs: js.Array[INxDerivedField],
    qGroupDefs: js.Array[INxDerivedGroup],
    qTags: js.Array[String]
  ): INxDerivedFieldsData = {
    val __obj = js.Dynamic.literal(qDerivedDefinitionName = qDerivedDefinitionName.asInstanceOf[js.Any], qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qGroupDefs = qGroupDefs.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxDerivedFieldsData]
  }
}

