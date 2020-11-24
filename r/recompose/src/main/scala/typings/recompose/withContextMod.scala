package typings.recompose

import typings.react.mod.ValidationMap
import typings.recompose.mod.InferableComponentEnhancer
import typings.recompose.mod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withcontext
@JSImport("recompose/withContext", JSImport.Namespace)
@js.native
object withContextMod extends js.Object {
  
  def default[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, _]): InferableComponentEnhancer[js.Object] = js.native
}
