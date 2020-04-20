package typings.reactMovable

import typings.react.mod.ComponentType
import typings.reactMovable.listMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactMovableComponents extends reactMovableProps {
  @scala.inline
  def List[Value]: ComponentType[ListProps[Value]] = js.constructorOf[default[Value]].asInstanceOf[ComponentType[ListProps[Value]]]
}

