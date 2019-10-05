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
object CSSPageRule extends Instantiable0[CSSPageRule]

