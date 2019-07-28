package typings.recompose

import typings.recompose.recomposeMod.ComponentEnhancer
import typings.recompose.recomposeMod.InferableComponentEnhancer
import typings.recompose.recomposeMod.predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#branch
@JSImport("recompose/branch", JSImport.Namespace)
@js.native
object branchMod extends js.Object {
  def default[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
  def default[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object],
    falseEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
}

