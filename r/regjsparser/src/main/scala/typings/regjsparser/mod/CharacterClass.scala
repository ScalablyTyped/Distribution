package typings.regjsparser.mod

import typings.regjsparser.regjsparserStrings.characterClass
import typings.regjsparser.regjsparserStrings.intersection
import typings.regjsparser.regjsparserStrings.subtraction
import typings.regjsparser.regjsparserStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterClass[F /* <: Features */]
  extends StObject
     with Base[characterClass]
     with _AstNode[F] {
  
  var body: js.Array[CharacterClassBody]
  
  var kind: union | (If[
    /* import warning: importer.ImportType#apply Failed type conversion: F['unicodeSet'] */ js.Any, 
    intersection | subtraction, 
    scala.Nothing
  ])
  
  var negative: Boolean
}
object CharacterClass {
  
  inline def apply[F /* <: Features */](
    body: js.Array[CharacterClassBody],
    kind: union | (If[
      /* import warning: importer.ImportType#apply Failed type conversion: F['unicodeSet'] */ js.Any, 
      intersection | subtraction, 
      scala.Nothing
    ]),
    negative: Boolean,
    range: js.Tuple2[Double, Double],
    raw: String
  ): CharacterClass[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClass")
    __obj.asInstanceOf[CharacterClass[F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharacterClass[?], F /* <: Features */] (val x: Self & CharacterClass[F]) extends AnyVal {
    
    inline def setBody(value: js.Array[CharacterClassBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: CharacterClassBody*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setKind(
      value: union | (If[
          /* import warning: importer.ImportType#apply Failed type conversion: F['unicodeSet'] */ js.Any, 
          intersection | subtraction, 
          scala.Nothing
        ])
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
  }
}
