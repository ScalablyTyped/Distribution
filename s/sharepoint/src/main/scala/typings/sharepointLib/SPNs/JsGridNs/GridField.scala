package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.GridField")
@js.native
class GridField protected () extends js.Object {
  def this(key: java.lang.String, hasDataValue: scala.Boolean, hasLocalizedValue: scala.Boolean, textDirection: TextDirection) = this()
  def this(key: java.lang.String, hasDataValue: scala.Boolean, hasLocalizedValue: scala.Boolean, textDirection: TextDirection, defaultCellStyleId: js.Any) = this()
  def this(key: java.lang.String, hasDataValue: scala.Boolean, hasLocalizedValue: scala.Boolean, textDirection: TextDirection, defaultCellStyleId: js.Any, editMode: EditMode) = this()
  def this(key: java.lang.String, hasDataValue: scala.Boolean, hasLocalizedValue: scala.Boolean, textDirection: TextDirection, defaultCellStyleId: js.Any, editMode: EditMode, dateOnly: scala.Boolean) = this()
  def this(key: java.lang.String, hasDataValue: scala.Boolean, hasLocalizedValue: scala.Boolean, textDirection: TextDirection, defaultCellStyleId: js.Any, editMode: EditMode, dateOnly: scala.Boolean, csrInfo: js.Any) = this()
  var csrInfo: js.Any = js.native
  var dateOnly: scala.Boolean = js.native
  var hasDataValue: scala.Boolean = js.native
  var hasLocalizedValue: scala.Boolean = js.native
  var key: java.lang.String = js.native
  var textDirection: TextDirection = js.native
  def CompareSingleDataEqual(dataValue1: js.Any, dataValue2: js.Any): scala.Boolean = js.native
  def GetDefaultCellStyleId(): js.Any = js.native
  def GetEditMode(): EditMode = js.native
  def GetIsMultiValue(): scala.Boolean = js.native
  def GetMultiValuePropType(): js.Any = js.native
  def GetPropType(): js.Any = js.native
  def GetSingleValuePropType(): js.Any = js.native
  def SetEditMode(mode: EditMode): scala.Unit = js.native
  def SetIsMultiValue(listSeparator: js.Any): scala.Unit = js.native
  def SetSingleValuePropType(svPropType: js.Any): scala.Unit = js.native
}

