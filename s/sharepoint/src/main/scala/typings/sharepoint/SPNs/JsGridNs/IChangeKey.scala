package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IChangeKey extends js.Object {
  def CompareTo(changeKey: IChangeKey): Double
  def GetVersionNumber(): Double
  def Release(): Unit
  def Reserve(): Unit
}

object IChangeKey {
  @scala.inline
  def apply(
    CompareTo: IChangeKey => Double,
    GetVersionNumber: () => Double,
    Release: () => Unit,
    Reserve: () => Unit
  ): IChangeKey = {
    val __obj = js.Dynamic.literal(CompareTo = js.Any.fromFunction1(CompareTo), GetVersionNumber = js.Any.fromFunction0(GetVersionNumber), Release = js.Any.fromFunction0(Release), Reserve = js.Any.fromFunction0(Reserve))
  
    __obj.asInstanceOf[IChangeKey]
  }
}

