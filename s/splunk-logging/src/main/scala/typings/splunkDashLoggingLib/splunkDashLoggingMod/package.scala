package typings
package splunkDashLoggingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object splunkDashLoggingMod {
  type Callback = js.Function3[/* error */ js.UndefOr[stdLib.Error], /* req */ js.Any, /* res */ js.Any, scala.Unit]
  type EventFormatter = js.Function2[/* message */ js.Any, /* severity */ java.lang.String, js.Any]
}
