package typings.recompose

import typings.recompose.mod.InferableComponentEnhancer
import typings.recompose.mod.ReactLifeCycleFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#lifecycle
object lifecycleMod {
  
  @JSImport("recompose/lifecycle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[TProps, TState, TInstance](spec: (ReactLifeCycleFunctions[TProps, TState, TInstance]) & TInstance): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(spec.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
}
