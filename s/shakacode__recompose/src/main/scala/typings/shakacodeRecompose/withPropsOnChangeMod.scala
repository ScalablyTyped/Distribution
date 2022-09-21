package typings.shakacodeRecompose

import typings.shakacodeRecompose.mod.InferableComponentEnhancerWithProps
import typings.shakacodeRecompose.mod.mapper
import typings.shakacodeRecompose.mod.predicateDiff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#withpropsonchange
object withPropsOnChangeMod {
  
  @JSImport("@shakacode/recompose/withPropsOnChange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TInner, TOutter](shouldMapOrKeys: js.Array[String], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(shouldMapOrKeys.asInstanceOf[js.Any], createProps.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]]
  inline def default[TInner, TOutter](shouldMapOrKeys: predicateDiff[TOutter], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(shouldMapOrKeys.asInstanceOf[js.Any], createProps.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]]
}
