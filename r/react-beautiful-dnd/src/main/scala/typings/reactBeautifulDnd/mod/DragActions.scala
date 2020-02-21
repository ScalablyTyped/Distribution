package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragActions extends js.Object {
  def cancel(): Unit = js.native
  def cancel(args: StopDragOptions): Unit = js.native
  def drop(): Unit = js.native
  def drop(args: StopDragOptions): Unit = js.native
  def isActive(): Boolean = js.native
  def shouldRespectForcePress(): Boolean = js.native
}

