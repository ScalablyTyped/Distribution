package typings
package retryDashAsDashPromisedLib.retryDashAsDashPromisedMod.retryAsPromisedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  @JSName("$current")
  var $current: js.UndefOr[scala.Double] = js.undefined
  var backoffBase: js.UndefOr[scala.Double] = js.undefined
  var backoffExponent: js.UndefOr[scala.Double] = js.undefined
  var `match`: js.UndefOr[js.Array[MatchOption] | MatchOption] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var report: js.UndefOr[
    js.Function3[
      /* message */ java.lang.String, 
      /* obj */ Options, 
      /* err */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

