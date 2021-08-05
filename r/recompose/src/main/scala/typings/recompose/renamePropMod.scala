package typings.recompose

import typings.recompose.mod.ComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#renameprop
object renamePropMod {
  
  @JSImport("recompose/renameProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(outterName: String, innerName: String): ComponentEnhancer[js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(outterName.asInstanceOf[js.Any], innerName.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[js.Any, js.Any]]
}
