package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any CSS at-rule that contains other rules nested within it. */
trait CSSGroupingRule extends CSSRule {
  val cssRules: CSSRuleList
  def deleteRule(index: Double): Unit
  def insertRule(rule: java.lang.String, index: Double): Double
}

@JSGlobal("CSSGroupingRule")
@js.native
object CSSGroupingRule extends Instantiable0[CSSGroupingRule]

