package typings.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type BasicType = java.lang.String | js.Array[js.Any] | js.Object | scala.Double
  type LogFn = js.Function2[/* template */ java.lang.String, /* repeated */ java.lang.String, scala.Unit]
  type Middleware = js.Function1[
    /* ctx */ typings.server.commonMod.Context, 
    typings.server.replyMod.Reply | typings.server.commonMod.BasicType | scala.Unit
  ]
  type Middlewares = js.Array[
    typings.server.commonMod.Middleware | js.Array[typings.server.commonMod.Middleware]
  ]
}
