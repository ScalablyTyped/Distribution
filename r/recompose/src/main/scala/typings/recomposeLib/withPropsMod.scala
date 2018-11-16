package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withprops
@JSImport("recompose/withProps", JSImport.Namespace)
@js.native
object withPropsMod extends js.Object {
  def default[TInner, TOutter](createProps: TInner): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def default[TInner, TOutter](createProps: recomposeLib.recomposeMod.mapper[TOutter, TInner]): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
}

