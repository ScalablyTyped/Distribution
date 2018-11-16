package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#lifecycle
@JSImport("recompose/lifecycle", JSImport.Namespace)
@js.native
object lifecycleMod extends js.Object {
  def default[TProps, TState, TInstance](
    spec: (recomposeLib.recomposeMod.ReactLifeCycleFunctions[TProps, TState, TInstance]) with TInstance
  ): recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object] = js.native
}

