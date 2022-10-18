package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeStrings.$
import typings.regexpTree.regexpTreeStrings.Lookahead
import typings.regexpTree.regexpTreeStrings.Lookbehind
import typings.regexpTree.regexpTreeStrings.^
import typings.regexpTree.regexpTreeStrings.control
import typings.regexpTree.regexpTreeStrings.decimal
import typings.regexpTree.regexpTreeStrings.hex
import typings.regexpTree.regexpTreeStrings.meta
import typings.regexpTree.regexpTreeStrings.oct
import typings.regexpTree.regexpTreeStrings.unicode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTree.astMod.Char
  - typings.regexpTree.astMod.CharacterClass
  - typings.regexpTree.astMod.Alternative
  - typings.regexpTree.astMod.Disjunction
  - typings.regexpTree.astMod.Group
  - typings.regexpTree.astMod.Backreference
  - typings.regexpTree.astMod.Repetition
  - typings.regexpTree.astMod.Assertion
*/
trait Expression extends StObject
object Expression {
  
  inline def Alternative(expressions: js.Array[Expression]): typings.regexpTree.astMod.Alternative = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Alternative")
    __obj.asInstanceOf[typings.regexpTree.astMod.Alternative]
  }
  
  inline def CapturingGroup(number: Double): typings.regexpTree.astMod.CapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = true, number = number.asInstanceOf[js.Any], expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.regexpTree.astMod.CapturingGroup]
  }
  
  inline def CharacterClass(expressions: js.Array[Char | ClassRange]): typings.regexpTree.astMod.CharacterClass = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterClass")
    __obj.asInstanceOf[typings.regexpTree.astMod.CharacterClass]
  }
  
  inline def Disjunction(): typings.regexpTree.astMod.Disjunction = {
    val __obj = js.Dynamic.literal(left = null, right = null)
    __obj.updateDynamic("type")("Disjunction")
    __obj.asInstanceOf[typings.regexpTree.astMod.Disjunction]
  }
  
  inline def LookaroundAssertion(kind: Lookahead | Lookbehind): typings.regexpTree.astMod.LookaroundAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], assertion = null)
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpTree.astMod.LookaroundAssertion]
  }
  
  inline def NamedBackreference(number: Double, reference: String, referenceRaw: String): typings.regexpTree.astMod.NamedBackreference = {
    val __obj = js.Dynamic.literal(kind = "name", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], referenceRaw = referenceRaw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typings.regexpTree.astMod.NamedBackreference]
  }
  
  inline def NoncapturingGroup(): typings.regexpTree.astMod.NoncapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = false, expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.regexpTree.astMod.NoncapturingGroup]
  }
  
  inline def NumericBackreference(number: Double, reference: Double): typings.regexpTree.astMod.NumericBackreference = {
    val __obj = js.Dynamic.literal(kind = "number", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typings.regexpTree.astMod.NumericBackreference]
  }
  
  inline def Repetition(expression: Expression, quantifier: Quantifier): typings.regexpTree.astMod.Repetition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Repetition")
    __obj.asInstanceOf[typings.regexpTree.astMod.Repetition]
  }
  
  inline def SimpleAssertion(kind: ^ | $ | (/* \b */ String)): typings.regexpTree.astMod.SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpTree.astMod.SimpleAssertion]
  }
  
  inline def SimpleChar(codePoint: Double, value: String): typings.regexpTree.astMod.SimpleChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = "simple", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typings.regexpTree.astMod.SimpleChar]
  }
  
  inline def SpecialChar(codePoint: Double, kind: meta | control | hex | decimal | oct | unicode, value: String): typings.regexpTree.astMod.SpecialChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typings.regexpTree.astMod.SpecialChar]
  }
}
