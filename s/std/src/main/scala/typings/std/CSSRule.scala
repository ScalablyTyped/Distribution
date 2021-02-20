package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single CSS rule. There are several types of rules, listed in the Type constants section below. */
@js.native
trait CSSRule extends StObject {
  
  val CHARSET_RULE: Double = js.native
  
  val FONT_FACE_RULE: Double = js.native
  
  val IMPORT_RULE: Double = js.native
  
  val KEYFRAMES_RULE: Double = js.native
  
  val KEYFRAME_RULE: Double = js.native
  
  val MEDIA_RULE: Double = js.native
  
  val NAMESPACE_RULE: Double = js.native
  
  val PAGE_RULE: Double = js.native
  
  val STYLE_RULE: Double = js.native
  
  val SUPPORTS_RULE: Double = js.native
  
  var cssText: java.lang.String = js.native
  
  val parentRule: CSSRule | Null = js.native
  
  val parentStyleSheet: CSSStyleSheet | Null = js.native
  
  val `type`: Double = js.native
}
object CSSRule {
  
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
    cssText: java.lang.String,
    `type`: Double
  ): CSSRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRule]
  }
  
  @scala.inline
  implicit class CSSRuleMutableBuilder[Self <: CSSRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCHARSET_RULE(value: Double): Self = StObject.set(x, "CHARSET_RULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssText(value: java.lang.String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFONT_FACE_RULE(value: Double): Self = StObject.set(x, "FONT_FACE_RULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMPORT_RULE(value: Double): Self = StObject.set(x, "IMPORT_RULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEYFRAMES_RULE(value: Double): Self = StObject.set(x, "KEYFRAMES_RULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEYFRAME_RULE(value: Double): Self = StObject.set(x, "KEYFRAME_RULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEDIA_RULE(value: Double): Self = StObject.set(x, "MEDIA_RULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNAMESPACE_RULE(value: Double): Self = StObject.set(x, "NAMESPACE_RULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGE_RULE(value: Double): Self = StObject.set(x, "PAGE_RULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRule(value: CSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRuleNull: Self = StObject.set(x, "parentRule", null)
    
    @scala.inline
    def setParentStyleSheet(value: CSSStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheetNull: Self = StObject.set(x, "parentStyleSheet", null)
    
    @scala.inline
    def setSTYLE_RULE(value: Double): Self = StObject.set(x, "STYLE_RULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUPPORTS_RULE(value: Double): Self = StObject.set(x, "SUPPORTS_RULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
