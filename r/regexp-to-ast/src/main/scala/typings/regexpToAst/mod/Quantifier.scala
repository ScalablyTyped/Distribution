package typings.regexpToAst.mod

import typings.regexpToAst.anon.Begin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quantifier
  extends StObject
     with IRegExpAST {
  
  var atLeast: Double
  
  var atMost: Double
  
  var greedy: Boolean
  
  @JSName("type")
  var type_Quantifier: typings.regexpToAst.regexpToAstStrings.Quantifier
}
object Quantifier {
  
  inline def apply(atLeast: Double, atMost: Double, greedy: Boolean, loc: Begin): Quantifier = {
    val __obj = js.Dynamic.literal(atLeast = atLeast.asInstanceOf[js.Any], atMost = atMost.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[Quantifier]
  }
  
  extension [Self <: Quantifier](x: Self) {
    
    inline def setAtLeast(value: Double): Self = StObject.set(x, "atLeast", value.asInstanceOf[js.Any])
    
    inline def setAtMost(value: Double): Self = StObject.set(x, "atMost", value.asInstanceOf[js.Any])
    
    inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.regexpToAst.regexpToAstStrings.Quantifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
