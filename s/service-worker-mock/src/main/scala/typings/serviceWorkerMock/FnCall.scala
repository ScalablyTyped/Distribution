package typings.serviceWorkerMock

import typings.serviceWorkerMock.serviceWorkerMockStrings.fetch
import typings.serviceWorkerMock.serviceWorkerMockStrings.message
import typings.serviceWorkerMock.serviceWorkerMockStrings.notificationclick
import typings.serviceWorkerMock.serviceWorkerMockStrings.notificationclose
import typings.serviceWorkerMock.serviceWorkerMockStrings.push
import typings.std.Notification
import typings.std.Partial
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(name: fetch, request: String): js.Promise[Unit] = js.native
  def apply(name: fetch, request: Request): js.Promise[Unit] = js.native
  def apply(name: message, args: PartialMessageEvent): js.Promise[Unit] = js.native
  def apply(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
  def apply(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
  def apply(
    name: push,
    args: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
    ]
  ): js.Promise[Unit] = js.native
  def apply(
    `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
  ): js.Promise[Unit] = js.native
}

