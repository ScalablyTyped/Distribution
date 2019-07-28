package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxFieldDescription...
  */
trait INxFieldDescription extends js.Object {
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * >> The default value is false.
    */
  var qAndMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of distinct field values
    */
  var qCardinal: Double
  /**
    * Lists the derived fields if any.
    */
  var qDerivedFieldData: INxDerivedFieldDescriptionList
  /**
    * If set to true, it means that the field is a field on the fly.
    */
  var qIsDefinitionOnly: Boolean
  /**
    * Is used for Direct Discovery.
    * If set to true, it means that the type of the field is detail.
    */
  var qIsDetail: Boolean
  /**
    * If set to true, it means that the field is hidden.
    */
  var qIsHidden: Boolean
  /**
    * Is used for Direct Discovery.
    * If set to true, it means that the type of the field is measure.
    */
  var qIsImplicit: Boolean
  /**
    * If set to true, it means that the field is a semantic.
    */
  var qIsSemantic: Boolean
  /**
    * If set to true, it means that the field is a system field.
    */
  var qIsSystem: Boolean
  /**
    * Name of the field
    */
  var qName: String
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[String]
}

object INxFieldDescription {
  @scala.inline
  def apply(
    qCardinal: Double,
    qDerivedFieldData: INxDerivedFieldDescriptionList,
    qIsDefinitionOnly: Boolean,
    qIsDetail: Boolean,
    qIsHidden: Boolean,
    qIsImplicit: Boolean,
    qIsSemantic: Boolean,
    qIsSystem: Boolean,
    qName: String,
    qTags: js.Array[String],
    qAndMode: js.UndefOr[Boolean] = js.undefined
  ): INxFieldDescription = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal, qDerivedFieldData = qDerivedFieldData, qIsDefinitionOnly = qIsDefinitionOnly, qIsDetail = qIsDetail, qIsHidden = qIsHidden, qIsImplicit = qIsImplicit, qIsSemantic = qIsSemantic, qIsSystem = qIsSystem, qName = qName, qTags = qTags)
    if (!js.isUndefined(qAndMode)) __obj.updateDynamic("qAndMode")(qAndMode)
    __obj.asInstanceOf[INxFieldDescription]
  }
}

