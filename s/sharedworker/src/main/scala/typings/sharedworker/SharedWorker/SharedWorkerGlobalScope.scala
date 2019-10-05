package typings.sharedworker.SharedWorker

import typings.std.MessageEvent
import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkerGlobalScope extends Worker {
  def onconnect(event: MessageEvent): Unit = js.native
}

