package typings.recompose

import typings.recompose.mod.InferableComponentEnhancerWithProps
import typings.recompose.mod.mapper
import typings.recompose.mod.predicateDiff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withpropsonchange
object withPropsOnChangeMod {
  
  @JSImport("recompose/withPropsOnChange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[TInner, TOutter](shouldMapOrKeys: js.Array[String], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(shouldMapOrKeys.asInstanceOf[js.Any], createProps.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]]
  @scala.inline
  def default[TInner, TOutter](shouldMapOrKeys: predicateDiff[TOutter], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(shouldMapOrKeys.asInstanceOf[js.Any], createProps.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]]
}
