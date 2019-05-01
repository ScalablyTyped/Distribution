package typings
package requestDashPromiseLib.requestDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPromise
  extends requestLib.requestMod.Request {
  @JSName("cancel")
  var cancel_Original: js.Function0[scala.Unit] = js.native
  @JSName("catch")
  var catch_Original: requestDashPromiseLib.Anon_ErrorFilter1 = js.native
  @JSName("finally")
  var finally_Original: js.Function1[
    /* handler */ js.Function0[bluebirdLib.bluebirdMod.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ] = js.native
  @JSName("then")
  var then_Original: requestDashPromiseLib.Anon_Error = js.native
  def cancel(): scala.Unit = js.native
  def `catch`[U](): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U](onReject: js.Function1[/* error */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]]): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1](
    // tslint:disable-next-line:unified-signatures
  filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    onReject: js.Function1[/* error */ E1, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1] | bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2] | bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3] | bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4] | bluebirdLib.bluebirdMod.CatchFilter[E4],
    filter5: bluebirdLib.bluebirdMod.Constructor[E5] | bluebirdLib.bluebirdMod.CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    filter5: bluebirdLib.bluebirdMod.Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def `finally`(handler: js.Function0[bluebirdLib.bluebirdMod.Resolvable[_]]): bluebirdLib.bluebirdMod.Bluebird[_] = js.native
  def promise(): bluebirdLib.bluebirdMod.^[_] = js.native
  def `then`[U](): bluebirdLib.bluebirdMod.Bluebird[U] = js.native
  def `then`[U](onFulfill: js.Function1[/* value */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]]): bluebirdLib.bluebirdMod.Bluebird[U] = js.native
  def `then`[U](
    onFulfill: js.Function1[/* value */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]],
    onReject: js.Function1[/* error */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Thenable[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Thenable[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](): bluebirdLib.bluebirdMod.Bluebird[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](onfulfilled: js.Function1[/* value */ js.Any, bluebirdLib.bluebirdMod.Resolvable[TResult1]]): bluebirdLib.bluebirdMod.Bluebird[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ js.Any, bluebirdLib.bluebirdMod.Resolvable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, bluebirdLib.bluebirdMod.Resolvable[TResult2]]
  ): bluebirdLib.bluebirdMod.Bluebird[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2Bluebird[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, bluebirdLib.bluebirdMod.Resolvable[TResult2]]
  ): bluebirdLib.bluebirdMod.Bluebird[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2Thenable[TResult1, TResult2](): js.Thenable[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2Thenable[TResult1, TResult2](onfulfilled: js.Function1[/* value */ js.Any, TResult1 | js.Thenable[TResult1]]): js.Thenable[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2Thenable[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ js.Any, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Thenable[TResult1 | TResult2] = js.native
}

