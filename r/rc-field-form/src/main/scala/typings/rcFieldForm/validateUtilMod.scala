package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.RuleObject
import typings.rcFieldForm.interfaceMod.StoreValue
import typings.rcFieldForm.interfaceMod.ValidateOptions
import typings.rcFieldForm.rcFieldFormStrings.parallel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateUtilMod {
  
  @JSImport("rc-field-form/es/utils/validateUtil", "validateRules")
  @js.native
  def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean
  ): js.Promise[js.Array[String]] = js.native
  @JSImport("rc-field-form/es/utils/validateUtil", "validateRules")
  @js.native
  def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[String]] = js.native
  @JSImport("rc-field-form/es/utils/validateUtil", "validateRules")
  @js.native
  def validateRules_parallel(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: parallel
  ): js.Promise[js.Array[String]] = js.native
  @JSImport("rc-field-form/es/utils/validateUtil", "validateRules")
  @js.native
  def validateRules_parallel(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: parallel,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[String]] = js.native
}
