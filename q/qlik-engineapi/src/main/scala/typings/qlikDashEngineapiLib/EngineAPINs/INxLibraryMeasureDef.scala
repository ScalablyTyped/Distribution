package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qActiveExpression: scala.Double
  /**
    * Definition of the measure.
    */
  var qDef: java.lang.String
  /**
    * Array of expressions.
    */
  var qExpressions: js.Array[java.lang.String]
  /**
    * Used to define a cyclic group or drill-down group.
    * This parameter is optional.
    * Default value is no grouping.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.undefined
  /**
    * Label of the measure.
    */
  var qLabel: java.lang.String
}

object INxLibraryMeasureDef {
  @scala.inline
  def apply(
    qActiveExpression: scala.Double,
    qDef: java.lang.String,
    qExpressions: js.Array[java.lang.String],
    qLabel: java.lang.String,
    qGrouping: NxGrpType = null
  ): INxLibraryMeasureDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qActiveExpression")(qActiveExpression)
    __obj.updateDynamic("qDef")(qDef)
    __obj.updateDynamic("qExpressions")(qExpressions)
    __obj.updateDynamic("qLabel")(qLabel)
    if (qGrouping != null) __obj.updateDynamic("qGrouping")(qGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLibraryMeasureDef]
  }
}

