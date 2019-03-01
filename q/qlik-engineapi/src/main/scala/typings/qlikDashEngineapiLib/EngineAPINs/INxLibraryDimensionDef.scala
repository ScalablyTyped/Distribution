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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qFieldDefs")(qFieldDefs)
    __obj.updateDynamic("qFieldLabels")(qFieldLabels)
    __obj.updateDynamic("qGrouping")(qGrouping.asInstanceOf[js.Any])
    __obj.updateDynamic("qLabelExpression")(qLabelExpression)
    __obj.asInstanceOf[INxLibraryDimensionDef]
  }
}

