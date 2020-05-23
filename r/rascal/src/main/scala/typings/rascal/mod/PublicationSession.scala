package typings.rascal.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rascal", "PublicationSession")
@js.native
class PublicationSession protected () extends EventEmitter {
  def this(vhost: Vhost, messageId: String) = this()
  def abort(): Unit = js.native
  def emitPaused(): Unit = js.native
  def isAborted(): Boolean = js.native
}

