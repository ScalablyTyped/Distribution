package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single CSS @media rule. It implements the CSSConditionRule interface, and therefore the CSSGroupingRule and the CSSRule interface with a type value of 4 (CSSRule.MEDIA_RULE).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMediaRule)
  */
@js.native
trait CSSMediaRule
  extends StObject
     with CSSConditionRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMediaRule/media) */
  /* standard dom */
  val media: MediaList = js.native
}
