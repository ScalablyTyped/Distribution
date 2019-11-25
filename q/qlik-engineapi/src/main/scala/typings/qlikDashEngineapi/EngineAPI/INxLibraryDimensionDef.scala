package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxLibraryDimensionDef
  */
trait INxLibraryDimensionDef extends js.Object {
  /**
    * Array of dimension names.
    */
  var qFieldDefs: js.Array[String]
  /**
    * Array of dimension labels.
    */
  var qFieldLabels: js.Array[String]
  /**
    * Information about the grouping.
    */
  var qGrouping: NxGrpType
  /**
    * no docu
    */
  var qLabelExpression: String
}

object INxLibraryDimensionDef {
  @scala.inline
  def apply(
    qFieldDefs: js.Array[String],
    qFieldLabels: js.Array[String],
    qGrouping: NxGrpType,
    qLabelExpression: String
  ): INxLibraryDimensionDef = {
    val __obj = js.Dynamic.literal(qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qFieldLabels = qFieldLabels.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qLabelExpression = qLabelExpression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxLibraryDimensionDef]
  }
}

