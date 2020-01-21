package typings.retryAsPromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  @JSName("$current")
  var $current: js.UndefOr[Double] = js.native
  var backoffBase: js.UndefOr[Double] = js.native
  var backoffExponent: js.UndefOr[Double] = js.native
  var `match`: js.UndefOr[js.Array[MatchOption] | MatchOption] = js.native
  var max: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var report: js.UndefOr[
    js.Function3[/* message */ String, /* obj */ Options, /* err */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

