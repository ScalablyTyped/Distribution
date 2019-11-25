package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UiSchema
  extends /* name */ StringDictionary[js.Any] {
  var `ui:field`: js.UndefOr[Field | String] = js.undefined
  var `ui:options`: js.UndefOr[StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null]] = js.undefined
  var `ui:order`: js.UndefOr[js.Array[String]] = js.undefined
  var `ui:widget`: js.UndefOr[Widget | String] = js.undefined
}

object UiSchema {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    `ui:field`: Field | String = null,
    `ui:options`: StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null] = null,
    `ui:order`: js.Array[String] = null,
    `ui:widget`: Widget | String = null
  ): UiSchema = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`ui:field` != null) __obj.updateDynamic("ui:field")(`ui:field`.asInstanceOf[js.Any])
    if (`ui:options` != null) __obj.updateDynamic("ui:options")(`ui:options`.asInstanceOf[js.Any])
    if (`ui:order` != null) __obj.updateDynamic("ui:order")(`ui:order`.asInstanceOf[js.Any])
    if (`ui:widget` != null) __obj.updateDynamic("ui:widget")(`ui:widget`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiSchema]
  }
}

