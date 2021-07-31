package typings.recompose

import typings.react.mod.StatelessComponent
import typings.recompose.anon.Children
import typings.recompose.mod.InferableComponentEnhancerWithProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#torenderprops
object toRenderPropsMod {
  
  @JSImport("recompose/toRenderProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]): StatelessComponent[TOutter & Children[TInner]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hoc.asInstanceOf[js.Any]).asInstanceOf[StatelessComponent[TOutter & Children[TInner]]]
}
