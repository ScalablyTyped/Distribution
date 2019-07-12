package typings
package serviceDashWorkerDashMockLib.serviceDashWorkerDashMockMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerGlobalScope extends js.Object {
  var listeners: serviceDashWorkerDashMockLib.serviceDashWorkerDashMockMod.Listeners = js.native
  @JSName("snapshot")
  var snapshot_Original: js.Function0[serviceDashWorkerDashMockLib.serviceDashWorkerDashMockMod.Snapshot] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ java.lang.String, js.Promise[scala.Unit]] = js.native
  def snapshot(): serviceDashWorkerDashMockLib.serviceDashWorkerDashMockMod.Snapshot = js.native
  def trigger(`type`: java.lang.String): js.Promise[scala.Unit] = js.native
}

