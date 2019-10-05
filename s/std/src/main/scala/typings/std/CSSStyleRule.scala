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
object CSSStyleRule extends Instantiable0[CSSStyleRule]

