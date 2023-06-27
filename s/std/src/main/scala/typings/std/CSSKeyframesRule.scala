package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing a complete set of keyframes for a CSS animation. It corresponds to the contains of a whole @keyframes at-rule. It implements the CSSRule interface with a type value of 7 (CSSRule.KEYFRAMES_RULE).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule)
  */
@js.native
trait CSSKeyframesRule
  extends StObject
     with CSSRule
     with /* standard dom */
/* index */ NumberDictionary[CSSKeyframeRule] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/appendRule) */
  /* standard dom */
  def appendRule(rule: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/cssRules) */
  /* standard dom */
  val cssRules: CSSRuleList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/deleteRule) */
  /* standard dom */
  def deleteRule(select: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/findRule) */
  /* standard dom */
  def findRule(select: java.lang.String): CSSKeyframeRule | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSKeyframeRule]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/name) */
  /* standard dom */
  var name: java.lang.String = js.native
}
