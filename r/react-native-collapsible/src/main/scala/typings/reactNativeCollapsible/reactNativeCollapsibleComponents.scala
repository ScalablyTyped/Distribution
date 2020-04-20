package typings.reactNativeCollapsible

import typings.react.mod.ComponentType
import typings.reactNativeCollapsible.accordionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeCollapsibleComponents extends reactNativeCollapsibleProps {
  @scala.inline
  def Accordion[T]: ComponentType[AccordionProps[T]] = js.constructorOf[default[T]].asInstanceOf[ComponentType[AccordionProps[T]]]
  @scala.inline
  def ReactNativeCollapsible: ComponentType[ReactNativeCollapsibleProps] = js.constructorOf[typings.reactNativeCollapsible.mod.default].asInstanceOf[ComponentType[ReactNativeCollapsibleProps]]
}

