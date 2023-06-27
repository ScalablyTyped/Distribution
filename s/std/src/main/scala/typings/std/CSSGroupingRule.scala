package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any CSS at-rule that contains other rules nested within it.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule)
  */
@js.native
trait CSSGroupingRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/cssRules) */
  /* standard dom */
  val cssRules: CSSRuleList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/deleteRule) */
  /* standard dom */
  def deleteRule(index: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/insertRule) */
  /* standard dom */
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
}
