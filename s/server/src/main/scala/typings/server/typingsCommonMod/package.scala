package typings.server

import typings.server.replyMod.Reply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsCommonMod {
  type BasicType = String | js.Array[js.Any] | js.Object | Double
  type LogFn = js.Function2[/* template */ String, /* repeated */ String, Unit]
  type Middleware = js.Function1[/* ctx */ Context, Reply | BasicType | Unit]
  type Middlewares = js.Array[Middleware | js.Array[Middleware]]
}
