package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UiSchema
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `ui:field`: js.UndefOr[Field | java.lang.String] = js.undefined
  var `ui:options`: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      scala.Boolean | scala.Double | java.lang.String | js.Object | js.Array[_] | scala.Null
    ]
  ] = js.undefined
  var `ui:order`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `ui:widget`: js.UndefOr[Widget | java.lang.String] = js.undefined
}

object UiSchema {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `ui:field`: Field | java.lang.String = null,
    `ui:options`: org.scalablytyped.runtime.StringDictionary[
      scala.Boolean | scala.Double | java.lang.String | js.Object | js.Array[_] | scala.Null
    ] = null,
    `ui:order`: js.Array[java.lang.String] = null,
    `ui:widget`: Widget | java.lang.String = null
  ): UiSchema = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`ui:field` != null) __obj.updateDynamic("ui:field")(`ui:field`.asInstanceOf[js.Any])
    if (`ui:options` != null) __obj.updateDynamic("ui:options")(`ui:options`)
    if (`ui:order` != null) __obj.updateDynamic("ui:order")(`ui:order`)
    if (`ui:widget` != null) __obj.updateDynamic("ui:widget")(`ui:widget`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiSchema]
  }
}

