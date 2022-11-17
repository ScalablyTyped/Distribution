package typings.rcFieldForm

import typings.rcFieldForm.esInterfaceMod.InternalNamePath
import typings.rcFieldForm.esInterfaceMod.RuleError
import typings.rcFieldForm.esInterfaceMod.RuleObject
import typings.rcFieldForm.esInterfaceMod.StoreValue
import typings.rcFieldForm.esInterfaceMod.ValidateOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsValidateUtilMod {
  
  @JSImport("rc-field-form/es/utils/validateUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.annotation.targetName("validateRules_parallel")
  inline def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: "parallel"
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
  @scala.annotation.targetName("validateRules_parallel")
  inline def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: "parallel",
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any], messageVariables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
  inline def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
  inline def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any], messageVariables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
}
