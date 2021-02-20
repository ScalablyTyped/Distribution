package typings.recompose

import typings.recompose.mod.InferableComponentEnhancer
import typings.recompose.mod.predicateDiff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#shouldupdate
object shouldUpdateMod {
  
  @JSImport("recompose/shouldUpdate", JSImport.Default)
  @js.native
  def default[TProps](test: predicateDiff[TProps]): InferableComponentEnhancer[js.Object] = js.native
}
