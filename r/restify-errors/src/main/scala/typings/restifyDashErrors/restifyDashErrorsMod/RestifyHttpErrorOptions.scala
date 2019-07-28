package typings.restifyDashErrors.restifyDashErrorsMod

import typings.std.Error
import typings.verror.verrorMod.Info
import typings.verror.verrorMod.Options
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
    cause: Error = null,
    code: String = null,
    constructorOpt: /* repeated */ js.Any => Unit = null,
    context: js.Any = null,
    info: Info = null,
    message: String = null,
    name: String = null,
    statusCode: Int | Double = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RestifyHttpErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (code != null) __obj.updateDynamic("code")(code)
    if (constructorOpt != null) __obj.updateDynamic("constructorOpt")(js.Any.fromFunction1(constructorOpt))
    if (context != null) __obj.updateDynamic("context")(context)
    if (info != null) __obj.updateDynamic("info")(info)
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[RestifyHttpErrorOptions]
  }
}

