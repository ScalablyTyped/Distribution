package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CSSNamespaceRule interface describes an object representing a single CSS @namespace at-rule. It implements the CSSRule interface, with a type value of 10 (CSSRule.NAMESPACE_RULE). */
trait CSSNamespaceRule extends CSSRule {
  val namespaceURI: java.lang.String
  val prefix: java.lang.String
}

@JSGlobal("CSSNamespaceRule")
@js.native
class CSSNamespaceRuleCls () extends CSSNamespaceRule {
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
  override val namespaceURI: java.lang.String = js.native
  /* CompleteClass */
  override val parentRule: CSSRule | scala.Null = js.native
  /* CompleteClass */
  override val parentStyleSheet: CSSStyleSheet | scala.Null = js.native
  /* CompleteClass */
  override val prefix: java.lang.String = js.native
  /* CompleteClass */
  override val `type`: scala.Double = js.native
}

@JSGlobal("CSSNamespaceRule")
@js.native
object CSSNamespaceRule
  extends org.scalablytyped.runtime.Instantiable0[CSSNamespaceRule]

