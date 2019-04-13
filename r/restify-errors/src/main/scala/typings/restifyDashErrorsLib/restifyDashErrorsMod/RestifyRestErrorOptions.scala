package typings
package restifyDashErrorsLib.restifyDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestifyRestErrorOptions extends RestifyHttpErrorOptions {
  var restCode: js.UndefOr[java.lang.String] = js.undefined
}

object RestifyRestErrorOptions {
  @scala.inline
  def apply(
    cause: stdLib.Error = null,
    code: java.lang.String = null,
    constructorOpt: /* repeated */ js.Any => scala.Unit = null,
    context: js.Any = null,
    info: verrorLib.verrorMod.Info = null,
    message: java.lang.String = null,
    name: java.lang.String = null,
    restCode: java.lang.String = null,
    statusCode: scala.Int | scala.Double = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
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

