package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any CSS at-rule that contains other rules nested within it. */
@js.native
trait CSSGroupingRule
  extends StObject
     with CSSRule {
  
  /* standard dom */
  val cssRules: CSSRuleList = js.native
  
  /* standard dom */
  def deleteRule(index: Double): Unit = js.native
  
  /* standard dom */
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
}
