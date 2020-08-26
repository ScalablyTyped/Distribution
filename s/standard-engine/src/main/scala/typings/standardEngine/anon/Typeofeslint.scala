package typings.standardEngine.anon

import org.scalablytyped.runtime.Instantiable0
import typings.eslint.mod.RuleTester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofeslint extends js.Object {
  val AST: js.Any = js.native
  var CLIEngine: TypeofCLIEngine with TypeofCLIEngineOptions = js.native
  var ESLint: TypeofESLint_ = js.native
  var Linter: TypeofLinter = js.native
  val Rule: js.Any = js.native
  var RuleTester: Instantiable0[typings.eslint.mod.RuleTester] = js.native
  val Scope: js.Any = js.native
  var SourceCode: TypeofSourceCode = js.native
}

object Typeofeslint {
  @scala.inline
  def apply(
    AST: js.Any,
    CLIEngine: TypeofCLIEngine with TypeofCLIEngineOptions,
    ESLint: TypeofESLint_,
    Linter: TypeofLinter,
    Rule: js.Any,
    RuleTester: Instantiable0[RuleTester],
    Scope: js.Any,
    SourceCode: TypeofSourceCode
  ): Typeofeslint = {
    val __obj = js.Dynamic.literal(AST = AST.asInstanceOf[js.Any], CLIEngine = CLIEngine.asInstanceOf[js.Any], ESLint = ESLint.asInstanceOf[js.Any], Linter = Linter.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any], RuleTester = RuleTester.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], SourceCode = SourceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofeslint]
  }
  @scala.inline
  implicit class TypeofeslintOps[Self <: Typeofeslint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAST(value: js.Any): Self = this.set("AST", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLIEngine(value: TypeofCLIEngine with TypeofCLIEngineOptions): Self = this.set("CLIEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def setESLint(value: TypeofESLint_): Self = this.set("ESLint", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinter(value: TypeofLinter): Self = this.set("Linter", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: js.Any): Self = this.set("Rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleTester(value: Instantiable0[RuleTester]): Self = this.set("RuleTester", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: js.Any): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCode(value: TypeofSourceCode): Self = this.set("SourceCode", value.asInstanceOf[js.Any])
  }
  
}

