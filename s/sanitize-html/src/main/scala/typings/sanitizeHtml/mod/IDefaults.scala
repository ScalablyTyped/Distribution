package typings.sanitizeHtml.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefaults extends js.Object {
  var allowProtocolRelative: Boolean = js.native
  var allowedAttributes: StringDictionary[js.Array[AllowedAttribute]] = js.native
  var allowedSchemes: js.Array[String] = js.native
  var allowedSchemesAppliedToAttributes: js.Array[String] = js.native
  var allowedSchemesByTag: StringDictionary[js.Array[String]] = js.native
  var allowedTags: js.Array[String] = js.native
  var disallowedTagsMode: String = js.native
  var enforceHtmlBoundary: Boolean = js.native
  var selfClosing: js.Array[String] = js.native
}

object IDefaults {
  @scala.inline
  def apply(
    allowProtocolRelative: Boolean,
    allowedAttributes: StringDictionary[js.Array[AllowedAttribute]],
    allowedSchemes: js.Array[String],
    allowedSchemesAppliedToAttributes: js.Array[String],
    allowedSchemesByTag: StringDictionary[js.Array[String]],
    allowedTags: js.Array[String],
    disallowedTagsMode: String,
    enforceHtmlBoundary: Boolean,
    selfClosing: js.Array[String]
  ): IDefaults = {
    val __obj = js.Dynamic.literal(allowProtocolRelative = allowProtocolRelative.asInstanceOf[js.Any], allowedAttributes = allowedAttributes.asInstanceOf[js.Any], allowedSchemes = allowedSchemes.asInstanceOf[js.Any], allowedSchemesAppliedToAttributes = allowedSchemesAppliedToAttributes.asInstanceOf[js.Any], allowedSchemesByTag = allowedSchemesByTag.asInstanceOf[js.Any], allowedTags = allowedTags.asInstanceOf[js.Any], disallowedTagsMode = disallowedTagsMode.asInstanceOf[js.Any], enforceHtmlBoundary = enforceHtmlBoundary.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaults]
  }
  @scala.inline
  implicit class IDefaultsOps[Self <: IDefaults] (val x: Self) extends AnyVal {
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
    def setAllowProtocolRelative(value: Boolean): Self = this.set("allowProtocolRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedAttributes(value: StringDictionary[js.Array[AllowedAttribute]]): Self = this.set("allowedAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedSchemesVarargs(value: String*): Self = this.set("allowedSchemes", js.Array(value :_*))
    @scala.inline
    def setAllowedSchemes(value: js.Array[String]): Self = this.set("allowedSchemes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedSchemesAppliedToAttributesVarargs(value: String*): Self = this.set("allowedSchemesAppliedToAttributes", js.Array(value :_*))
    @scala.inline
    def setAllowedSchemesAppliedToAttributes(value: js.Array[String]): Self = this.set("allowedSchemesAppliedToAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedSchemesByTag(value: StringDictionary[js.Array[String]]): Self = this.set("allowedSchemesByTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedTagsVarargs(value: String*): Self = this.set("allowedTags", js.Array(value :_*))
    @scala.inline
    def setAllowedTags(value: js.Array[String]): Self = this.set("allowedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisallowedTagsMode(value: String): Self = this.set("disallowedTagsMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnforceHtmlBoundary(value: Boolean): Self = this.set("enforceHtmlBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfClosingVarargs(value: String*): Self = this.set("selfClosing", js.Array(value :_*))
    @scala.inline
    def setSelfClosing(value: js.Array[String]): Self = this.set("selfClosing", value.asInstanceOf[js.Any])
  }
  
}

