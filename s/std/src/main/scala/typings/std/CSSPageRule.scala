package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CSSPageRule is an interface representing a single CSS @page rule. It implements the CSSRule interface with a type value of 6 (CSSRule.PAGE_RULE). */
@js.native
trait CSSPageRule extends CSSGroupingRule {
  var selectorText: java.lang.String = js.native
  val style: CSSStyleDeclaration = js.native
}

