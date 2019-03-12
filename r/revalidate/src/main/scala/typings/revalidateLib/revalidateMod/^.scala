package typings
package revalidateLib.revalidateMod

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
  def hasLengthBetween(min: scala.Double, max: scala.Double): ConfigurableValidator = js.native
  def hasLengthGreaterThan(min: scala.Double): ConfigurableValidator = js.native
  def hasLengthLessThan(max: scala.Double): ConfigurableValidator = js.native
  def isAlphaNumeric(): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: java.lang.String): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: java.lang.String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: java.lang.String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: Config): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: java.lang.String): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: java.lang.String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: java.lang.String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: Config): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isNumeric(): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: java.lang.String): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: java.lang.String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: java.lang.String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: Config): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isNumeric(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isOneOf(): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: java.lang.String): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: java.lang.String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: java.lang.String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: Config): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isOneOf(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequired(): ConfiguredValidator | js.Any = js.native
  def isRequired(config: java.lang.String): ConfiguredValidator | js.Any = js.native
  def isRequired(config: java.lang.String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequired(config: java.lang.String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequired(config: Config): ConfiguredValidator | js.Any = js.native
  def isRequired(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequired(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: java.lang.String): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: java.lang.String, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: java.lang.String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: Config): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  def matchesField(otherField: java.lang.String, otherFieldLabel: java.lang.String): ConfigurableValidator = js.native
  def matchesPattern(regex: stdLib.RegExp): ConfigurableValidator = js.native
}

