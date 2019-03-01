package typings
package restifyDashErrorsLib.restifyDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestifyHttpErrorOptions
  extends verrorLib.verrorMod.VErrorNs.Options {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object RestifyHttpErrorOptions {
  @scala.inline
  def apply(
    cause: stdLib.Error = null,
    code: java.lang.String = null,
    constructorOpt: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    context: js.Any = null,
    info: verrorLib.verrorMod.VErrorNs.Info = null,
    message: java.lang.String = null,
    name: java.lang.String = null,
    statusCode: scala.Int | scala.Double = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): RestifyHttpErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (code != null) __obj.updateDynamic("code")(code)
    if (constructorOpt != null) __obj.updateDynamic("constructorOpt")(constructorOpt)
    if (context != null) __obj.updateDynamic("context")(context)
    if (info != null) __obj.updateDynamic("info")(info)
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[RestifyHttpErrorOptions]
  }
}

