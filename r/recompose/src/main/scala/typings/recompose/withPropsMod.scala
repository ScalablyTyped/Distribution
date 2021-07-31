package typings.recompose

import typings.recompose.mod.InferableComponentEnhancerWithProps
import typings.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withprops
object withPropsMod {
  
  @JSImport("recompose/withProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[TInner, TOutter](createProps: TInner): InferableComponentEnhancerWithProps[TInner & TOutter, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(createProps.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]]
  @scala.inline
  def default[TInner, TOutter](createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner & TOutter, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(createProps.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]]
}
