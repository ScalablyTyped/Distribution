package typings.recompose.recomposeMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "componentFromStreamWithConfig")
@js.native
object componentFromStreamWithConfig extends js.Object {
  def apply(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[ReactNode]], 
    ComponentType[_]
  ] = js.native
}

