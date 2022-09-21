package typings.shakacodeRecompose

import typings.react.mod.ValidationMap
import typings.shakacodeRecompose.mod.InferableComponentEnhancer
import typings.shakacodeRecompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#withcontext
object withContextMod {
  
  @JSImport("@shakacode/recompose/withContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, Any]): InferableComponentEnhancer[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(childContextTypes.asInstanceOf[js.Any], getChildContext.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancer[js.Object]]
}
