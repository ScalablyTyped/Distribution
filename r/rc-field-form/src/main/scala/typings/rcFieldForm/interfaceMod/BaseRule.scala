package typings.rcFieldForm.interfaceMod

import typings.react.mod.ReactElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRule extends RuleObject {
  var enum: js.UndefOr[js.Array[StoreValue]] = js.undefined
  var len: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String | ReactElement] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[RegExp] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[js.Function1[/* value */ StoreValue, StoreValue]] = js.undefined
  var `type`: js.UndefOr[RuleType] = js.undefined
  /** Customize rule level `validateTrigger`. Must be subset of Field `validateTrigger` */
  var validateTrigger: js.UndefOr[String | js.Array[String]] = js.undefined
  var validator: js.UndefOr[Validator] = js.undefined
  var whitespace: js.UndefOr[Boolean] = js.undefined
}

object BaseRule {
  @scala.inline
  def apply(
    enum: js.Array[StoreValue] = null,
    len: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    message: String | ReactElement = null,
    min: js.UndefOr[Double] = js.undefined,
    pattern: RegExp = null,
    required: js.UndefOr[Boolean] = js.undefined,
    transform: /* value */ StoreValue => StoreValue = null,
    `type`: RuleType = null,
    validateTrigger: String | js.Array[String] = null,
    validator: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => js.Promise[Unit] | Unit = null,
    whitespace: js.UndefOr[Boolean] = js.undefined
  ): BaseRule = {
    val __obj = js.Dynamic.literal()
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(len)) __obj.updateDynamic("len")(len.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validateTrigger != null) __obj.updateDynamic("validateTrigger")(validateTrigger.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction3(validator))
    if (!js.isUndefined(whitespace)) __obj.updateDynamic("whitespace")(whitespace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRule]
  }
}

