package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withcontext
@JSImport("recompose/withContext", JSImport.Namespace)
@js.native
object withContextMod extends js.Object {
  def default[TContext, TProps](
    childContextTypes: reactLib.reactMod.ValidationMap[TContext],
    getChildContext: recomposeLib.recomposeMod.mapper[TProps, _]
  ): recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object] = js.native
}

