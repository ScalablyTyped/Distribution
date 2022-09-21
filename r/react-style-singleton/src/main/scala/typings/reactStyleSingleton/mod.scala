package typings.reactStyleSingleton

import typings.react.mod.FC
import typings.reactStyleSingleton.anon.Add
import typings.reactStyleSingleton.componentMod.Props
import typings.reactStyleSingleton.hookMod.StyleSingletonHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-style-singleton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def styleHookSingleton(): StyleSingletonHook = ^.asInstanceOf[js.Dynamic].applyDynamic("styleHookSingleton")().asInstanceOf[StyleSingletonHook]
  
  inline def styleSingleton(): FC[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleSingleton")().asInstanceOf[FC[Props]]
  
  inline def stylesheetSingleton(): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("stylesheetSingleton")().asInstanceOf[Add]
}
