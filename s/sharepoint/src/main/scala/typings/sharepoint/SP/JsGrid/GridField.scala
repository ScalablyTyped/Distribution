package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridField extends js.Object {
  var csrInfo: js.Any
  var dateOnly: Boolean
  var hasDataValue: Boolean
  var hasLocalizedValue: Boolean
  var key: String
  var textDirection: TextDirection
  def CompareSingleDataEqual(dataValue1: js.Any, dataValue2: js.Any): Boolean
  def GetDefaultCellStyleId(): js.Any
  def GetEditMode(): EditMode
  def GetIsMultiValue(): Boolean
  def GetMultiValuePropType(): js.Any
  def GetPropType(): js.Any
  def GetSingleValuePropType(): js.Any
  def SetEditMode(mode: EditMode): Unit
  def SetIsMultiValue(listSeparator: js.Any): Unit
  def SetSingleValuePropType(svPropType: js.Any): Unit
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
}

