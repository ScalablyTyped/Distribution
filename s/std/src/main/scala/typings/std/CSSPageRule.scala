package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** CSSPageRule is an interface representing a single CSS @page rule. It implements the CSSRule interface with a type value of 6 (CSSRule.PAGE_RULE). */
@js.native
trait CSSPageRule
  extends StObject
     with CSSGroupingRule {
  
  /* standard dom */
  var selectorText: java.lang.String = js.native
  
  /* standard dom */
  val style: CSSStyleDeclaration = js.native
}
