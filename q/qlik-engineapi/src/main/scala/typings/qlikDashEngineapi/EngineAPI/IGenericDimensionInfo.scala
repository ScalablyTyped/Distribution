package typings.qlikDashEngineapi.EngineAPI

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
  var qAndMode: Boolean
  /**
    * Length of the longest value in the field.
    */
  var qApprMaxGlyphCount: Double
  /**
    * Number of distinct field values
    */
  var qCardinal: Double
  /**
    * If set to true, it means that the field is a semantic.
    */
  var qIsSemantic: Boolean
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[String]
}

object IGenericDimensionInfo {
  @scala.inline
  def apply(
    qAndMode: Boolean,
    qApprMaxGlyphCount: Double,
    qCardinal: Double,
    qIsSemantic: Boolean,
    qTags: js.Array[String]
  ): IGenericDimensionInfo = {
    val __obj = js.Dynamic.literal(qAndMode = qAndMode, qApprMaxGlyphCount = qApprMaxGlyphCount, qCardinal = qCardinal, qIsSemantic = qIsSemantic, qTags = qTags)
  
    __obj.asInstanceOf[IGenericDimensionInfo]
  }
}

