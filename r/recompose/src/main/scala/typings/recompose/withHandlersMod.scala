package typings.recompose

import typings.recompose.mod.HandleCreators
import typings.recompose.mod.HandleCreatorsFactory
import typings.recompose.mod.InferableComponentEnhancerWithProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
object withHandlersMod {
  
  @JSImport("recompose/withHandlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TOutter, THandlers](handlerCreators: HandleCreators[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handlerCreators.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter]]
  inline def default[TOutter, THandlers](handlerCreators: HandleCreatorsFactory[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handlerCreators.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter]]
}
