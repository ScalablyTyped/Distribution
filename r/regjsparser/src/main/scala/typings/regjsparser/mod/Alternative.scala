package typings.regjsparser.mod

import typings.regjsparser.regjsparserStrings.alternative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternative[F /* <: Features */]
  extends StObject
     with Base[alternative]
     with _AstNode[F] {
  
  var body: js.Array[RootNode[F]]
}
object Alternative {
  
  inline def apply[F /* <: Features */](body: js.Array[RootNode[F]], range: js.Tuple2[Double, Double], raw: String): Alternative[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("alternative")
    __obj.asInstanceOf[Alternative[F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alternative[?], F /* <: Features */] (val x: Self & Alternative[F]) extends AnyVal {
    
    inline def setBody(value: js.Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: RootNode[F]*): Self = StObject.set(x, "body", js.Array(value*))
  }
}
