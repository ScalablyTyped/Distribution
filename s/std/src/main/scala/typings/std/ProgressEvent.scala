package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events measuring progress of an underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of the underlying resource of an <img>, <audio>, <video>, <style> or <link>). */
@js.native
trait ProgressEvent[T /* <: EventTarget */] extends Event {
  val lengthComputable: scala.Boolean = js.native
  val loaded: Double = js.native
  @JSName("target")
  val target_ProgressEvent: T | Null = js.native
  val total: Double = js.native
}

