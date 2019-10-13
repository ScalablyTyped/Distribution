package typings.reactDashSticky

import typings.react.reactMod.ComponentType
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashStickyComponents extends reactDashStickyProps {
  @scala.inline
  def Sticky: ComponentType[StickyProps] = js.constructorOf[typings.reactDashSticky.reactDashStickyMod.Sticky].asInstanceOf[typings.react.reactMod.ComponentType[StickyProps]]
  @scala.inline
  def StickyContainer: ComponentType[StickyContainerProps[HTMLDivElement]] = js.constructorOf[typings.reactDashSticky.reactDashStickyMod.StickyContainer].asInstanceOf[typings.react.reactMod.ComponentType[StickyContainerProps[typings.std.HTMLDivElement]]]
}

