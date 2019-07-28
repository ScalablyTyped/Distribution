package typings.restifyDashErrors.restifyDashErrorsMod

import typings.std.Error
import typings.verror.verrorMod.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestifyRestErrorOptions extends RestifyHttpErrorOptions {
  var restCode: js.UndefOr[String] = js.undefined
}

object RestifyRestErrorOptions {
  @scala.inline
  def apply(
    cause: Error = null,
    code: String = null,
    constructorOpt: /* repeated */ js.Any => Unit = null,
    context: js.Any = null,
    info: Info = null,
    message: String = null,
    name: String = null,
    restCode: String = null,
    statusCode: Int | Double = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RestifyRestErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (code != null) __obj.updateDynamic("code")(code)
    if (constructorOpt != null) __obj.updateDynamic("constructorOpt")(js.Any.fromFunction1(constructorOpt))
    if (context != null) __obj.updateDynamic("context")(context)
    if (info != null) __obj.updateDynamic("info")(info)
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (restCode != null) __obj.updateDynamic("restCode")(restCode)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[RestifyRestErrorOptions]
  }
}

