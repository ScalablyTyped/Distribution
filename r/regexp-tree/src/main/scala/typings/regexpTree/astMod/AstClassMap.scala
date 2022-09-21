package typings.regexpTree.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AstClassMap extends StObject {
  
  var Alternative: typings.regexpTree.astMod.Alternative
  
  var Assertion: typings.regexpTree.astMod.Assertion
  
  var Backreference: typings.regexpTree.astMod.Backreference
  
  var Char: typings.regexpTree.astMod.Char
  
  var CharacterClass: typings.regexpTree.astMod.CharacterClass
  
  var ClassRange: typings.regexpTree.astMod.ClassRange
  
  var Disjunction: typings.regexpTree.astMod.Disjunction
  
  var Group: typings.regexpTree.astMod.Group
  
  var Quantifier: typings.regexpTree.astMod.Quantifier
  
  var RegExp: AstRegExp
  
  var Repetition: typings.regexpTree.astMod.Repetition
}
object AstClassMap {
  
  inline def apply(
    Alternative: Alternative,
    Assertion: Assertion,
    Backreference: Backreference,
    Char: Char,
    CharacterClass: CharacterClass,
    ClassRange: ClassRange,
    Disjunction: Disjunction,
    Group: Group,
    Quantifier: Quantifier,
    RegExp: AstRegExp,
    Repetition: Repetition
  ): AstClassMap = {
    val __obj = js.Dynamic.literal(Alternative = Alternative.asInstanceOf[js.Any], Assertion = Assertion.asInstanceOf[js.Any], Backreference = Backreference.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], CharacterClass = CharacterClass.asInstanceOf[js.Any], ClassRange = ClassRange.asInstanceOf[js.Any], Disjunction = Disjunction.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Quantifier = Quantifier.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], Repetition = Repetition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstClassMap]
  }
  
  extension [Self <: AstClassMap](x: Self) {
    
    inline def setAlternative(value: Alternative): Self = StObject.set(x, "Alternative", value.asInstanceOf[js.Any])
    
    inline def setAssertion(value: Assertion): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
    
    inline def setBackreference(value: Backreference): Self = StObject.set(x, "Backreference", value.asInstanceOf[js.Any])
    
    inline def setChar(value: Char): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
    
    inline def setCharacterClass(value: CharacterClass): Self = StObject.set(x, "CharacterClass", value.asInstanceOf[js.Any])
    
    inline def setClassRange(value: ClassRange): Self = StObject.set(x, "ClassRange", value.asInstanceOf[js.Any])
    
    inline def setDisjunction(value: Disjunction): Self = StObject.set(x, "Disjunction", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setQuantifier(value: Quantifier): Self = StObject.set(x, "Quantifier", value.asInstanceOf[js.Any])
    
    inline def setRegExp(value: AstRegExp): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
    
    inline def setRepetition(value: Repetition): Self = StObject.set(x, "Repetition", value.asInstanceOf[js.Any])
  }
}
