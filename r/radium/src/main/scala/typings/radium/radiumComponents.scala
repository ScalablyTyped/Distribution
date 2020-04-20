package typings.radium

import typings.radium.mod.default.Style
import typings.radium.mod.default.StyleRoot
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object radiumComponents extends radiumProps {
  @scala.inline
  def RadiumStyle: ComponentType[RadiumStyleProps] = js.constructorOf[Style].asInstanceOf[ComponentType[RadiumStyleProps]]
  @scala.inline
  def RadiumStyleRoot: ComponentType[RadiumStyleRootProps] = js.constructorOf[StyleRoot].asInstanceOf[ComponentType[RadiumStyleRootProps]]
}

