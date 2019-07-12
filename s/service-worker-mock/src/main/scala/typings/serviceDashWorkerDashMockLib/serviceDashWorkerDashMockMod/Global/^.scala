package typings
package serviceDashWorkerDashMockLib.serviceDashWorkerDashMockMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * A key/value map of active listeners (`install`/`activate`/`fetch`/etc).
    */
  val listeners: serviceDashWorkerDashMockLib.serviceDashWorkerDashMockMod.Listeners = js.native
  /**
    * Used to generate a snapshot of the service worker internals.
    */
  def snapshot(): serviceDashWorkerDashMockLib.serviceDashWorkerDashMockMod.Snapshot = js.native
  /**
    * Used to trigger active listeners.
    */
  def trigger(`type`: java.lang.String): js.Promise[scala.Unit] = js.native
}

