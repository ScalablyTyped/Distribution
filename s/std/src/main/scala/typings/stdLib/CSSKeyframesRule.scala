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
object CSSKeyframesRule
  extends org.scalablytyped.runtime.Instantiable0[CSSKeyframesRule]

