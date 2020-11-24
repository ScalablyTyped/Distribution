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
trait CustomProperty extends js.Object
object CustomProperty {
  
  @scala.inline
  def CustomPropertyString(`type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyButtonGroup(component: buttongroup, `type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyRangeSlider(component: slider, `type`: array): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyColorPicker(component: `color-picker`, `type`: integer): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyTextArea(component: textarea, `type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyLink(component: link): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyInteger(`type`: integer): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertySwitch(component: switch, `type`: boolean): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyButton(action: VisualizationOptions => Unit, component: button): CustomProperty = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyCheckbox(`type`: boolean): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyText(component: text): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomProperyMedia(component: media, `type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyArray(`type`: array): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyNumber(`type`: number): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyItems(items: StringDictionary[CustomProperty], `type`: items): CustomProperty = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyDropdown(component: dropdown, ref: String, `type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyRadio(component: radiobuttons, `type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertySlider(component: slider, `type`: number): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  def CustomPropertyExpression(
    component: expression,
    expressionType: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
}
