package typings.reactCircularProgressbar

import typings.react.mod.ComponentType
import typings.reactCircularProgressbar.circularProgressbarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactCircularProgressbarComponents extends reactCircularProgressbarProps {
  @scala.inline
  def CircularProgressbar: ComponentType[CircularProgressbarProps] = js.constructorOf[default].asInstanceOf[ComponentType[CircularProgressbarProps]]
  @scala.inline
  def CircularProgressbarWithChildren: ComponentType[CircularProgressbarWithChildrenProps] = typings.reactCircularProgressbar.circularProgressbarWithChildrenMod.default.asInstanceOf[ComponentType[CircularProgressbarWithChildrenProps]]
}

