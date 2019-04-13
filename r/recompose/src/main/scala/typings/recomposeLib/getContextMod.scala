package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#getcontext
@JSImport("recompose/getContext", JSImport.Namespace)
@js.native
object getContextMod extends js.Object {
  def default[TContext](contextTypes: reactLib.reactMod.ValidationMap[TContext]): recomposeLib.recomposeMod.InferableComponentEnhancer[TContext] = js.native
}

