package typings
package staticDashEvalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("static-eval", JSImport.Namespace)
@js.native
object staticDashEvalMod extends js.Object {
  /**
  * Evaluates the given ESTree.Expression, with the given named variables in place.
  * @param ast [ESTree.Expression] An esprima expression derived from parse.body[].expression
  * @param vars Named variables, objects or functions which may be referenced in the expression.
  */
  def apply(ast: estreeLib.Expression, vars: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any = js.native
}

