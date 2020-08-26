package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridField extends js.Object {
  var csrInfo: js.Any = js.native
  var dateOnly: Boolean = js.native
  var hasDataValue: Boolean = js.native
  var hasLocalizedValue: Boolean = js.native
  var key: String = js.native
  var textDirection: TextDirection = js.native
  def CompareSingleDataEqual(dataValue1: js.Any, dataValue2: js.Any): Boolean = js.native
  def GetDefaultCellStyleId(): js.Any = js.native
  def GetEditMode(): EditMode = js.native
  def GetIsMultiValue(): Boolean = js.native
  def GetMultiValuePropType(): js.Any = js.native
  def GetPropType(): js.Any = js.native
  def GetSingleValuePropType(): js.Any = js.native
  def SetEditMode(mode: EditMode): Unit = js.native
  def SetIsMultiValue(listSeparator: js.Any): Unit = js.native
  def SetSingleValuePropType(svPropType: js.Any): Unit = js.native
}

object GridField {
  @scala.inline
  def apply(
    CompareSingleDataEqual: (js.Any, js.Any) => Boolean,
    GetDefaultCellStyleId: () => js.Any,
    GetEditMode: () => EditMode,
    GetIsMultiValue: () => Boolean,
    GetMultiValuePropType: () => js.Any,
    GetPropType: () => js.Any,
    GetSingleValuePropType: () => js.Any,
    SetEditMode: EditMode => Unit,
    SetIsMultiValue: js.Any => Unit,
    SetSingleValuePropType: js.Any => Unit,
    csrInfo: js.Any,
    dateOnly: Boolean,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    key: String,
    textDirection: TextDirection
  ): GridField = {
    val __obj = js.Dynamic.literal(CompareSingleDataEqual = js.Any.fromFunction2(CompareSingleDataEqual), GetDefaultCellStyleId = js.Any.fromFunction0(GetDefaultCellStyleId), GetEditMode = js.Any.fromFunction0(GetEditMode), GetIsMultiValue = js.Any.fromFunction0(GetIsMultiValue), GetMultiValuePropType = js.Any.fromFunction0(GetMultiValuePropType), GetPropType = js.Any.fromFunction0(GetPropType), GetSingleValuePropType = js.Any.fromFunction0(GetSingleValuePropType), SetEditMode = js.Any.fromFunction1(SetEditMode), SetIsMultiValue = js.Any.fromFunction1(SetIsMultiValue), SetSingleValuePropType = js.Any.fromFunction1(SetSingleValuePropType), csrInfo = csrInfo.asInstanceOf[js.Any], dateOnly = dateOnly.asInstanceOf[js.Any], hasDataValue = hasDataValue.asInstanceOf[js.Any], hasLocalizedValue = hasLocalizedValue.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], textDirection = textDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridField]
  }
  @scala.inline
  implicit class GridFieldOps[Self <: GridField] (val x: Self) extends AnyVal {
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
    def setCompareSingleDataEqual(value: (js.Any, js.Any) => Boolean): Self = this.set("CompareSingleDataEqual", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDefaultCellStyleId(value: () => js.Any): Self = this.set("GetDefaultCellStyleId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEditMode(value: () => EditMode): Self = this.set("GetEditMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsMultiValue(value: () => Boolean): Self = this.set("GetIsMultiValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMultiValuePropType(value: () => js.Any): Self = this.set("GetMultiValuePropType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPropType(value: () => js.Any): Self = this.set("GetPropType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSingleValuePropType(value: () => js.Any): Self = this.set("GetSingleValuePropType", js.Any.fromFunction0(value))
    @scala.inline
    def setSetEditMode(value: EditMode => Unit): Self = this.set("SetEditMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIsMultiValue(value: js.Any => Unit): Self = this.set("SetIsMultiValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSingleValuePropType(value: js.Any => Unit): Self = this.set("SetSingleValuePropType", js.Any.fromFunction1(value))
    @scala.inline
    def setCsrInfo(value: js.Any): Self = this.set("csrInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateOnly(value: Boolean): Self = this.set("dateOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasDataValue(value: Boolean): Self = this.set("hasDataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasLocalizedValue(value: Boolean): Self = this.set("hasLocalizedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDirection(value: TextDirection): Self = this.set("textDirection", value.asInstanceOf[js.Any])
  }
  
}

