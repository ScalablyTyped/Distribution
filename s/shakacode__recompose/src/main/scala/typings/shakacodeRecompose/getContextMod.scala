package typings.shakacodeRecompose

import typings.react.mod.ValidationMap
import typings.shakacodeRecompose.mod.InferableComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#getcontext
object getContextMod {
  
  @JSImport("@shakacode/recompose/getContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TContext](contextTypes: ValidationMap[TContext]): InferableComponentEnhancer[TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(contextTypes.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[TContext]]
}
