package typings.recompose

import typings.recompose.mod.ComponentEnhancer
import typings.recompose.mod.NameMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#renameprops
object renamePropsMod {
  
  @JSImport("recompose/renameProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nameMap: NameMap): ComponentEnhancer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nameMap.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[Any, Any]]
}
