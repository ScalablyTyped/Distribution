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

