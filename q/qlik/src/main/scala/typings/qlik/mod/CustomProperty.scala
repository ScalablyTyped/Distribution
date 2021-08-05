package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikStrings.StringExpr
import typings.qlik.qlikStrings.StringExpression
import typings.qlik.qlikStrings.ValueExpression
import typings.qlik.qlikStrings.dimension
import typings.qlik.qlikStrings.measure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.qlik.mod.CustomPropertyString
  - typings.qlik.mod.CustomPropertyInteger
  - typings.qlik.mod.CustomPropertyNumber
  - typings.qlik.mod.CustomPropertyArray
  - typings.qlik.mod.CustomPropertyButton
  - typings.qlik.mod.CustomPropertyButtonGroup
  - typings.qlik.mod.CustomPropertyCheckbox
  - typings.qlik.mod.CustomPropertyColorPicker
  - typings.qlik.mod.CustomPropertyDropdown
  - typings.qlik.mod.CustomPropertyLink
  - typings.qlik.mod.CustomProperyMedia
  - typings.qlik.mod.CustomPropertyRadio
  - typings.qlik.mod.CustomPropertySlider
  - typings.qlik.mod.CustomPropertyRangeSlider
  - typings.qlik.mod.CustomPropertySwitch
  - typings.qlik.mod.CustomPropertyText
  - typings.qlik.mod.CustomPropertyTextArea
  - typings.qlik.mod.CustomPropertyExpression
  - typings.qlik.mod.CustomPropertyItems
*/
trait CustomProperty extends StObject
object CustomProperty {
  
  inline def CustomPropertyArray(component: Unit): typings.qlik.mod.CustomPropertyArray = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyArray]
  }
  
  inline def CustomPropertyButton(action: VisualizationOptions => Unit): typings.qlik.mod.CustomPropertyButton = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), component = "button")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyButton]
  }
  
  inline def CustomPropertyButtonGroup(): typings.qlik.mod.CustomPropertyButtonGroup = {
    val __obj = js.Dynamic.literal(component = "buttongroup")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyButtonGroup]
  }
  
  inline def CustomPropertyCheckbox(): typings.qlik.mod.CustomPropertyCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyCheckbox]
  }
  
  inline def CustomPropertyColorPicker(): typings.qlik.mod.CustomPropertyColorPicker = {
    val __obj = js.Dynamic.literal(component = "color-picker")
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyColorPicker]
  }
  
  inline def CustomPropertyDropdown(ref: String): typings.qlik.mod.CustomPropertyDropdown = {
    val __obj = js.Dynamic.literal(component = "dropdown", ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyDropdown]
  }
  
  inline def CustomPropertyExpression(
    expressionType: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression,
    `type`: Unit
  ): typings.qlik.mod.CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = "expression", expressionType = expressionType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyExpression]
  }
  
  inline def CustomPropertyInteger(): typings.qlik.mod.CustomPropertyInteger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyInteger]
  }
  
  inline def CustomPropertyItems(items: StringDictionary[CustomProperty]): typings.qlik.mod.CustomPropertyItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("items")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyItems]
  }
  
  inline def CustomPropertyLink(): typings.qlik.mod.CustomPropertyLink = {
    val __obj = js.Dynamic.literal(component = "link")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyLink]
  }
  
  inline def CustomPropertyNumber(): typings.qlik.mod.CustomPropertyNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyNumber]
  }
  
  inline def CustomPropertyRadio(): typings.qlik.mod.CustomPropertyRadio = {
    val __obj = js.Dynamic.literal(component = "radiobuttons")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyRadio]
  }
  
  inline def CustomPropertyRangeSlider(): typings.qlik.mod.CustomPropertyRangeSlider = {
    val __obj = js.Dynamic.literal(component = "slider")
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyRangeSlider]
  }
  
  inline def CustomPropertySlider(): typings.qlik.mod.CustomPropertySlider = {
    val __obj = js.Dynamic.literal(component = "slider")
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertySlider]
  }
  
  inline def CustomPropertyString(): typings.qlik.mod.CustomPropertyString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyString]
  }
  
  inline def CustomPropertySwitch(): typings.qlik.mod.CustomPropertySwitch = {
    val __obj = js.Dynamic.literal(component = "switch")
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertySwitch]
  }
  
  inline def CustomPropertyText(): typings.qlik.mod.CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = "text")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyText]
  }
  
  inline def CustomPropertyTextArea(): typings.qlik.mod.CustomPropertyTextArea = {
    val __obj = js.Dynamic.literal(component = "textarea")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyTextArea]
  }
  
  inline def CustomProperyMedia(): typings.qlik.mod.CustomProperyMedia = {
    val __obj = js.Dynamic.literal(component = "media")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.qlik.mod.CustomProperyMedia]
  }
}
