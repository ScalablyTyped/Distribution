package typings.recompose

import typings.recompose.mod.InferableComponentEnhancer
import typings.recompose.mod.predicateDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#shouldupdate
@JSImport("recompose/shouldUpdate", JSImport.Namespace)
@js.native
object shouldUpdateMod extends js.Object {
  def default[TProps](test: predicateDiff[TProps]): InferableComponentEnhancer[js.Object] = js.native
}

