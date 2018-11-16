package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromstream
@JSImport("recompose/componentFromStream", JSImport.Namespace)
@js.native
object componentFromStreamMod extends js.Object {
  def componentFromStreamWithConfig(config: recomposeLib.recomposeMod.ObservableConfig): js.Function1[
    /* propsToReactNode */ recomposeLib.recomposeMod.mapper[
      recomposeLib.recomposeMod.Subscribable[_], 
      recomposeLib.recomposeMod.Subscribable[reactLib.reactMod.ReactNs.ReactNode]
    ], 
    reactLib.reactMod.ReactNs.ComponentType[_]
  ] = js.native
  def default[TProps](
    propsToReactNode: recomposeLib.recomposeMod.mapper[
      recomposeLib.recomposeMod.Subscribable[TProps], 
      recomposeLib.recomposeMod.Subscribable[reactLib.reactMod.ReactNs.ReactNode]
    ]
  ): reactLib.reactMod.ReactNs.ComponentType[TProps] = js.native
}

