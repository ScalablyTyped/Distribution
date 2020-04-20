package typings.reactSticky

import typings.react.mod.ComponentType
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactStickyComponents extends reactStickyProps {
  @scala.inline
  def Sticky: ComponentType[StickyProps] = js.constructorOf[typings.reactSticky.mod.Sticky].asInstanceOf[ComponentType[StickyProps]]
  @scala.inline
  def StickyContainer: ComponentType[StickyContainerProps[HTMLDivElement]] = js.constructorOf[typings.reactSticky.mod.StickyContainer].asInstanceOf[ComponentType[StickyContainerProps[HTMLDivElement]]]
}

