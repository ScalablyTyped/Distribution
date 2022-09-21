package typings.shakacodeRecompose

import typings.shakacodeRecompose.mod.HandleCreators
import typings.shakacodeRecompose.mod.HandleCreatorsFactory
import typings.shakacodeRecompose.mod.InferableComponentEnhancerWithProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#withhandlers
object withHandlersMod {
  
  @JSImport("@shakacode/recompose/withHandlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TOutter, THandlers](handlerCreators: HandleCreators[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handlerCreators.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter]]
  inline def default[TOutter, THandlers](handlerCreators: HandleCreatorsFactory[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handlerCreators.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter]]
}
