package typings.reactMdAlert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snackbarQueueMod {
  type ActionEventHandler[M /* <: typings.reactMdAlert.messageQueueContextMod.ToastMessage */] = js.Function2[
    /* message */ M, 
    /* event */ typings.react.mod.MouseEvent[typings.std.HTMLButtonElement, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
}
