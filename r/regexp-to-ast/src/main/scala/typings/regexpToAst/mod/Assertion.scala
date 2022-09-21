package typings.regexpToAst.mod

import typings.regexpToAst.anon.Begin
import typings.regexpToAst.regexpToAstStrings.EndAnchor
import typings.regexpToAst.regexpToAstStrings.Lookahead
import typings.regexpToAst.regexpToAstStrings.NegativeLookahead
import typings.regexpToAst.regexpToAstStrings.NonWordBoundary
import typings.regexpToAst.regexpToAstStrings.StartAnchor
import typings.regexpToAst.regexpToAstStrings.WordBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assertion
  extends StObject
     with IRegExpAST
     with Term {
  
  @JSName("type")
  var type_Assertion: StartAnchor | EndAnchor | WordBoundary | NonWordBoundary | Lookahead | NegativeLookahead
  
  var value: js.UndefOr[Disjunction] = js.undefined
}
object Assertion {
  
  inline def apply(
    loc: Begin,
    `type`: StartAnchor | EndAnchor | WordBoundary | NonWordBoundary | Lookahead | NegativeLookahead
  ): Assertion = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assertion]
  }
  
  extension [Self <: Assertion](x: Self) {
    
    inline def setType(value: StartAnchor | EndAnchor | WordBoundary | NonWordBoundary | Lookahead | NegativeLookahead): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Disjunction): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
