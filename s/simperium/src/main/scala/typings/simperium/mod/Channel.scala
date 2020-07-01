package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel[T] extends CustomEventEmitter[ChannelEvent[T]] {
  var localQueue: LocalQueue[T] = js.native
  def sendIndexRequest(): Unit = js.native
}

