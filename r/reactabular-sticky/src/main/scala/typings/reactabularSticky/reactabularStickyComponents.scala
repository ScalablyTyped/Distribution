package typings.reactabularSticky

import typings.react.mod.ComponentType
import typings.reactabularSticky.mod.StickyBodyProps
import typings.reactabularSticky.mod.StickyHeaderProps
import typings.reactabularTable.mod.BodyProps
import typings.reactabularTable.mod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactabularStickyComponents extends reactabularStickyProps {
  @scala.inline
  def Body: ComponentType[StickyBodyProps with BodyProps] = js.constructorOf[typings.reactabularSticky.mod.Body].asInstanceOf[ComponentType[StickyBodyProps with BodyProps]]
  @scala.inline
  def Header: ComponentType[StickyHeaderProps with HeaderProps] = js.constructorOf[typings.reactabularSticky.mod.Header].asInstanceOf[ComponentType[StickyHeaderProps with HeaderProps]]
}

