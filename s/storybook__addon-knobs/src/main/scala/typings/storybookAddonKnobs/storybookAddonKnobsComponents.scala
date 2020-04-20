package typings.storybookAddonKnobs

import typings.react.mod.ComponentType
import typings.storybookAddonKnobs.arrayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookAddonKnobsComponents extends storybookAddonKnobsProps {
  @scala.inline
  def Array: ComponentType[ArrayProps] = js.constructorOf[default].asInstanceOf[ComponentType[ArrayProps]]
  @scala.inline
  def Checkboxes: ComponentType[CheckboxesProps] = js.constructorOf[typings.storybookAddonKnobs.checkboxesMod.default].asInstanceOf[ComponentType[CheckboxesProps]]
  @scala.inline
  def Color: ComponentType[ColorProps] = js.constructorOf[typings.storybookAddonKnobs.colorMod.default].asInstanceOf[ComponentType[ColorProps]]
  @scala.inline
  def Date: ComponentType[DateProps] = js.constructorOf[typings.storybookAddonKnobs.dateMod.default].asInstanceOf[ComponentType[DateProps]]
  @scala.inline
  def Number: ComponentType[NumberProps] = js.constructorOf[typings.storybookAddonKnobs.numberMod.default].asInstanceOf[ComponentType[NumberProps]]
  @scala.inline
  def Object[T]: ComponentType[ObjectProps[T]] = js.constructorOf[typings.storybookAddonKnobs.objectMod.default[T]].asInstanceOf[ComponentType[ObjectProps[T]]]
  @scala.inline
  def Panel: ComponentType[PanelProps] = js.constructorOf[typings.storybookAddonKnobs.panelMod.default].asInstanceOf[ComponentType[PanelProps]]
  @scala.inline
  def PropForm: ComponentType[PropFormProps] = js.constructorOf[typings.storybookAddonKnobs.propFormMod.default].asInstanceOf[ComponentType[PropFormProps]]
  @scala.inline
  def Radio: ComponentType[RadioProps] = js.constructorOf[typings.storybookAddonKnobs.radioMod.default].asInstanceOf[ComponentType[RadioProps]]
  @scala.inline
  def Text: ComponentType[TextProps] = js.constructorOf[typings.storybookAddonKnobs.textMod.default].asInstanceOf[ComponentType[TextProps]]
}

