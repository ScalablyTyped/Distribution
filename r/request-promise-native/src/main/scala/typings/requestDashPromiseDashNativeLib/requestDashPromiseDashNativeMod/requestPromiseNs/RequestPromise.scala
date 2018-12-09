package typings
package requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPromise[T]
  extends requestLib.requestMod.requestNs.Request {
  var `catch`: (js.Function0[js.Promise[T | _]]) | (js.Function1[
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[T | _]
  ]) = js.native
  var `then`: js.Function0[js.Promise[_]] | (js.Function1[/* onfulfilled */ js.Function1[/* value */ T, _ | js.Thenable[_]], js.Promise[_]]) | (js.Function2[
    /* onfulfilled */ js.Function1[/* value */ T, _ | js.Thenable[_]], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.UndefOr[scala.Nothing], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ scala.Null, 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | js.Thenable[_]], 
    js.Promise[_]
  ]) = js.native
  def promise(): js.Promise[T] = js.native
}

