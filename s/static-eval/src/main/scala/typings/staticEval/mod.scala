package typings.staticEval

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  * Evaluates the given ESTree.Expression, with the given named variables in place.
  * @param ast [ESTree.Expression] An esprima expression derived from parse.body[].expression
  * @param vars Named variables, objects or functions which may be referenced in the expression.
  */
  inline def apply(ast: Expression, vars: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].apply(ast.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("static-eval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
