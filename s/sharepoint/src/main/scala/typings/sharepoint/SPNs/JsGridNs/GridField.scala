package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.GridField")
@js.native
class GridField protected () extends js.Object {
  def this(key: String, hasDataValue: Boolean, hasLocalizedValue: Boolean, textDirection: TextDirection) = this()
  def this(
    key: String,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    textDirection: TextDirection,
    defaultCellStyleId: js.Any
  ) = this()
  def this(
    key: String,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    textDirection: TextDirection,
    defaultCellStyleId: js.Any,
    editMode: EditMode
  ) = this()
  def this(
    key: String,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    textDirection: TextDirection,
    defaultCellStyleId: js.Any,
    editMode: EditMode,
    dateOnly: Boolean
  ) = this()
  def this(
    key: String,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    textDirection: TextDirection,
    defaultCellStyleId: js.Any,
    editMode: EditMode,
    dateOnly: Boolean,
    csrInfo: js.Any
  ) = this()
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

