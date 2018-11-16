package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INxTreeValue extends js.Object {
  /**
           * Attribute dimension values.
           */
  var qAttrDims: js.UndefOr[INxAttributeDimValues] = js.undefined
  /**
           * Attribute expression values.
           */
  var qAttrExps: js.UndefOr[INxAttributeExpressionValues] = js.undefined
  /**
           * The text version of the value, if available.
           */
  var qText: java.lang.String
  /**
           * Value of the cell.
           * Is set to NaN, if the value is not a number.
           */
  var qValue: scala.Double
}

