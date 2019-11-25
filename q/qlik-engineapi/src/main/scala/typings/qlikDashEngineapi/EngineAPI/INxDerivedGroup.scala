package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDerivedGroup...
  */
trait INxDerivedGroup extends js.Object {
  /**
    * List of the derived fields in the group.
    */
  var qFieldDefs: js.Array[String]
  /**
    * Grouping type.
    * The grouping should be either H or C (Grouping is mandatory for derived definitions).
    * >> Is mandatory.
    */
  var qGrouping: NxGrpType
  /**
    * Identifier of the group.
    */
  var qId: String
  /**
    * Name of the derived group.
    */
  var qName: String
}

object INxDerivedGroup {
  @scala.inline
  def apply(qFieldDefs: js.Array[String], qGrouping: NxGrpType, qId: String, qName: String): INxDerivedGroup = {
    val __obj = js.Dynamic.literal(qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxDerivedGroup]
  }
}

