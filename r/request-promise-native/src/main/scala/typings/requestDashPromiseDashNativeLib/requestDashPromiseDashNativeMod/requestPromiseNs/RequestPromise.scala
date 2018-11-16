package typings
package requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPromise[T]
  extends requestLib.requestMod.requestNs.Request {
  var `catch`: (js.Function0[stdLib.Promise[T | _]]) | (js.Function1[
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[T | _]
  ]) = js.native
  var `then`: js.Function0[stdLib.Promise[_]] | (js.Function1[
    /* onfulfilled */ js.Function1[/* value */ T, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.Function1[/* value */ T, _ | stdLib.PromiseLike[_]], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ js.UndefOr[scala.Nothing], 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) | (js.Function2[
    /* onfulfilled */ scala.Null, 
    /* onrejected */ js.Function1[/* reason */ js.Any, _ | stdLib.PromiseLike[_]], 
    stdLib.Promise[_]
  ]) = js.native
  def promise(): stdLib.Promise[T] = js.native
}

