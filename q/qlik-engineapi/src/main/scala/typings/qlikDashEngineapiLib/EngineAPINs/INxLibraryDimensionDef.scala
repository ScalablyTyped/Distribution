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

object INxLibraryDimensionDef {
  @scala.inline
  def apply(
    qFieldDefs: js.Array[java.lang.String],
    qFieldLabels: js.Array[java.lang.String],
    qGrouping: NxGrpType,
    qLabelExpression: java.lang.String
  ): INxLibraryDimensionDef = {
    val __obj = js.Dynamic.literal(qFieldDefs = qFieldDefs, qFieldLabels = qFieldLabels, qGrouping = qGrouping.asInstanceOf[js.Any], qLabelExpression = qLabelExpression)
  
    __obj.asInstanceOf[INxLibraryDimensionDef]
  }
}

