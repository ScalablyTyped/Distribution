package typings.restifyErrors.mod

import typings.std.Error
import typings.verror.mod.Info
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
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (constructorOpt != null) __obj.updateDynamic("constructorOpt")(js.Any.fromFunction1(constructorOpt))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (restCode != null) __obj.updateDynamic("restCode")(restCode.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestifyRestErrorOptions]
  }
}

