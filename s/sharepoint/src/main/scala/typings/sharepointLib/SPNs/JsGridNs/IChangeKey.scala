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
    CompareTo: js.Function1[IChangeKey, scala.Double],
    GetVersionNumber: js.Function0[scala.Double],
    Release: js.Function0[scala.Unit],
    Reserve: js.Function0[scala.Unit]
  ): IChangeKey = {
    val __obj = js.Dynamic.literal(CompareTo = CompareTo, GetVersionNumber = GetVersionNumber, Release = Release, Reserve = Reserve)
  
    __obj.asInstanceOf[IChangeKey]
  }
}

