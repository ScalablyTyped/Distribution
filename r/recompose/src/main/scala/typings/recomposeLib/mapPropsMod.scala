package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#mapprops
@JSImport("recompose/mapProps", JSImport.Namespace)
@js.native
object mapPropsMod extends js.Object {
  def default[TInner, TOutter](propsMapper: recomposeLib.recomposeMod.mapper[TOutter, TInner]): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner, TOutter] = js.native
}

