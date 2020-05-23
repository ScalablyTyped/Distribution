package typings.standardEngine.anon

import org.scalablytyped.runtime.Instantiable0
import typings.eslint.mod.Linter
import typings.eslint.mod.RuleTester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofeslint extends js.Object {
  val AST: js.Any
  var CLIEngine: TypeofCLIEngine with TypeofCLIEngineOptions
  var Linter: Instantiable0[typings.eslint.mod.Linter]
  val Rule: js.Any
  var RuleTester: Instantiable0[typings.eslint.mod.RuleTester]
  val Scope: js.Any
  var SourceCode: TypeofSourceCode
}

object Typeofeslint {
  @scala.inline
  def apply(
    AST: js.Any,
    CLIEngine: TypeofCLIEngine with TypeofCLIEngineOptions,
    Linter: Instantiable0[Linter],
    Rule: js.Any,
    RuleTester: Instantiable0[RuleTester],
    Scope: js.Any,
    SourceCode: TypeofSourceCode
  ): Typeofeslint = {
    val __obj = js.Dynamic.literal(AST = AST.asInstanceOf[js.Any], CLIEngine = CLIEngine.asInstanceOf[js.Any], Linter = Linter.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any], RuleTester = RuleTester.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], SourceCode = SourceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofeslint]
  }
}

