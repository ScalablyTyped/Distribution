package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptional extends js.Object {
  var errorFilter: js.UndefOr[
    js.Function3[
      /* errorMsg */ java.lang.String, 
      /* errorCode */ java.lang.String, 
      /* type */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var messages: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var overrideMessages: js.UndefOr[scala.Boolean] = js.undefined
}

object ValidationOptional {
  @scala.inline
  def apply(
    errorFilter: js.Function3[
      /* errorMsg */ java.lang.String, 
      /* errorCode */ java.lang.String, 
      /* type */ java.lang.String, 
      scala.Unit
    ] = null,
    messages: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    overrideMessages: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidationOptional = {
    val __obj = js.Dynamic.literal()
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(errorFilter)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(overrideMessages)) __obj.updateDynamic("overrideMessages")(overrideMessages)
    __obj.asInstanceOf[ValidationOptional]
  }
}

