package typings.recompose.recomposeMod

import typings.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "withContext")
@js.native
object withContext extends js.Object {
  def apply[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, _]): InferableComponentEnhancer[js.Object] = js.native
}

