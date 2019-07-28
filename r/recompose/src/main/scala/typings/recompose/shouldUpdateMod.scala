package typings.recompose

import typings.recompose.recomposeMod.InferableComponentEnhancer
import typings.recompose.recomposeMod.predicateDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#shouldupdate
@JSImport("recompose/shouldUpdate", JSImport.Namespace)
@js.native
object shouldUpdateMod extends js.Object {
  def default[TProps](test: predicateDiff[TProps]): InferableComponentEnhancer[js.Object] = js.native
}

