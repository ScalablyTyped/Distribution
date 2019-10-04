package typings.relayDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilRelayProfilerMod {
  import typings.std.Error

  type Handler = js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]
  type ProfileHandler = js.Function2[
    /* name */ String, 
    /* state */ js.UndefOr[js.Any], 
    js.Function1[/* error */ js.UndefOr[Error], Unit]
  ]
}
