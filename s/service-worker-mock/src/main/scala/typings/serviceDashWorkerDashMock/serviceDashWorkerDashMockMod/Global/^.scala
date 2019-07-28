package typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockMod.Global

import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockMod.Listeners
import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockMod.Snapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * A key/value map of active listeners (`install`/`activate`/`fetch`/etc).
    */
  val listeners: Listeners = js.native
  /**
    * Used to generate a snapshot of the service worker internals.
    */
  def snapshot(): Snapshot = js.native
  /**
    * Used to trigger active listeners.
    */
  def trigger(`type`: String): js.Promise[Unit] = js.native
}

