package typings.promiseDotPrototypeDotFinally.promiseDotPrototypeDotFinallyMod

import typings.promiseDotPrototypeDotFinally.promiseDotPrototypeDotFinallyMod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait Promise[T] extends js.Object {
    def `finally`[U](): Promise[T] = js.native
    def `finally`[U](onFinally: js.Function0[U | js.Thenable[U]]): Promise[T] = js.native
  }
  
}

