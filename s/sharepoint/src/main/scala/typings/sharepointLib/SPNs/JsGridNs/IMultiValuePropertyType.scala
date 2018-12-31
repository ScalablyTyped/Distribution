package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IMultiValuePropertyType extends IPropertyType {
  var bMultiValue: scala.Boolean
  var separator: java.lang.String
  var singleValuePropType: java.lang.String
  def GetSerializableMultiValuePropType(): sharepointLib.Anon_BDelayInit
  def InitSingleValuePropType(): scala.Unit
  def LocStrArrayToLocStr(locStrArray: js.Array[java.lang.String]): java.lang.String
  def LocStrToLocStrArray(locStr: java.lang.String): js.Array[java.lang.String]
}

