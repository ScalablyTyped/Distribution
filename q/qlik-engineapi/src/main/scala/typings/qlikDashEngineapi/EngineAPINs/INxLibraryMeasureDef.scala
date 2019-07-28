package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxLibraryMeasureDef...
  */
trait INxLibraryMeasureDef extends js.Object {
  /**
    * Index to the active expression in a measure.
    */
  var qActiveExpression: Double
  /**
    * Definition of the measure.
    */
  var qDef: String
  /**
    * Array of expressions.
    */
  var qExpressions: js.Array[String]
  /**
    * Used to define a cyclic group or drill-down group.
    * This parameter is optional.
    * Default value is no grouping.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.undefined
  /**
    * Label of the measure.
    */
  var qLabel: String
}

object INxLibraryMeasureDef {
  @scala.inline
  def apply(
    qActiveExpression: Double,
    qDef: String,
    qExpressions: js.Array[String],
    qLabel: String,
    qGrouping: NxGrpType = null
  ): INxLibraryMeasureDef = {
    val __obj = js.Dynamic.literal(qActiveExpression = qActiveExpression, qDef = qDef, qExpressions = qExpressions, qLabel = qLabel)
    if (qGrouping != null) __obj.updateDynamic("qGrouping")(qGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLibraryMeasureDef]
  }
}

