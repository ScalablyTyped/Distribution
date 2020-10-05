package typings.rcPicker.timeBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyOperationRef extends js.Object {
  def onUpDown(diff: Double): Unit = js.native
}

object BodyOperationRef {
  @scala.inline
  def apply(onUpDown: Double => Unit): BodyOperationRef = {
    val __obj = js.Dynamic.literal(onUpDown = js.Any.fromFunction1(onUpDown))
    __obj.asInstanceOf[BodyOperationRef]
  }
  @scala.inline
  implicit class BodyOperationRefOps[Self <: BodyOperationRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnUpDown(value: Double => Unit): Self = this.set("onUpDown", js.Any.fromFunction1(value))
  }
  
}

