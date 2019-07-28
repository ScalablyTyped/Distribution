package typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockMod.Global

import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockMod.Listeners
import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockMod.Snapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerGlobalScope extends js.Object {
  var listeners: Listeners = js.native
  @JSName("snapshot")
  var snapshot_Original: js.Function0[Snapshot] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, js.Promise[Unit]] = js.native
  def snapshot(): Snapshot = js.native
  def trigger(`type`: String): js.Promise[Unit] = js.native
}

