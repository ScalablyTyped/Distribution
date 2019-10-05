package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object representing a complete set of keyframes for a CSS animation. It corresponds to the contains of a whole @keyframes at-rule. It implements the CSSRule interface with a type value of 7 (CSSRule.KEYFRAMES_RULE). */
trait CSSKeyframesRule extends CSSRule {
  val cssRules: CSSRuleList
  var name: java.lang.String
  def appendRule(rule: java.lang.String): Unit
  def deleteRule(select: java.lang.String): Unit
  def findRule(select: java.lang.String): CSSKeyframeRule | Null
}

@JSGlobal("CSSKeyframesRule")
@js.native
object CSSKeyframesRule extends Instantiable0[CSSKeyframesRule]

