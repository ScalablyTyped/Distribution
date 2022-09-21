package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeStrings.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeQuantifier
  extends StObject
     with Base[typings.regexpTree.regexpTreeStrings.Quantifier]
     with Quantifier {
  
  var from: Double
  
  var greedy: Boolean
  
  var kind: Range
  
  var to: js.UndefOr[Double] = js.undefined
}
object RangeQuantifier {
  
  inline def apply(from: Double, greedy: Boolean): RangeQuantifier = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], kind = "Range")
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[RangeQuantifier]
  }
  
  extension [Self <: RangeQuantifier](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Range): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
