package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single condition CSS at-rule, which consists of a condition and a statement block. It is a child of CSSGroupingRule.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSConditionRule)
  */
@js.native
trait CSSConditionRule
  extends StObject
     with CSSGroupingRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSConditionRule/conditionText) */
  /* standard dom */
  val conditionText: java.lang.String = js.native
}
