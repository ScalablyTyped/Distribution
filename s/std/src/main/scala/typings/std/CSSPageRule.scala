package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CSSPageRule is an interface representing a single CSS @page rule. It implements the CSSRule interface with a type value of 6 (CSSRule.PAGE_RULE). */
trait CSSPageRule extends CSSRule {
  val pseudoClass: java.lang.String
  val selector: java.lang.String
  var selectorText: java.lang.String
  val style: CSSStyleDeclaration
}

@JSGlobal("CSSPageRule")
@js.native
class CSSPageRuleCls () extends CSSPageRule {
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
  override val pseudoClass: java.lang.String = js.native
  /* CompleteClass */
  override val selector: java.lang.String = js.native
  /* CompleteClass */
  override var selectorText: java.lang.String = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val `type`: Double = js.native
}

@JSGlobal("CSSPageRule")
@js.native
object CSSPageRule extends Instantiable0[CSSPageRule]

