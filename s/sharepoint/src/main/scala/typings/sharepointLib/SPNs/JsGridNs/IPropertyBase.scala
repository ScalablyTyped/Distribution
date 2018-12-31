package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IPropertyBase extends js.Object {
  def Clone(): IPropertyBase
  def GetData(): js.Any
  def GetLocalized(): java.lang.String
  def HasDataValue(): scala.Boolean
  def HasLocalizedValue(): scala.Boolean
  /** dataValue actually is cloned */
  def Update(dataValue: js.Any, localizedValue: java.lang.String): scala.Unit
}

