package typings.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scserversocketMod {
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type EmitCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* eventObject */ typings.socketclusterServer.scserversocketMod.EventObject, 
    scala.Unit
  ]
}
