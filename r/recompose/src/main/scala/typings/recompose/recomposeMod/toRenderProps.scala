package typings.recompose.recomposeMod

import typings.react.reactMod.StatelessComponent
import typings.recompose.Anon_Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "toRenderProps")
@js.native
object toRenderProps extends js.Object {
  def apply[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): StatelessComponent[TOutter with Anon_Children[TInner]] = js.native
}

