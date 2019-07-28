package typings.reactDashDropzone.reactDashDropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneRef extends js.Object {
  def open(): Unit
}

object DropzoneRef {
  @scala.inline
  def apply(open: () => Unit): DropzoneRef = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[DropzoneRef]
  }
}

