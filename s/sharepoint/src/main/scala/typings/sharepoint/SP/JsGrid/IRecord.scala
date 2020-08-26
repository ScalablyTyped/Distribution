package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IRecord extends js.Object {
  /** True if this is an entry row */
  var bIsNewRow: Boolean = js.native
  /** Please use SetProp and GetProp */
  var properties: StringDictionary[IPropertyBase] = js.native
  /** Update the specified field with the specified value */
  def AddFieldValue(fieldKey: String, value: js.Any): Unit = js.native
  /** returns raw data value for the specified field */
  def GetDataValue(fieldKey: String): js.Any = js.native
  /** returns localized text value for the specified field */
  def GetLocalizedValue(fieldKey: String): String = js.native
  def GetProp(fieldKey: String): IPropertyBase = js.native
  /** returns true if data value for the specified field is available */
  def HasDataValue(fieldKey: String): Boolean = js.native
  /** returns true if localized text value for the specified field is available */
  def HasLocalizedValue(fieldKey: String): Boolean = js.native
  /** Removes value of the specified field.
    Does not refresh the view. */
  def RemoveFieldValue(fieldKey: String): Unit = js.native
  def SetProp(fieldKey: String, prop: IPropertyBase): Unit = js.native
  /** returns recordKey */
  def key(): Double = js.native
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
    val __obj = js.Dynamic.literal(AddFieldValue = js.Any.fromFunction2(AddFieldValue), GetDataValue = js.Any.fromFunction1(GetDataValue), GetLocalizedValue = js.Any.fromFunction1(GetLocalizedValue), GetProp = js.Any.fromFunction1(GetProp), HasDataValue = js.Any.fromFunction1(HasDataValue), HasLocalizedValue = js.Any.fromFunction1(HasLocalizedValue), RemoveFieldValue = js.Any.fromFunction1(RemoveFieldValue), SetProp = js.Any.fromFunction2(SetProp), bIsNewRow = bIsNewRow.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecord]
  }
  @scala.inline
  implicit class IRecordOps[Self <: IRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddFieldValue(value: (String, js.Any) => Unit): Self = this.set("AddFieldValue", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDataValue(value: String => js.Any): Self = this.set("GetDataValue", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLocalizedValue(value: String => String): Self = this.set("GetLocalizedValue", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProp(value: String => IPropertyBase): Self = this.set("GetProp", js.Any.fromFunction1(value))
    @scala.inline
    def setHasDataValue(value: String => Boolean): Self = this.set("HasDataValue", js.Any.fromFunction1(value))
    @scala.inline
    def setHasLocalizedValue(value: String => Boolean): Self = this.set("HasLocalizedValue", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveFieldValue(value: String => Unit): Self = this.set("RemoveFieldValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetProp(value: (String, IPropertyBase) => Unit): Self = this.set("SetProp", js.Any.fromFunction2(value))
    @scala.inline
    def setBIsNewRow(value: Boolean): Self = this.set("bIsNewRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: () => Double): Self = this.set("key", js.Any.fromFunction0(value))
    @scala.inline
    def setProperties(value: StringDictionary[IPropertyBase]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

