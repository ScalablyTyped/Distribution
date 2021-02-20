package typings.recompose

import org.scalablytyped.runtime.StringDictionary
import typings.recompose.mod.InferableComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#hoiststatics
object hoistStaticsMod {
  
  @JSImport("recompose/hoistStatics", JSImport.Default)
  @js.native
  def default[TProps](hoc: InferableComponentEnhancer[TProps]): InferableComponentEnhancer[TProps] = js.native
  @JSImport("recompose/hoistStatics", JSImport.Default)
  @js.native
  def default[TProps](hoc: InferableComponentEnhancer[TProps], blacklist: StringDictionary[Boolean]): InferableComponentEnhancer[TProps] = js.native
}
