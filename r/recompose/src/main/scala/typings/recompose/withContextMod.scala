package typings.recompose

import typings.react.mod.ValidationMap
import typings.recompose.mod.InferableComponentEnhancer
import typings.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withcontext
object withContextMod {
  
  @JSImport("recompose/withContext", JSImport.Default)
  @js.native
  def default[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, _]): InferableComponentEnhancer[js.Object] = js.native
}
