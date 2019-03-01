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

object IGenericDimensionInfo {
  @scala.inline
  def apply(
    qAndMode: scala.Boolean,
    qApprMaxGlyphCount: scala.Double,
    qCardinal: scala.Double,
    qIsSemantic: scala.Boolean,
    qTags: js.Array[java.lang.String]
  ): IGenericDimensionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAndMode")(qAndMode)
    __obj.updateDynamic("qApprMaxGlyphCount")(qApprMaxGlyphCount)
    __obj.updateDynamic("qCardinal")(qCardinal)
    __obj.updateDynamic("qIsSemantic")(qIsSemantic)
    __obj.updateDynamic("qTags")(qTags)
    __obj.asInstanceOf[IGenericDimensionInfo]
  }
}

