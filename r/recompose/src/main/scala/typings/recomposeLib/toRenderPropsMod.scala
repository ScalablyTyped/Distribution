package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#torenderprops
@JSImport("recompose/toRenderProps", JSImport.Namespace)
@js.native
object toRenderPropsMod extends js.Object {
  def default[TInner, TOutter](hoc: recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): reactLib.reactMod.StatelessComponent[TOutter with recomposeLib.Anon_Children[TInner]] = js.native
}

