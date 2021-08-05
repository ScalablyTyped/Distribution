package typings.recompose

import typings.recompose.mod.InferableComponentEnhancerWithProps
import typings.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#mapprops
object mapPropsMod {
  
  @JSImport("recompose/mapProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TInner, TOutter](propsMapper: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propsMapper.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner, TOutter]]
}
