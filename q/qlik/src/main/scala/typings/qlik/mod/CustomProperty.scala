package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikStrings.StringExpr
import typings.qlik.qlikStrings.StringExpression
import typings.qlik.qlikStrings.ValueExpression
import typings.qlik.qlikStrings.`color-picker`
import typings.qlik.qlikStrings.array
import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.button
import typings.qlik.qlikStrings.buttongroup
import typings.qlik.qlikStrings.dimension
import typings.qlik.qlikStrings.dropdown
import typings.qlik.qlikStrings.expression
import typings.qlik.qlikStrings.integer
import typings.qlik.qlikStrings.items
import typings.qlik.qlikStrings.link
import typings.qlik.qlikStrings.measure
import typings.qlik.qlikStrings.media
import typings.qlik.qlikStrings.number
import typings.qlik.qlikStrings.radiobuttons
import typings.qlik.qlikStrings.slider
import typings.qlik.qlikStrings.string
import typings.qlik.qlikStrings.switch
import typings.qlik.qlikStrings.text
import typings.qlik.qlikStrings.textarea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def CustomPropertyArray(`type`: array): typings.qlik.mod.CustomPropertyArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyArray]
  }
  
  @scala.inline
  def CustomPropertyButton(action: VisualizationOptions => Unit, component: button): typings.qlik.mod.CustomPropertyButton = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyButton]
  }
  
  @scala.inline
  def CustomPropertyButtonGroup(component: buttongroup, `type`: string): typings.qlik.mod.CustomPropertyButtonGroup = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyButtonGroup]
  }
  
  @scala.inline
  def CustomPropertyCheckbox(`type`: boolean): typings.qlik.mod.CustomPropertyCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyCheckbox]
  }
  
  @scala.inline
  def CustomPropertyColorPicker(component: `color-picker`, `type`: integer): typings.qlik.mod.CustomPropertyColorPicker = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyColorPicker]
  }
  
  @scala.inline
  def CustomPropertyDropdown(component: dropdown, ref: String, `type`: string): typings.qlik.mod.CustomPropertyDropdown = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyDropdown]
  }
  
  @scala.inline
  def CustomPropertyExpression(
    component: expression,
    expressionType: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  ): typings.qlik.mod.CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyExpression]
  }
  
  @scala.inline
  def CustomPropertyInteger(`type`: integer): typings.qlik.mod.CustomPropertyInteger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyInteger]
  }
  
  @scala.inline
  def CustomPropertyItems(items: StringDictionary[CustomProperty], `type`: items): typings.qlik.mod.CustomPropertyItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyItems]
  }
  
  @scala.inline
  def CustomPropertyLink(component: link): typings.qlik.mod.CustomPropertyLink = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyLink]
  }
  
  @scala.inline
  def CustomPropertyNumber(`type`: number): typings.qlik.mod.CustomPropertyNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyNumber]
  }
  
  @scala.inline
  def CustomPropertyRadio(component: radiobuttons, `type`: string): typings.qlik.mod.CustomPropertyRadio = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyRadio]
  }
  
  @scala.inline
  def CustomPropertyRangeSlider(component: slider, `type`: array): typings.qlik.mod.CustomPropertyRangeSlider = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyRangeSlider]
  }
  
  @scala.inline
  def CustomPropertySlider(component: slider, `type`: number): typings.qlik.mod.CustomPropertySlider = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertySlider]
  }
  
  @scala.inline
  def CustomPropertyString(`type`: string): typings.qlik.mod.CustomPropertyString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyString]
  }
  
  @scala.inline
  def CustomPropertySwitch(component: switch, `type`: boolean): typings.qlik.mod.CustomPropertySwitch = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertySwitch]
  }
  
  @scala.inline
  def CustomPropertyText(component: text): typings.qlik.mod.CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyText]
  }
  
  @scala.inline
  def CustomPropertyTextArea(component: textarea, `type`: string): typings.qlik.mod.CustomPropertyTextArea = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomPropertyTextArea]
  }
  
  @scala.inline
  def CustomProperyMedia(component: media, `type`: string): typings.qlik.mod.CustomProperyMedia = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qlik.mod.CustomProperyMedia]
  }
}
