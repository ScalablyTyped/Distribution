package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CSSKeyframesRule")
@js.native
class CSSKeyframesRule ()
  extends StObject
     with typings.std.CSSKeyframesRule {
  
  /* CompleteClass */
  override val CHARSET_RULE: Double = js.native
  
  /* CompleteClass */
  override val FONT_FACE_RULE: Double = js.native
  
  /* CompleteClass */
  override val IMPORT_RULE: Double = js.native
  
  /* CompleteClass */
  override val KEYFRAMES_RULE: Double = js.native
  
  /* CompleteClass */
  override val KEYFRAME_RULE: Double = js.native
  
  /* CompleteClass */
  override val MEDIA_RULE: Double = js.native
  
  /* CompleteClass */
  override val NAMESPACE_RULE: Double = js.native
  
  /* CompleteClass */
  override val PAGE_RULE: Double = js.native
  
  /* CompleteClass */
  override val STYLE_RULE: Double = js.native
  
  /* CompleteClass */
  override val SUPPORTS_RULE: Double = js.native
  
  /* CompleteClass */
  override def appendRule(rule: java.lang.String): Unit = js.native
  
  /* CompleteClass */
  override val cssRules: typings.std.CSSRuleList = js.native
  
  /* CompleteClass */
  var cssText: java.lang.String = js.native
  
  /* CompleteClass */
  override def deleteRule(select: java.lang.String): Unit = js.native
  
  /* CompleteClass */
  override def findRule(select: java.lang.String): typings.std.CSSKeyframeRule | Null = js.native
  
  /* CompleteClass */
  var name: java.lang.String = js.native
  
  /* CompleteClass */
  override val parentRule: typings.std.CSSRule | Null = js.native
  
  /* CompleteClass */
  override val parentStyleSheet: typings.std.CSSStyleSheet | Null = js.native
  
  /* CompleteClass */
  override val `type`: Double = js.native
}
