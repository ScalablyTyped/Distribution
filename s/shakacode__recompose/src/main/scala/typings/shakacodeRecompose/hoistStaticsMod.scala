package typings.shakacodeRecompose

import org.scalablytyped.runtime.StringDictionary
import typings.shakacodeRecompose.mod.InferableComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#hoiststatics
object hoistStaticsMod {
  
  @JSImport("@shakacode/recompose/hoistStatics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TProps](hoc: InferableComponentEnhancer[TProps]): InferableComponentEnhancer[TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hoc.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[TProps]]
  inline def default[TProps](hoc: InferableComponentEnhancer[TProps], blacklist: StringDictionary[Boolean]): InferableComponentEnhancer[TProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hoc.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancer[TProps]]
}
