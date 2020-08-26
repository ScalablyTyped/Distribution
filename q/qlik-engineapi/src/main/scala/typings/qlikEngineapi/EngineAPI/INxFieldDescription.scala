package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxFieldDescription...
  */
@js.native
trait INxFieldDescription extends js.Object {
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * >> The default value is false.
    */
  var qAndMode: js.UndefOr[Boolean] = js.native
  /**
    * Number of distinct field values
    */
  var qCardinal: Double = js.native
  /**
    * Lists the derived fields if any.
    */
  var qDerivedFieldData: INxDerivedFieldDescriptionList = js.native
  /**
    * If set to true, it means that the field is a field on the fly.
    */
  var qIsDefinitionOnly: Boolean = js.native
  /**
    * Is used for Direct Discovery.
    * If set to true, it means that the type of the field is detail.
    */
  var qIsDetail: Boolean = js.native
  /**
    * If set to true, it means that the field is hidden.
    */
  var qIsHidden: Boolean = js.native
  /**
    * Is used for Direct Discovery.
    * If set to true, it means that the type of the field is measure.
    */
  var qIsImplicit: Boolean = js.native
  /**
    * If set to true, it means that the field is a semantic.
    */
  var qIsSemantic: Boolean = js.native
  /**
    * If set to true, it means that the field is a system field.
    */
  var qIsSystem: Boolean = js.native
  /**
    * Name of the field
    */
  var qName: String = js.native
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[String] = js.native
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
    qTags: js.Array[String]
  ): INxFieldDescription = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qDerivedFieldData = qDerivedFieldData.asInstanceOf[js.Any], qIsDefinitionOnly = qIsDefinitionOnly.asInstanceOf[js.Any], qIsDetail = qIsDetail.asInstanceOf[js.Any], qIsHidden = qIsHidden.asInstanceOf[js.Any], qIsImplicit = qIsImplicit.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qIsSystem = qIsSystem.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxFieldDescription]
  }
  @scala.inline
  implicit class INxFieldDescriptionOps[Self <: INxFieldDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQCardinal(value: Double): Self = this.set("qCardinal", value.asInstanceOf[js.Any])
    @scala.inline
    def setQDerivedFieldData(value: INxDerivedFieldDescriptionList): Self = this.set("qDerivedFieldData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQIsDefinitionOnly(value: Boolean): Self = this.set("qIsDefinitionOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setQIsDetail(value: Boolean): Self = this.set("qIsDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def setQIsHidden(value: Boolean): Self = this.set("qIsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setQIsImplicit(value: Boolean): Self = this.set("qIsImplicit", value.asInstanceOf[js.Any])
    @scala.inline
    def setQIsSemantic(value: Boolean): Self = this.set("qIsSemantic", value.asInstanceOf[js.Any])
    @scala.inline
    def setQIsSystem(value: Boolean): Self = this.set("qIsSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTagsVarargs(value: String*): Self = this.set("qTags", js.Array(value :_*))
    @scala.inline
    def setQTags(value: js.Array[String]): Self = this.set("qTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setQAndMode(value: Boolean): Self = this.set("qAndMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQAndMode: Self = this.set("qAndMode", js.undefined)
  }
  
}

