package typings.shakacodeRecompose

import typings.shakacodeRecompose.mod.ComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#renameprop
object renamePropMod {
  
  @JSImport("@shakacode/recompose/renameProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(outterName: String, innerName: String): ComponentEnhancer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(outterName.asInstanceOf[js.Any], innerName.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[Any, Any]]
}
