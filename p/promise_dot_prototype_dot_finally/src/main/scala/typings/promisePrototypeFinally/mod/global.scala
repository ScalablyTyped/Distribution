package typings.promisePrototypeFinally.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  trait Promise[T] extends js.Object {
    def `finally`[U](): Promise[T] = js.native
    def `finally`[U](onFinally: js.Function0[U | js.Thenable[U]]): Promise[T] = js.native
  }
  
}

