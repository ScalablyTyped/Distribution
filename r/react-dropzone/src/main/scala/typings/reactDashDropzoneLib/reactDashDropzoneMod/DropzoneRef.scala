package typings
package reactDashDropzoneLib.reactDashDropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneRef extends js.Object {
  def open(): scala.Unit
}

object DropzoneRef {
  @scala.inline
  def apply(open: () => scala.Unit): DropzoneRef = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[DropzoneRef]
  }
}

