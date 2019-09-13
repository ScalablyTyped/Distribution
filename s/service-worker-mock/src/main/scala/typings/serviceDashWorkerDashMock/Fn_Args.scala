package typings.serviceDashWorkerDashMock

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
trait Fn_Args extends js.Object {
  def apply(name: fetch, request: String): js.Promise[Unit] = js.native
  def apply(name: fetch, request: Request): js.Promise[Unit] = js.native
  def apply(name: message, args: Partial[MessageEvent]): js.Promise[Unit] = js.native
  def apply(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
  def apply(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
  def apply(
    name: push,
    args: Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PushEvent */ _
    ]
  ): js.Promise[Unit] = js.native
  def apply(`type`: String): js.Promise[Unit] = js.native
}

