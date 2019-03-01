package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReconnectServerEventsOptions extends js.Object {
  var errorArgs: js.UndefOr[js.Array[_]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ReconnectServerEventsOptions {
  @scala.inline
  def apply(
    errorArgs: js.Array[_] = null,
    onerror: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    onmessage: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    url: java.lang.String = null
  ): ReconnectServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (errorArgs != null) __obj.updateDynamic("errorArgs")(errorArgs)
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (onmessage != null) __obj.updateDynamic("onmessage")(onmessage)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ReconnectServerEventsOptions]
  }
}

