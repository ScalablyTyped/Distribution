package typings.rnFetchBlob.mod

import typings.rnFetchBlob.anon.Count
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulPromise[T]
  extends StObject
     with Promise[T] {
  
  /**
    * Cancel the request when invoke this method.
    */
  def cancel(): StatefulPromise[FetchBlobResponse] = js.native
  def cancel(cb: js.Function1[/* reason */ Any, Unit]): StatefulPromise[FetchBlobResponse] = js.native
  
  /**
    * An IOS only API, when IOS app turns into background network tasks will be terminated after ~180 seconds,
    * in order to handle these expired tasks, you can register an event handler, which will be called after the
    * app become active.
    */
  def expire(callback: js.Function0[Unit]): StatefulPromise[Unit] = js.native
  
  /**
    * Add an event listener which triggers when data receiving from server.
    */
  def progress(callback: js.Function2[/* received */ Double, /* total */ Double, Unit]): StatefulPromise[FetchBlobResponse] = js.native
  /**
    * Add an event listener with custom configuration
    */
  def progress(config: Count, callback: js.Function2[/* received */ Double, /* total */ Double, Unit]): StatefulPromise[FetchBlobResponse] = js.native
  
  /**
    * Add an event listener with custom configuration.
    */
  def uploadProgress(callback: js.Function2[/* sent */ Double, /* total */ Double, Unit]): StatefulPromise[FetchBlobResponse] = js.native
  /**
    * Add an event listener with custom configuration
    */
  def uploadProgress(config: Count, callback: js.Function2[/* sent */ Double, /* total */ Double, Unit]): StatefulPromise[FetchBlobResponse] = js.native
}
