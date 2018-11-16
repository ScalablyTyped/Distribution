package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name

trait ILookupPropertyType extends IPropertyType {
  def DataToLocalized(dataValue: js.Any): java.lang.String
  def GetImageSource(record: IRecord, dataValue: js.Any): java.lang.String
  def GetIsLimitedToList(): scala.Boolean
  def GetItems(fnCallback: js.Any): scala.Unit
  def GetSerializableLookupPropType(): sharepointLib.Anon_BLimitToList
  def GetStyleId(dataValue: js.Any): java.lang.String
  def LocalizedToData(localized: java.lang.String): js.Any
}

