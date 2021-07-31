package typings.recompose

import typings.recompose.mod.InferableComponentEnhancer
import typings.recompose.mod.predicateDiff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#shouldupdate
object shouldUpdateMod {
  
  @JSImport("recompose/shouldUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[TProps](test: predicateDiff[TProps]): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(test.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
}
