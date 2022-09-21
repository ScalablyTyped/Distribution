package typings.shakacodeRecompose

import typings.shakacodeRecompose.mod.InferableComponentEnhancerWithProps
import typings.shakacodeRecompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#mapprops
object mapPropsMod {
  
  @JSImport("@shakacode/recompose/mapProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TInner, TOutter](propsMapper: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propsMapper.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner, TOutter]]
}
