package typings.sharedworker.SharedWorker

import typings.std.ErrorEvent
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractWorker extends EventTarget {
  def onerror(ev: ErrorEvent): js.Any = js.native
}

