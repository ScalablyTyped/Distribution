package typings.radium

import typings.radium.radiumMod.Radium.StyleProps
import typings.radium.radiumMod.Radium.StyleRootProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object radiumComponents extends radiumProps {
  @scala.inline
  def RadiumStyle: ComponentType[StyleProps] = js.constructorOf[typings.radium.radiumMod.default.Style].asInstanceOf[typings.react.reactMod.ComponentType[typings.radium.radiumMod.Radium.StyleProps]]
  @scala.inline
  def RadiumStyleRoot: ComponentType[StyleRootProps] = js.constructorOf[typings.radium.radiumMod.default.StyleRoot].asInstanceOf[typings.react.reactMod.ComponentType[typings.radium.radiumMod.Radium.StyleRootProps]]
}

