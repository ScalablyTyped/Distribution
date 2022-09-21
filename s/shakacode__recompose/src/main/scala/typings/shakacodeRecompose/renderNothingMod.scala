package typings.shakacodeRecompose

import org.scalablytyped.runtime.Shortcut
import typings.shakacodeRecompose.mod.InferableComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#rendernothing
object renderNothingMod extends Shortcut {
  
  @JSImport("@shakacode/recompose/renderNothing", JSImport.Default)
  @js.native
  val default: InferableComponentEnhancer[js.Object] = js.native
  
  type _To = InferableComponentEnhancer[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `renderNothingMod.foo` */
  override def _to: InferableComponentEnhancer[js.Object] = default
}
