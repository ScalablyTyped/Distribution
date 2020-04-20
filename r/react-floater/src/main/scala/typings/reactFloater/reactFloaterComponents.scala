package typings.reactFloater

import typings.react.mod.ComponentType
import typings.reactFloater.mod.PropsWithComponent
import typings.reactFloater.mod.PropsWithContent
import typings.reactFloater.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFloaterComponents extends reactFloaterProps {
  @scala.inline
  def ReactFloater: ComponentType[PropsWithComponent | PropsWithContent] = js.constructorOf[default].asInstanceOf[ComponentType[PropsWithComponent | PropsWithContent]]
}

