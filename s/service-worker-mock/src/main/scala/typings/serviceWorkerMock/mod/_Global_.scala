package typings.serviceWorkerMock.mod

import typings.serviceWorkerMock.FnCall
import typings.serviceWorkerMock.PartialMessageEvent
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

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait WorkerGlobalScope extends js.Object {
    var listeners: Listeners = js.native
    @JSName("snapshot")
    var snapshot_Original: js.Function0[Snapshot] = js.native
    @JSName("trigger")
    var trigger_Original: FnCall = js.native
    def snapshot(): Snapshot = js.native
    def trigger(
      `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
    ): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_message(name: message, args: PartialMessageEvent): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_push(
      name: push,
      args: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
        ]
    ): js.Promise[Unit] = js.native
  }
  
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
  def trigger(
    `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
  ): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_message(name: message, args: PartialMessageEvent): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_push(
    name: push,
    args: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
    ]
  ): js.Promise[Unit] = js.native
}

