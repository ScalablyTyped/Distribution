package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * GenericDimensionInfo...
     */

trait IGenericDimensionInfo extends js.Object {
  /**
           * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
           * The default value is false.
           */
  var qAndMode: scala.Boolean
  /**
           * Length of the longest value in the field.
           */
  var qApprMaxGlyphCount: scala.Double
  /**
           * Number of distinct field values
           */
  var qCardinal: scala.Double
  /**
           * If set to true, it means that the field is a semantic.
           */
  var qIsSemantic: scala.Boolean
  /**
           * Gives information on a field. For example, it can return the type of the field.
           * Examples: key, text, ASCII
           */
  var qTags: js.Array[java.lang.String]
}

