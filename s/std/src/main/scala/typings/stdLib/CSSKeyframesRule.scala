package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSKeyframesRule extends CSSRule {
  val cssRules: CSSRuleList
  var name: java.lang.String
  def appendRule(rule: java.lang.String): scala.Unit
  def deleteRule(select: java.lang.String): scala.Unit
  def findRule(select: java.lang.String): CSSKeyframeRule | scala.Null
}

@JSGlobal("CSSKeyframesRule")
@js.native
class CSSKeyframesRuleCls () extends CSSKeyframesRule {
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
  override val cssRules: CSSRuleList = js.native
  /* CompleteClass */
  override var cssText: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override val parentRule: CSSRule | scala.Null = js.native
  /* CompleteClass */
  override val parentStyleSheet: CSSStyleSheet | scala.Null = js.native
  /* CompleteClass */
  override val `type`: scala.Double = js.native
  /* CompleteClass */
  override def appendRule(rule: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def deleteRule(select: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def findRule(select: java.lang.String): CSSKeyframeRule | scala.Null = js.native
}

@JSGlobal("CSSKeyframesRule")
@js.native
object CSSKeyframesRule
  extends org.scalablytyped.runtime.Instantiable0[CSSKeyframesRule]

