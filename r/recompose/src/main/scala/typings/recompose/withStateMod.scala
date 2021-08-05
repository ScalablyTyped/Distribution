package typings.recompose

import typings.recompose.mod.InferableComponentEnhancerWithProps
import typings.recompose.mod.mapper
import typings.recompose.mod.stateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withstate
object withStateMod {
  
  @JSImport("recompose/withState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stateName.asInstanceOf[js.Any], stateUpdaterName.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter]]
  inline def default[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: mapper[TOutter, TState]): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stateName.asInstanceOf[js.Any], stateUpdaterName.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter]]
}
