package typings.regjsparser.mod

import typings.regjsparser.regjsparserStrings.`not-boundary`
import typings.regjsparser.regjsparserStrings.`null`
import typings.regjsparser.regjsparserStrings.boundary
import typings.regjsparser.regjsparserStrings.controlLetter
import typings.regjsparser.regjsparserStrings.end
import typings.regjsparser.regjsparserStrings.hexadecimalEscape
import typings.regjsparser.regjsparserStrings.identifier
import typings.regjsparser.regjsparserStrings.intersection
import typings.regjsparser.regjsparserStrings.octal
import typings.regjsparser.regjsparserStrings.singleEscape
import typings.regjsparser.regjsparserStrings.start
import typings.regjsparser.regjsparserStrings.subtraction
import typings.regjsparser.regjsparserStrings.symbol
import typings.regjsparser.regjsparserStrings.unicodeCodePointEscape
import typings.regjsparser.regjsparserStrings.unicodeEscape
import typings.regjsparser.regjsparserStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AstNode[F /* <: Features */] extends StObject
object _AstNode {
  
  inline def Alternative[F /* <: Features */](body: js.Array[RootNode[F]], range: js.Tuple2[Double, Double], raw: String): typings.regjsparser.mod.Alternative[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("alternative")
    __obj.asInstanceOf[typings.regjsparser.mod.Alternative[F]]
  }
  
  inline def Anchor(kind: boundary | end | `not-boundary` | start, range: js.Tuple2[Double, Double], raw: String): typings.regjsparser.mod.Anchor = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("anchor")
    __obj.asInstanceOf[typings.regjsparser.mod.Anchor]
  }
  
  inline def CharacterClass[F /* <: Features */](
    body: js.Array[CharacterClassBody],
    kind: union | (If[
      /* import warning: importer.ImportType#apply Failed type conversion: F['unicodeSet'] */ js.Any, 
      intersection | subtraction, 
      scala.Nothing
    ]),
    negative: Boolean,
    range: js.Tuple2[Double, Double],
    raw: String
  ): typings.regjsparser.mod.CharacterClass[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClass")
    __obj.asInstanceOf[typings.regjsparser.mod.CharacterClass[F]]
  }
  
  inline def CharacterClassEscape(range: js.Tuple2[Double, Double], raw: String, value: String): typings.regjsparser.mod.CharacterClassEscape = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClassEscape")
    __obj.asInstanceOf[typings.regjsparser.mod.CharacterClassEscape]
  }
  
  inline def CharacterClassRange(max: Value, min: Value, range: js.Tuple2[Double, Double], raw: String): typings.regjsparser.mod.CharacterClassRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClassRange")
    __obj.asInstanceOf[typings.regjsparser.mod.CharacterClassRange]
  }
  
  inline def Disjunction[F /* <: Features */](body: Array[RootNode[F]], range: js.Tuple2[Double, Double], raw: String): typings.regjsparser.mod.Disjunction[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("disjunction")
    __obj.asInstanceOf[typings.regjsparser.mod.Disjunction[F]]
  }
  
  inline def Quantifier[F /* <: Features */](
    body: js.Array[RootNode[F]],
    greedy: Boolean,
    min: Double,
    range: js.Tuple2[Double, Double],
    raw: String
  ): typings.regjsparser.mod.Quantifier[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("quantifier")
    __obj.asInstanceOf[typings.regjsparser.mod.Quantifier[F]]
  }
  
  inline def Value(
    codePoint: Double,
    kind: controlLetter | hexadecimalEscape | identifier | `null` | octal | singleEscape | symbol | unicodeCodePointEscape | unicodeEscape,
    range: js.Tuple2[Double, Double],
    raw: String
  ): typings.regjsparser.mod.Value = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("value")
    __obj.asInstanceOf[typings.regjsparser.mod.Value]
  }
}
