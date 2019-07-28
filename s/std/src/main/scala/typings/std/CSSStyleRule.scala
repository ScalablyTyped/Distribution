package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CSSStyleRule represents a single CSS style rule. It implements the CSSRule interface with a type value of 1 (CSSRule.STYLE_RULE). */
trait CSSStyleRule extends CSSRule {
  var selectorText: java.lang.String
  val style: CSSStyleDeclaration
}

@JSGlobal("CSSStyleRule")
@js.native
class CSSStyleRuleCls () extends CSSStyleRule {
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
  override val UNKNOWN_RULE: Double = js.native
  /* CompleteClass */
  override val VIEWPORT_RULE: Double = js.native
  /* CompleteClass */
  override var cssText: java.lang.String = js.native
  /* CompleteClass */
  override val parentRule: CSSRule | Null = js.native
  /* CompleteClass */
  override val parentStyleSheet: CSSStyleSheet | Null = js.native
  /* CompleteClass */
  override var selectorText: java.lang.String = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val `type`: Double = js.native
}

@JSGlobal("CSSStyleRule")
@js.native
object CSSStyleRule extends Instantiable0[CSSStyleRule]

