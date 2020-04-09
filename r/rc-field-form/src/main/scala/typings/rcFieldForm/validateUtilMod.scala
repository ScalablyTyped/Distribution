package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.RuleObject
import typings.rcFieldForm.interfaceMod.StoreValue
import typings.rcFieldForm.interfaceMod.ValidateOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-field-form/lib/utils/validateUtil", JSImport.Namespace)
@js.native
object validateUtilMod extends js.Object {
  def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean
  ): js.Promise[js.Array[String]] = js.native
  def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[String]] = js.native
}

