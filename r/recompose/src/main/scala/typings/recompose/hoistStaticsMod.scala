package typings.recompose

import org.scalablytyped.runtime.StringDictionary
import typings.recompose.recomposeMod.InferableComponentEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#hoiststatics
@JSImport("recompose/hoistStatics", JSImport.Namespace)
@js.native
object hoistStaticsMod extends js.Object {
  def default[TProps](hoc: InferableComponentEnhancer[TProps]): InferableComponentEnhancer[TProps] = js.native
  def default[TProps](hoc: InferableComponentEnhancer[TProps], blacklist: StringDictionary[Boolean]): InferableComponentEnhancer[TProps] = js.native
}

