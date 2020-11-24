package typings.recompose

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.recompose.mod.ObservableConfig
import typings.recompose.mod.Subscribable
import typings.recompose.mod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
