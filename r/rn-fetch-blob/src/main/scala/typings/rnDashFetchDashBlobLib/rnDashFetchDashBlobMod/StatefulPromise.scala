package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulPromise[T]
  extends stdLib.Promise[T] {
  /**
    * Cancel the request when invoke this method.
    */
  def cancel(): StatefulPromise[FetchBlobResponse] = js.native
  def cancel(cb: js.Function1[/* reason */ js.Any, scala.Unit]): StatefulPromise[FetchBlobResponse] = js.native
  /**
    * An IOS only API, when IOS app turns into background network tasks will be terminated after ~180 seconds,
    * in order to handle these expired tasks, you can register an event handler, which will be called after the
    * app become active.
    */
  def expire(callback: js.Function0[scala.Unit]): StatefulPromise[scala.Unit] = js.native
  /**
    * Add an event listener which triggers when data receiving from server.
    */
  def progress(callback: js.Function2[/* received */ scala.Double, /* total */ scala.Double, scala.Unit]): StatefulPromise[FetchBlobResponse] = js.native
  /**
    * Add an event listener with custom configuration
    */
  def progress(
    config: rnDashFetchDashBlobLib.Anon_Count,
    callback: js.Function2[/* received */ scala.Double, /* total */ scala.Double, scala.Unit]
  ): StatefulPromise[FetchBlobResponse] = js.native
  /**
    * Add an event listener with custom configuration.
    */
  def uploadProgress(callback: js.Function2[/* sent */ scala.Double, /* total */ scala.Double, scala.Unit]): StatefulPromise[FetchBlobResponse] = js.native
  /**
    * Add an event listener with custom configuration
    */
  def uploadProgress(
    config: rnDashFetchDashBlobLib.Anon_Count,
    callback: js.Function2[/* sent */ scala.Double, /* total */ scala.Double, scala.Unit]
  ): StatefulPromise[FetchBlobResponse] = js.native
}

