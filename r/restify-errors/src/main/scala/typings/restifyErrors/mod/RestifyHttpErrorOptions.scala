package typings.restifyErrors.mod

import typings.std.Error
import typings.verror.mod.Info
import typings.verror.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestifyHttpErrorOptions extends Options {
  var code: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object RestifyHttpErrorOptions {
  @scala.inline
  def apply(
    cause: js.UndefOr[Null | Error] = js.undefined,
    code: String = null,
    constructorOpt: /* repeated */ js.Any => Unit = null,
    context: js.Any = null,
    info: Info = null,
    message: String = null,
    name: String = null,
    statusCode: js.UndefOr[Double] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RestifyHttpErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cause)) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (constructorOpt != null) __obj.updateDynamic("constructorOpt")(js.Any.fromFunction1(constructorOpt))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestifyHttpErrorOptions]
  }
}

