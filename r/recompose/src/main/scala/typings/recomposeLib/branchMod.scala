package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#branch
@JSImport("recompose/branch", JSImport.Namespace)
@js.native
object branchMod extends js.Object {
  def default[TOutter](
    test: recomposeLib.recomposeMod.predicate[TOutter],
    trueEnhancer: (recomposeLib.recomposeMod.ComponentEnhancer[_, _]) | recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object]
  ): recomposeLib.recomposeMod.ComponentEnhancer[_, TOutter] = js.native
  def default[TOutter](
    test: recomposeLib.recomposeMod.predicate[TOutter],
    trueEnhancer: (recomposeLib.recomposeMod.ComponentEnhancer[_, _]) | recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object],
    falseEnhancer: (recomposeLib.recomposeMod.ComponentEnhancer[_, _]) | recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object]
  ): recomposeLib.recomposeMod.ComponentEnhancer[_, TOutter] = js.native
}

