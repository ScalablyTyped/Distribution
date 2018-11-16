package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * FieldValue...
     */

trait IFieldValue extends js.Object {
  /**
           * Is set to true if the value is a numeric.
           * This parameter is optional. Default is false.
           */
  var qIsNumeric: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Numeric value of the field.
           * This parameter is displayed if qIsNumeric is set to true.
           * This parameter is optional.
           */
  var qNumber: js.UndefOr[scala.Double] = js.undefined
  /**
           * Text related to the field value
           * This parameter is optional.
           */
  var qText: js.UndefOr[java.lang.String] = js.undefined
}

