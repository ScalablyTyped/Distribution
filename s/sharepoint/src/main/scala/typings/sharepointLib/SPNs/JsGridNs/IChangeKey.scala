package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IChangeKey extends js.Object {
  def CompareTo(changeKey: IChangeKey): scala.Double
  def GetVersionNumber(): scala.Double
  def Release(): scala.Unit
  def Reserve(): scala.Unit
}

object IChangeKey {
  @scala.inline
  def apply(
    CompareTo: IChangeKey => scala.Double,
    GetVersionNumber: () => scala.Double,
    Release: () => scala.Unit,
    Reserve: () => scala.Unit
  ): IChangeKey = {
    val __obj = js.Dynamic.literal(CompareTo = js.Any.fromFunction1(CompareTo), GetVersionNumber = js.Any.fromFunction0(GetVersionNumber), Release = js.Any.fromFunction0(Release), Reserve = js.Any.fromFunction0(Reserve))
  
    __obj.asInstanceOf[IChangeKey]
  }
}

