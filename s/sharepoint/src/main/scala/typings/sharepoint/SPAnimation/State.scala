package typings.sharepoint.SPAnimation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  def GetAttribute(attributeId: Attribute): Double = js.native
  def GetDataIndex(attributeId: Attribute): Double = js.native
  def SetAttribute(attributeId: Attribute, value: Double): Unit = js.native
}

object State {
  @scala.inline
  def apply(
    GetAttribute: Attribute => Double,
    GetDataIndex: Attribute => Double,
    SetAttribute: (Attribute, Double) => Unit
  ): State = {
    val __obj = js.Dynamic.literal(GetAttribute = js.Any.fromFunction1(GetAttribute), GetDataIndex = js.Any.fromFunction1(GetDataIndex), SetAttribute = js.Any.fromFunction2(SetAttribute))
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setGetAttribute(value: Attribute => Double): Self = this.set("GetAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDataIndex(value: Attribute => Double): Self = this.set("GetDataIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAttribute(value: (Attribute, Double) => Unit): Self = this.set("SetAttribute", js.Any.fromFunction2(value))
  }
  
}

