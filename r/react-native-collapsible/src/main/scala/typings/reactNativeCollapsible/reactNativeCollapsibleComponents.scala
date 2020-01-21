package typings.reactNativeCollapsible

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeCollapsibleComponents extends reactNativeCollapsibleProps {
  @scala.inline
  def Accordion[T]: ComponentType[AccordionProps[T]] = js.constructorOf[typings.reactNativeCollapsible.accordionMod.default[T]].asInstanceOf[typings.react.mod.ComponentType[AccordionProps[T]]]
  @scala.inline
  def ReactNativeCollapsible: ComponentType[ReactNativeCollapsibleProps] = js.constructorOf[typings.reactNativeCollapsible.mod.default].asInstanceOf[typings.react.mod.ComponentType[ReactNativeCollapsibleProps]]
}

