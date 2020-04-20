package typings.reactScrollbar

import typings.react.mod.ComponentType
import typings.reactScrollbar.noCssMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactScrollbarComponents extends reactScrollbarProps {
  @scala.inline
  def NoCss: ComponentType[NoCssProps] = js.constructorOf[^].asInstanceOf[ComponentType[NoCssProps]]
  @scala.inline
  def ReactScrollbar: ComponentType[ReactScrollbarProps] = js.constructorOf[typings.reactScrollbar.mod.^].asInstanceOf[ComponentType[ReactScrollbarProps]]
  @scala.inline
  def ScrollArea: ComponentType[ScrollAreaProps] = js.constructorOf[typings.reactScrollbar.ScrollArea].asInstanceOf[ComponentType[ScrollAreaProps]]
}

