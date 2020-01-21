package typings.recompose.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "nest")
@js.native
object nest extends js.Object {
  def apply(Components: (String | ComponentType[_])*): ComponentClass[_, ComponentState] = js.native
}

