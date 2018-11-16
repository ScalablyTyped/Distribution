package typings
package slocketLib.slocketMod.slocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slocket
  extends nodeLib.eventsMod.EventEmitter {
  def `catch`[TResult](): stdLib.Promise[Lock | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | stdLib.PromiseLike[TResult]]): stdLib.Promise[Lock | TResult] = js.native
  def `then`[TResult1, TResult2](): stdLib.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Lock, TResult1 | stdLib.PromiseLike[TResult1]]): stdLib.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ Lock, TResult1 | stdLib.PromiseLike[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]]
  ): stdLib.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]]
  ): stdLib.Promise[TResult1 | TResult2] = js.native
}

