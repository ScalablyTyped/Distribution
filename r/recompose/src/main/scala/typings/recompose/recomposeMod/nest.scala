package typings.recompose.recomposeMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "nest")
@js.native
object nest extends js.Object {
  def apply(Components: (String | ComponentType[_])*): ComponentClass[_, ComponentState] = js.native
}

