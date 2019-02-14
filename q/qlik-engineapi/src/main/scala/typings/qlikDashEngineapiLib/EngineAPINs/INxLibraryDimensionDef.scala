package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qFieldDefs: js.Array[java.lang.String]
  /**
    * Array of dimension labels.
    */
  var qFieldLabels: js.Array[java.lang.String]
  /**
    * Information about the grouping.
    */
  var qGrouping: NxGrpType
  /**
    * no docu
    */
  var qLabelExpression: java.lang.String
}

