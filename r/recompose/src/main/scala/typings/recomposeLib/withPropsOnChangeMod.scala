package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withpropsonchange
@JSImport("recompose/withPropsOnChange", JSImport.Namespace)
@js.native
object withPropsOnChangeMod extends js.Object {
  def default[TInner, TOutter](
    shouldMapOrKeys: js.Array[java.lang.String],
    createProps: recomposeLib.recomposeMod.mapper[TOutter, TInner]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def default[TInner, TOutter](
    shouldMapOrKeys: recomposeLib.recomposeMod.predicateDiff[TOutter],
    createProps: recomposeLib.recomposeMod.mapper[TOutter, TInner]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
}

