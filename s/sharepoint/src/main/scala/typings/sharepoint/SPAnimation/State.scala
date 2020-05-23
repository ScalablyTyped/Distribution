package typings.sharepoint.SPAnimation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  def GetAttribute(attributeId: Attribute): Double
  def GetDataIndex(attributeId: Attribute): Double
  def SetAttribute(attributeId: Attribute, value: Double): Unit
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
}

