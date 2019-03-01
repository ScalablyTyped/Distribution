package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefObject extends js.Object {
  var current: js.Any
}

object RefObject {
  @scala.inline
  def apply(current: js.Any): RefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.asInstanceOf[RefObject]
  }
}

