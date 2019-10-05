package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IRecord extends js.Object {
  /** True if this is an entry row */
  var bIsNewRow: Boolean
  /** Please use SetProp and GetProp */
  var properties: StringDictionary[IPropertyBase]
  /** Update the specified field with the specified value */
  def AddFieldValue(fieldKey: String, value: js.Any): Unit
  /** returns raw data value for the specified field */
  def GetDataValue(fieldKey: String): js.Any
  /** returns localized text value for the specified field */
  def GetLocalizedValue(fieldKey: String): String
  def GetProp(fieldKey: String): IPropertyBase
  /** returns true if data value for the specified field is available */
  def HasDataValue(fieldKey: String): Boolean
  /** returns true if localized text value for the specified field is available */
  def HasLocalizedValue(fieldKey: String): Boolean
  /** Removes value of the specified field.
    Does not refresh the view. */
  def RemoveFieldValue(fieldKey: String): Unit
  def SetProp(fieldKey: String, prop: IPropertyBase): Unit
  /** returns recordKey */
  def key(): Double
}

object IRecord {
  @scala.inline
  def apply(
    AddFieldValue: (String, js.Any) => Unit,
    GetDataValue: String => js.Any,
    GetLocalizedValue: String => String,
    GetProp: String => IPropertyBase,
    HasDataValue: String => Boolean,
    HasLocalizedValue: String => Boolean,
    RemoveFieldValue: String => Unit,
    SetProp: (String, IPropertyBase) => Unit,
    bIsNewRow: Boolean,
    key: () => Double,
    properties: StringDictionary[IPropertyBase]
  ): IRecord = {
    val __obj = js.Dynamic.literal(AddFieldValue = js.Any.fromFunction2(AddFieldValue), GetDataValue = js.Any.fromFunction1(GetDataValue), GetLocalizedValue = js.Any.fromFunction1(GetLocalizedValue), GetProp = js.Any.fromFunction1(GetProp), HasDataValue = js.Any.fromFunction1(HasDataValue), HasLocalizedValue = js.Any.fromFunction1(HasLocalizedValue), RemoveFieldValue = js.Any.fromFunction1(RemoveFieldValue), SetProp = js.Any.fromFunction2(SetProp), bIsNewRow = bIsNewRow, key = js.Any.fromFunction0(key), properties = properties)
  
    __obj.asInstanceOf[IRecord]
  }
}

