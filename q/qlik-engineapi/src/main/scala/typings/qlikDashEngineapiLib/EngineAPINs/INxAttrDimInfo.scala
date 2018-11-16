package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * NxAttrDimInfo...
     */

trait INxAttrDimInfo extends js.Object {
  /**
           * Cardinality of the attribute expression.
           * 	Integer
           */
  var qCardinal: scala.Double
  /**
           * Validation error.
           * REF(NxValidationError)
           */
  // ?Type = REF(NxValidationError)?
  var qError: INxValidationError
  /**
           * The title for the attribute dimension.
           * String
           */
  var qFallbackTitle: java.lang.String
  /**
           * The Locked value of the dimension.
           * Boolean
           */
  var qLocked: scala.Boolean
  /**
           * Number of rows.
           * 	Size
           */
  var qSize: scala.Double
}

