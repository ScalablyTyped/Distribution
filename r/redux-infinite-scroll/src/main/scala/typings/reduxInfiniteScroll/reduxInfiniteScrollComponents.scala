package typings.reduxInfiniteScroll

import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.reduxInfiniteScroll.mod.InfiniteScrollerProps
import typings.reduxInfiniteScroll.mod.default
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxInfiniteScrollComponents extends reduxInfiniteScrollProps {
  @scala.inline
  def ReduxInfiniteScroll: ComponentType[InfiniteScrollerProps with HTMLProps[HTMLDivElement]] = js.constructorOf[default].asInstanceOf[ComponentType[InfiniteScrollerProps with HTMLProps[HTMLDivElement]]]
}

