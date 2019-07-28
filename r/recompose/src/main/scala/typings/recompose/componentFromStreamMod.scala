package typings.recompose

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.recompose.recomposeMod.ObservableConfig
import typings.recompose.recomposeMod.Subscribable
import typings.recompose.recomposeMod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromstream
@JSImport("recompose/componentFromStream", JSImport.Namespace)
@js.native
object componentFromStreamMod extends js.Object {
  def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[ReactNode]], 
    ComponentType[_]
  ] = js.native
  def default[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[ReactNode]]): ComponentType[TProps] = js.native
}

