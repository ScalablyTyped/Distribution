package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IFieldInfo extends js.Object {
  var dateOnly: js.UndefOr[Boolean] = js.undefined
  var defaultCellStyleId: js.UndefOr[js.Any] = js.undefined
  var editMode: js.UndefOr[EditMode] = js.undefined
  var fieldKey: String
  var hasDataValue: js.UndefOr[Boolean] = js.undefined
  var hasLocalizedValue: js.UndefOr[Boolean] = js.undefined
  var multiValue: js.UndefOr[Boolean] = js.undefined
  var propertyTypeId: String
  var textDirection: js.UndefOr[TextDirection] = js.undefined
}

object IFieldInfo {
  @scala.inline
  def apply(
    fieldKey: String,
    propertyTypeId: String,
    dateOnly: js.UndefOr[Boolean] = js.undefined,
    defaultCellStyleId: js.Any = null,
    editMode: EditMode = null,
    hasDataValue: js.UndefOr[Boolean] = js.undefined,
    hasLocalizedValue: js.UndefOr[Boolean] = js.undefined,
    multiValue: js.UndefOr[Boolean] = js.undefined,
    textDirection: TextDirection = null
  ): IFieldInfo = {
    val __obj = js.Dynamic.literal(fieldKey = fieldKey, propertyTypeId = propertyTypeId)
    if (!js.isUndefined(dateOnly)) __obj.updateDynamic("dateOnly")(dateOnly)
    if (defaultCellStyleId != null) __obj.updateDynamic("defaultCellStyleId")(defaultCellStyleId)
    if (editMode != null) __obj.updateDynamic("editMode")(editMode)
    if (!js.isUndefined(hasDataValue)) __obj.updateDynamic("hasDataValue")(hasDataValue)
    if (!js.isUndefined(hasLocalizedValue)) __obj.updateDynamic("hasLocalizedValue")(hasLocalizedValue)
    if (!js.isUndefined(multiValue)) __obj.updateDynamic("multiValue")(multiValue)
    if (textDirection != null) __obj.updateDynamic("textDirection")(textDirection)
    __obj.asInstanceOf[IFieldInfo]
  }
}

