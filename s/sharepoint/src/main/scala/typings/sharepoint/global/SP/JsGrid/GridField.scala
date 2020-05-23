package typings.sharepoint.global.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.GridField")
@js.native
class GridField protected ()
  extends typings.sharepoint.SP.JsGrid.GridField {
  def this(
    key: String,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    textDirection: typings.sharepoint.SP.JsGrid.TextDirection
  ) = this()
  def this(
    key: String,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    textDirection: typings.sharepoint.SP.JsGrid.TextDirection,
    defaultCellStyleId: js.Any
  ) = this()
  def this(
    key: String,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    textDirection: typings.sharepoint.SP.JsGrid.TextDirection,
    defaultCellStyleId: js.Any,
    editMode: typings.sharepoint.SP.JsGrid.EditMode
  ) = this()
  def this(
    key: String,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    textDirection: typings.sharepoint.SP.JsGrid.TextDirection,
    defaultCellStyleId: js.Any,
    editMode: typings.sharepoint.SP.JsGrid.EditMode,
    dateOnly: Boolean
  ) = this()
  def this(
    key: String,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    textDirection: typings.sharepoint.SP.JsGrid.TextDirection,
    defaultCellStyleId: js.Any,
    editMode: typings.sharepoint.SP.JsGrid.EditMode,
    dateOnly: Boolean,
    csrInfo: js.Any
  ) = this()
  /* CompleteClass */
  override var csrInfo: js.Any = js.native
  /* CompleteClass */
  override var dateOnly: Boolean = js.native
  /* CompleteClass */
  override var hasDataValue: Boolean = js.native
  /* CompleteClass */
  override var hasLocalizedValue: Boolean = js.native
  /* CompleteClass */
  override var key: String = js.native
  /* CompleteClass */
  override var textDirection: typings.sharepoint.SP.JsGrid.TextDirection = js.native
  /* CompleteClass */
  override def CompareSingleDataEqual(dataValue1: js.Any, dataValue2: js.Any): Boolean = js.native
  /* CompleteClass */
  override def GetDefaultCellStyleId(): js.Any = js.native
  /* CompleteClass */
  override def GetEditMode(): typings.sharepoint.SP.JsGrid.EditMode = js.native
  /* CompleteClass */
  override def GetIsMultiValue(): Boolean = js.native
  /* CompleteClass */
  override def GetMultiValuePropType(): js.Any = js.native
  /* CompleteClass */
  override def GetPropType(): js.Any = js.native
  /* CompleteClass */
  override def GetSingleValuePropType(): js.Any = js.native
  /* CompleteClass */
  override def SetEditMode(mode: typings.sharepoint.SP.JsGrid.EditMode): Unit = js.native
  /* CompleteClass */
  override def SetIsMultiValue(listSeparator: js.Any): Unit = js.native
  /* CompleteClass */
  override def SetSingleValuePropType(svPropType: js.Any): Unit = js.native
}

