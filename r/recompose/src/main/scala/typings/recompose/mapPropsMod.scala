package typings.recompose

import typings.recompose.recomposeMod.InferableComponentEnhancerWithProps
import typings.recompose.recomposeMod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#mapprops
@JSImport("recompose/mapProps", JSImport.Namespace)
@js.native
object mapPropsMod extends js.Object {
  def default[TInner, TOutter](propsMapper: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner, TOutter] = js.native
}

