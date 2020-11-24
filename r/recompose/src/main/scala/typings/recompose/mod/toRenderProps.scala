package typings.recompose.mod

import typings.react.mod.StatelessComponent
import typings.recompose.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recompose", "toRenderProps")
@js.native
object toRenderProps extends js.Object {
  
  def apply[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): StatelessComponent[TOutter with Children[TInner]] = js.native
}
