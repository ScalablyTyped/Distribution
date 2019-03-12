package typings
package requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPromise
  extends requestLib.requestMod.requestNs.Request {
  @JSName("cancel")
  var cancel_Original: js.Function0[scala.Unit] = js.native
  var `catch`: (js.Function1[
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | js.Function0[bluebirdLib.bluebirdMod.Bluebird[_]] | (js.Function6[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* filter5 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function6[
    /* filter1 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter5 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function2[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function2[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) = js.native
  @JSName("finally")
  var finally_Original: js.Function1[
    /* handler */ js.Function0[bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ] = js.native
  var `then`: js.Function0[bluebirdLib.bluebirdMod.Bluebird[_]] | (js.Function1[
    /* onFulfill */ js.Function1[/* value */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function2[
    /* onFulfill */ js.Function1[/* value */ js.Any, bluebirdLib.Resolvable[_]], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function2[
    /* onfulfilled */ scala.Null, 
    /* onrejected */ js.Function1[/* reason */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | js.Function0[js.Thenable[_]] | (js.Function1[
    /* onfulfilled */ js.Function1[/* value */ js.Any, _ | js.Thenable[_]], 
    js.Thenable[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.Function1[/* value */ js.Any, _ | js.Thenable[_]], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Thenable[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.UndefOr[scala.Nothing], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Thenable[_]
  ]) | (js.Function2[
    /* onfulfilled */ scala.Null, 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Thenable[_]
  ]) = js.native
  def cancel(): scala.Unit = js.native
  def `finally`(handler: js.Function0[bluebirdLib.Resolvable[_]]): bluebirdLib.bluebirdMod.Bluebird[_] = js.native
  def promise(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}

