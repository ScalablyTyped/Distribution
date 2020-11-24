package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object representing a complete set of keyframes for a CSS animation. It corresponds to the contains of a whole @keyframes at-rule. It implements the CSSRule interface with a type value of 7 (CSSRule.KEYFRAMES_RULE). */
@js.native
trait CSSKeyframesRule extends CSSRule {
  
  def appendRule(rule: java.lang.String): Unit = js.native
  
  val cssRules: CSSRuleList = js.native
  
  def deleteRule(select: java.lang.String): Unit = js.native
  
  def findRule(select: java.lang.String): CSSKeyframeRule | Null = js.native
  
  var name: java.lang.String = js.native
}
object CSSKeyframesRule {
  
  @scala.inline
  def apply(
    CHARSET_RULE: Double,
    FONT_FACE_RULE: Double,
    IMPORT_RULE: Double,
    KEYFRAMES_RULE: Double,
    KEYFRAME_RULE: Double,
    MEDIA_RULE: Double,
    NAMESPACE_RULE: Double,
    PAGE_RULE: Double,
    STYLE_RULE: Double,
    SUPPORTS_RULE: Double,
    appendRule: java.lang.String => Unit,
    cssRules: CSSRuleList,
    cssText: java.lang.String,
    deleteRule: java.lang.String => Unit,
    findRule: java.lang.String => CSSKeyframeRule | Null,
    name: java.lang.String,
    `type`: Double
  ): CSSKeyframesRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], appendRule = js.Any.fromFunction1(appendRule), cssRules = cssRules.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], deleteRule = js.Any.fromFunction1(deleteRule), findRule = js.Any.fromFunction1(findRule), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeyframesRule]
  }
  
  @scala.inline
  implicit class CSSKeyframesRuleOps[Self <: CSSKeyframesRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppendRule(value: java.lang.String => Unit): Self = this.set("appendRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCssRules(value: CSSRuleList): Self = this.set("cssRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRule(value: java.lang.String => Unit): Self = this.set("deleteRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindRule(value: java.lang.String => CSSKeyframeRule | Null): Self = this.set("findRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
