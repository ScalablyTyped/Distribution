package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptional extends js.Object {
  var errorFilter: js.UndefOr[
    js.Function3[/* errorMsg */ String, /* errorCode */ String, /* type */ String, Unit]
  ] = js.undefined
  var messages: js.UndefOr[StringDictionary[String]] = js.undefined
  var overrideMessages: js.UndefOr[Boolean] = js.undefined
}

object ValidationOptional {
  @scala.inline
  def apply(
    errorFilter: (/* errorMsg */ String, /* errorCode */ String, /* type */ String) => Unit = null,
    messages: StringDictionary[String] = null,
    overrideMessages: js.UndefOr[Boolean] = js.undefined
  ): ValidationOptional = {
    val __obj = js.Dynamic.literal()
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction3(errorFilter))
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideMessages)) __obj.updateDynamic("overrideMessages")(overrideMessages.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptional]
  }
}

