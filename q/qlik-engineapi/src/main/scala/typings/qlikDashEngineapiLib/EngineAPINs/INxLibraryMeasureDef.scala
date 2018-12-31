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

