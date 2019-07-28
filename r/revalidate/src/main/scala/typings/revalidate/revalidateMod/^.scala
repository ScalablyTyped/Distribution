package typings.revalidate.revalidateMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("revalidate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def combineValidators(validators: js.Any): ConfiguredCombinedValidator = js.native
  def combineValidators(validators: js.Any, options: CombineValidatorsOptions): ConfiguredCombinedValidator = js.native
  def composeValidators(firstValidator: js.Any, validators: Validator*): ComposedCurryableValidator = js.native
  def composeValidators(firstValidator: Validator, validators: Validator*): ComposedCurryableValidator = js.native
  def createValidator(curriedDefinition: ValidatorImpl): ConfigurableValidator = js.native
  def createValidator(curriedDefinition: ValidatorImpl, defaultMessageCreator: MessageCreator): ConfigurableValidator = js.native
  def hasLengthBetween(min: Double, max: Double): ConfigurableValidator = js.native
  def hasLengthGreaterThan(min: Double): ConfigurableValidator = js.native
  def hasLengthLessThan(max: Double): ConfigurableValidator = js.native
  def isAlphaNumeric(): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: String): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: Config): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: String): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: Config): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isNumeric(): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: String): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: Config): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isOneOf(): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: String): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: Config): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequired(): ConfiguredValidator | js.Any = js.native
  def isRequired(config: String): ConfiguredValidator | js.Any = js.native
  def isRequired(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequired(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequired(config: Config): ConfiguredValidator | js.Any = js.native
  def isRequired(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequired(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: String): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: Config): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def matchesField(otherField: String, otherFieldLabel: String): ConfigurableValidator = js.native
  def matchesPattern(regex: RegExp): ConfigurableValidator = js.native
}

