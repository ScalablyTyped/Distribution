package typings
package stdLib

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
  override val CHARSET_RULE: scala.Double = js.native
  /* CompleteClass */
  override val FONT_FACE_RULE: scala.Double = js.native
  /* CompleteClass */
  override val IMPORT_RULE: scala.Double = js.native
  /* CompleteClass */
  override val KEYFRAMES_RULE: scala.Double = js.native
  /* CompleteClass */
  override val KEYFRAME_RULE: scala.Double = js.native
  /* CompleteClass */
  override val MEDIA_RULE: scala.Double = js.native
  /* CompleteClass */
  override val NAMESPACE_RULE: scala.Double = js.native
  /* CompleteClass */
  override val PAGE_RULE: scala.Double = js.native
  /* CompleteClass */
  override val STYLE_RULE: scala.Double = js.native
  /* CompleteClass */
  override val SUPPORTS_RULE: scala.Double = js.native
  /* CompleteClass */
  override val UNKNOWN_RULE: scala.Double = js.native
  /* CompleteClass */
  override val VIEWPORT_RULE: scala.Double = js.native
  /* CompleteClass */
  override var cssText: java.lang.String = js.native
  /* CompleteClass */
  override val parentRule: CSSRule | scala.Null = js.native
  /* CompleteClass */
  override val parentStyleSheet: CSSStyleSheet | scala.Null = js.native
  /* CompleteClass */
  override var selectorText: java.lang.String = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val `type`: scala.Double = js.native
}

@JSGlobal("CSSStyleRule")
@js.native
object CSSStyleRule
  extends org.scalablytyped.runtime.Instantiable0[CSSStyleRule]

