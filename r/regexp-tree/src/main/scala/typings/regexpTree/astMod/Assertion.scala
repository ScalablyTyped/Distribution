package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeStrings.$
import typings.regexpTree.regexpTreeStrings.BackslashB
import typings.regexpTree.regexpTreeStrings.Backslashb
import typings.regexpTree.regexpTreeStrings.Lookahead
import typings.regexpTree.regexpTreeStrings.Lookbehind
import typings.regexpTree.regexpTreeStrings.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTree.astMod.SimpleAssertion
  - typings.regexpTree.astMod.LookaroundAssertion
*/
trait Assertion
  extends StObject
     with Expression
object Assertion {
  
  inline def LookaroundAssertion(kind: Lookahead | Lookbehind): typings.regexpTree.astMod.LookaroundAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], assertion = null)
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpTree.astMod.LookaroundAssertion]
  }
  
  inline def SimpleAssertion(kind: ^ | $ | Backslashb | BackslashB): typings.regexpTree.astMod.SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpTree.astMod.SimpleAssertion]
  }
}
