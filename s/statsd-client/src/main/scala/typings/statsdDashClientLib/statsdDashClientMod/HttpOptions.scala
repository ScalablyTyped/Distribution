package typings
package statsdDashClientLib.statsdDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HttpOptions extends CommonOptions {
  /**
       * Additional headers to send (default {}).
       */
  var headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
       * Where to send the stats (default localhost).
       */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
       * What HTTP method to use (default "PUT").
       */
  var method: js.UndefOr[java.lang.String] = js.undefined
}

