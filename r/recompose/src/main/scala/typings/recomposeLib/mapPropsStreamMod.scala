package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#mappropsstream
@JSImport("recompose/mapPropsStream", JSImport.Namespace)
@js.native
object mapPropsStreamMod extends js.Object {
  def default[TInner, TOutter](
    transform: recomposeLib.recomposeMod.mapper[
      recomposeLib.recomposeMod.Subscribable[TOutter], 
      recomposeLib.recomposeMod.Subscribable[TInner]
    ]
  ): recomposeLib.recomposeMod.ComponentEnhancer[TInner, TOutter] = js.native
  def mapPropsStreamWithConfig(config: recomposeLib.recomposeMod.ObservableConfig): js.Function1[
    /* transform */ recomposeLib.recomposeMod.mapper[
      recomposeLib.recomposeMod.Subscribable[_], 
      recomposeLib.recomposeMod.Subscribable[_]
    ], 
    recomposeLib.recomposeMod.ComponentEnhancer[_, _]
  ] = js.native
}

