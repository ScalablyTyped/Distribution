package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single CSS rule. There are several types of rules, listed in the Type constants section below. */
trait CSSRule extends js.Object {
  val CHARSET_RULE: Double
  val FONT_FACE_RULE: Double
  val IMPORT_RULE: Double
  val KEYFRAMES_RULE: Double
  val KEYFRAME_RULE: Double
  val MEDIA_RULE: Double
  val NAMESPACE_RULE: Double
  val PAGE_RULE: Double
  val STYLE_RULE: Double
  val SUPPORTS_RULE: Double
  val UNKNOWN_RULE: Double
  val VIEWPORT_RULE: Double
  var cssText: java.lang.String
  val parentRule: CSSRule | Null
  val parentStyleSheet: CSSStyleSheet | Null
  val `type`: Double
}

@JSGlobal("CSSRule")
@js.native
object CSSRule extends Instantiable0[CSSRule] {
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
  val UNKNOWN_RULE: Double = js.native
  val VIEWPORT_RULE: Double = js.native
}

