package typings
package revalidateLib.revalidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("revalidate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def combineValidators(validators: js.Any): revalidateLib.revalidateMod.ConfiguredCombinedValidator = js.native
  def combineValidators(validators: js.Any, options: revalidateLib.revalidateMod.CombineValidatorsOptions): revalidateLib.revalidateMod.ConfiguredCombinedValidator = js.native
  def composeValidators(firstValidator: js.Any, validators: revalidateLib.revalidateMod.Validator*): revalidateLib.revalidateMod.ComposedCurryableValidator = js.native
  def composeValidators(
    firstValidator: revalidateLib.revalidateMod.Validator,
    validators: revalidateLib.revalidateMod.Validator*
  ): revalidateLib.revalidateMod.ComposedCurryableValidator = js.native
  def createValidator(curriedDefinition: revalidateLib.revalidateMod.ValidatorImpl): revalidateLib.revalidateMod.ConfigurableValidator = js.native
  def createValidator(
    curriedDefinition: revalidateLib.revalidateMod.ValidatorImpl,
    defaultMessageCreator: revalidateLib.revalidateMod.MessageCreator
  ): revalidateLib.revalidateMod.ConfigurableValidator = js.native
  def hasLengthBetween(min: scala.Double, max: scala.Double): revalidateLib.revalidateMod.ConfigurableValidator = js.native
  def hasLengthGreaterThan(min: scala.Double): revalidateLib.revalidateMod.ConfigurableValidator = js.native
  def hasLengthLessThan(max: scala.Double): revalidateLib.revalidateMod.ConfigurableValidator = js.native
  def isAlphaNumeric(): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: java.lang.String): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: java.lang.String, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: java.lang.String, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: revalidateLib.revalidateMod.Config): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: revalidateLib.revalidateMod.Config, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphaNumeric(config: revalidateLib.revalidateMod.Config, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphabetic(): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: java.lang.String): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: java.lang.String, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: java.lang.String, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: revalidateLib.revalidateMod.Config): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: revalidateLib.revalidateMod.Config, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isAlphabetic(config: revalidateLib.revalidateMod.Config, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isNumeric(): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isNumeric(config: java.lang.String): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isNumeric(config: java.lang.String, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isNumeric(config: java.lang.String, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isNumeric(config: revalidateLib.revalidateMod.Config): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isNumeric(config: revalidateLib.revalidateMod.Config, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isNumeric(config: revalidateLib.revalidateMod.Config, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isOneOf(): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isOneOf(config: java.lang.String): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isOneOf(config: java.lang.String, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isOneOf(config: java.lang.String, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isOneOf(config: revalidateLib.revalidateMod.Config): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isOneOf(config: revalidateLib.revalidateMod.Config, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isOneOf(config: revalidateLib.revalidateMod.Config, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequired(): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequired(config: java.lang.String): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequired(config: java.lang.String, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequired(config: java.lang.String, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequired(config: revalidateLib.revalidateMod.Config): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequired(config: revalidateLib.revalidateMod.Config, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequired(config: revalidateLib.revalidateMod.Config, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequiredIf(): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: java.lang.String): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: java.lang.String, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: java.lang.String, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: revalidateLib.revalidateMod.Config): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: revalidateLib.revalidateMod.Config, value: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def isRequiredIf(config: revalidateLib.revalidateMod.Config, value: js.Any, allValues: js.Any): revalidateLib.revalidateMod.ConfiguredValidator | js.Any = js.native
  def matchesField(otherField: java.lang.String, otherFieldLabel: java.lang.String): revalidateLib.revalidateMod.ConfigurableValidator = js.native
  def matchesPattern(regex: stdLib.RegExp): revalidateLib.revalidateMod.ConfigurableValidator = js.native
}

