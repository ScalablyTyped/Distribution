package typings.qlikEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qDerivedFieldData = qDerivedFieldData.asInstanceOf[js.Any], qIsDefinitionOnly = qIsDefinitionOnly.asInstanceOf[js.Any], qIsDetail = qIsDetail.asInstanceOf[js.Any], qIsHidden = qIsHidden.asInstanceOf[js.Any], qIsImplicit = qIsImplicit.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qIsSystem = qIsSystem.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    if (!js.isUndefined(qAndMode)) __obj.updateDynamic("qAndMode")(qAndMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxFieldDescription]
  }
}

