package typings.recompose

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.recompose.mod.ObservableConfig
import typings.recompose.mod.Subscribable
import typings.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromstream
object componentFromStreamMod {
  
  @JSImport("recompose/componentFromStream", JSImport.Default)
  @js.native
  def default[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[ReactNode]]): ComponentType[TProps] = js.native
  
  @JSImport("recompose/componentFromStream", "componentFromStreamWithConfig")
  @js.native
  def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[ReactNode]], 
    ComponentType[_]
  ] = js.native
}
