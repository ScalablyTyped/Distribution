package typings.recompose

import typings.react.mod.StatelessComponent
import typings.recompose.anon.Children
import typings.recompose.mod.InferableComponentEnhancerWithProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#torenderprops
object toRenderPropsMod {
  
  @JSImport("recompose/toRenderProps", JSImport.Default)
  @js.native
  def default[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): StatelessComponent[TOutter with Children[TInner]] = js.native
}
