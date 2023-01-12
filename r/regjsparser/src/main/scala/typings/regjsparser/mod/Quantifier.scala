package typings.regjsparser.mod

import typings.regjsparser.regjsparserStrings.Asterisk
import typings.regjsparser.regjsparserStrings.Plussign
import typings.regjsparser.regjsparserStrings.Questionmark
import typings.regjsparser.regjsparserStrings.quantifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quantifier[F /* <: Features */]
  extends StObject
     with Base[quantifier]
     with _AstNode[F] {
  
  var body: js.Array[RootNode[F]]
  
  var greedy: Boolean
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: Double
  
  var symbol: js.UndefOr[Questionmark | Asterisk | Plussign] = js.undefined
}
object Quantifier {
  
  inline def apply[F /* <: Features */](
    body: js.Array[RootNode[F]],
    greedy: Boolean,
    min: Double,
    range: js.Tuple2[Double, Double],
    raw: String
  ): Quantifier[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("quantifier")
    __obj.asInstanceOf[Quantifier[F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Quantifier[?], F /* <: Features */] (val x: Self & Quantifier[F]) extends AnyVal {
    
    inline def setBody(value: js.Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: RootNode[F]*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Questionmark | Asterisk | Plussign): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
