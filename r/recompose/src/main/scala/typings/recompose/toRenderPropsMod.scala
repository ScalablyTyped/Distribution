package typings.recompose

import typings.react.reactMod.StatelessComponent
import typings.recompose.recomposeMod.InferableComponentEnhancerWithProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#torenderprops
@JSImport("recompose/toRenderProps", JSImport.Namespace)
@js.native
object toRenderPropsMod extends js.Object {
  def default[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): StatelessComponent[TOutter with Anon_Children[TInner]] = js.native
}

