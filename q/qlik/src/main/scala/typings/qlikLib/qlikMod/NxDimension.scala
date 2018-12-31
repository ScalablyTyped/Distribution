package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxDimension extends js.Object {
  var qAttributeDimensions: js.Array[NxAttrDimDef]
  var qAttributeExpressions: js.Array[NxAttrExprDef]
  var qCalcCond: ValueExpr
  var qDef: NxInlineDimensionDef
  var qLibraryId: java.lang.String
  var qNullSuppression: scala.Boolean
  var qOtherLabel: java.lang.String
  var qOtherTotalSpec: OtherTotalSpecProp
  var qShowAll: scala.Boolean
  var qTotalLabel: java.lang.String
}

