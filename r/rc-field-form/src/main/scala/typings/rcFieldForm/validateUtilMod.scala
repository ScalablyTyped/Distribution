package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.RuleObject
import typings.rcFieldForm.interfaceMod.StoreValue
import typings.rcFieldForm.interfaceMod.ValidateOptions
import typings.rcFieldForm.rcFieldFormStrings.parallel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateUtilMod {
  
  @JSImport("rc-field-form/es/utils/validateUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean
  ): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any], messageVariables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def validateRules_parallel(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: parallel
  ): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def validateRules_parallel(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: parallel,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any], messageVariables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
