package typings.shakacodeRecompose

import typings.shakacodeRecompose.mod.ComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#flattenprop
object flattenPropMod {
  
  @JSImport("@shakacode/recompose/flattenProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(propName: String): ComponentEnhancer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propName.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[Any, Any]]
}
