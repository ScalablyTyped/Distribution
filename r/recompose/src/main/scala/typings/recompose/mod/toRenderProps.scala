package typings.recompose.mod

import typings.react.mod.StatelessComponent
import typings.recompose.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "toRenderProps")
@js.native
object toRenderProps extends js.Object {
  def apply[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): StatelessComponent[TOutter with AnonChildren[TInner]] = js.native
}

