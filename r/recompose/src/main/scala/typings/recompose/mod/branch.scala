package typings.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "branch")
@js.native
object branch extends js.Object {
  def apply[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
  def apply[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object],
    falseEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
}

