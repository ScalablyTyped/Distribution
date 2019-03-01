package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IRecord extends js.Object {
  /** True if this is an entry row */
  var bIsNewRow: scala.Boolean
  /** Please use SetProp and GetProp */
  var properties: org.scalablytyped.runtime.StringDictionary[IPropertyBase]
  /** Update the specified field with the specified value */
  def AddFieldValue(fieldKey: java.lang.String, value: js.Any): scala.Unit
  /** returns raw data value for the specified field */
  def GetDataValue(fieldKey: java.lang.String): js.Any
  /** returns localized text value for the specified field */
  def GetLocalizedValue(fieldKey: java.lang.String): java.lang.String
  def GetProp(fieldKey: java.lang.String): IPropertyBase
  /** returns true if data value for the specified field is available */
  def HasDataValue(fieldKey: java.lang.String): scala.Boolean
  /** returns true if localized text value for the specified field is available */
  def HasLocalizedValue(fieldKey: java.lang.String): scala.Boolean
  /** Removes value of the specified field.
    Does not refresh the view. */
  def RemoveFieldValue(fieldKey: java.lang.String): scala.Unit
  def SetProp(fieldKey: java.lang.String, prop: IPropertyBase): scala.Unit
  /** returns recordKey */
  def key(): scala.Double
}

object IRecord {
  @scala.inline
  def apply(
    AddFieldValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    GetDataValue: js.Function1[java.lang.String, js.Any],
    GetLocalizedValue: js.Function1[java.lang.String, java.lang.String],
    GetProp: js.Function1[java.lang.String, IPropertyBase],
    HasDataValue: js.Function1[java.lang.String, scala.Boolean],
    HasLocalizedValue: js.Function1[java.lang.String, scala.Boolean],
    RemoveFieldValue: js.Function1[java.lang.String, scala.Unit],
    SetProp: js.Function2[java.lang.String, IPropertyBase, scala.Unit],
    bIsNewRow: scala.Boolean,
    key: js.Function0[scala.Double],
    properties: org.scalablytyped.runtime.StringDictionary[IPropertyBase]
  ): IRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddFieldValue")(AddFieldValue)
    __obj.updateDynamic("GetDataValue")(GetDataValue)
    __obj.updateDynamic("GetLocalizedValue")(GetLocalizedValue)
    __obj.updateDynamic("GetProp")(GetProp)
    __obj.updateDynamic("HasDataValue")(HasDataValue)
    __obj.updateDynamic("HasLocalizedValue")(HasLocalizedValue)
    __obj.updateDynamic("RemoveFieldValue")(RemoveFieldValue)
    __obj.updateDynamic("SetProp")(SetProp)
    __obj.updateDynamic("bIsNewRow")(bIsNewRow)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IRecord]
  }
}

