package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UiSchema
  extends /* name */ StringDictionary[js.Any] {
  @JSName("ui:field")
  var uiColonfield: js.UndefOr[Field | String] = js.undefined
  @JSName("ui:options")
  var uiColonoptions: js.UndefOr[StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null]] = js.undefined
  @JSName("ui:order")
  var uiColonorder: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("ui:widget")
  var uiColonwidget: js.UndefOr[Widget | String] = js.undefined
}

object UiSchema {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    uiColonfield: Field | String = null,
    uiColonoptions: StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null] = null,
    uiColonorder: js.Array[String] = null,
    uiColonwidget: Widget | String = null
  ): UiSchema = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (uiColonfield != null) __obj.updateDynamic("ui:field")(uiColonfield.asInstanceOf[js.Any])
    if (uiColonoptions != null) __obj.updateDynamic("ui:options")(uiColonoptions.asInstanceOf[js.Any])
    if (uiColonorder != null) __obj.updateDynamic("ui:order")(uiColonorder.asInstanceOf[js.Any])
    if (uiColonwidget != null) __obj.updateDynamic("ui:widget")(uiColonwidget.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiSchema]
  }
}

