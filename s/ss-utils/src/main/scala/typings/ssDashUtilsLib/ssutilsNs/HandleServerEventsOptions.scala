package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HandleServerEventsOptions extends js.Object {
  var handlers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Function]] = js.undefined
  var heartbeatIntervalMs: js.UndefOr[scala.Double] = js.undefined
  var heartbeatUrl: js.UndefOr[java.lang.String] = js.undefined
  var receivers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* selector */ java.lang.String, 
      /* msg */ java.lang.String, 
      /* e */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var unRegisterUrl: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[
    js.Function4[
      /* op */ js.UndefOr[java.lang.String], 
      /* target */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      /* json */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
}

