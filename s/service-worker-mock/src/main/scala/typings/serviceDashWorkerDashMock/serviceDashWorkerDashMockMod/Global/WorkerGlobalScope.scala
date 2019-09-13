package typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockMod.Global

import typings.serviceDashWorkerDashMock.Fn_Args
import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockMod.Listeners
import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockMod.Snapshot
import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockStrings.fetch
import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockStrings.message
import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockStrings.notificationclick
import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockStrings.notificationclose
import typings.serviceDashWorkerDashMock.serviceDashWorkerDashMockStrings.push
import typings.std.MessageEvent
import typings.std.Notification
import typings.std.Partial
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerGlobalScope extends js.Object {
  var listeners: Listeners = js.native
  @JSName("snapshot")
  var snapshot_Original: js.Function0[Snapshot] = js.native
  @JSName("trigger")
  var trigger_Original: Fn_Args = js.native
  def snapshot(): Snapshot = js.native
  def trigger(`type`: String): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_message(name: message, args: Partial[MessageEvent]): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_push(
    name: push,
    args: Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PushEvent */ _
    ]
  ): js.Promise[Unit] = js.native
}

