package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withWindowSizeMod {
  
  @JSImport("react-fns/dist/WindowSize/withWindowSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withWindowSize[Props](Component: ComponentType[Props & WindowSizeProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withWindowSize")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
