package typings
package serverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsCommonMod {
  type BasicType = java.lang.String | js.Array[js.Any] | js.Object | scala.Double
  type LogLevel = serverLib.serverLibStrings.emergency | serverLib.serverLibStrings.alert | serverLib.serverLibStrings.critical | serverLib.serverLibStrings.error | serverLib.serverLibStrings.warning | serverLib.serverLibStrings.notice | serverLib.serverLibStrings.info | serverLib.serverLibStrings.debug
  type Middleware = js.Function1[/* ctx */ Context, serverLib.replyMod.Reply | BasicType | scala.Unit]
  type Middlewares = js.Array[Middleware | js.Array[Middleware]]
}
