package typings.recompose.recomposeMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "componentFromStream")
@js.native
object componentFromStream extends js.Object {
  def apply[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[ReactNode]]): ComponentType[TProps] = js.native
}

