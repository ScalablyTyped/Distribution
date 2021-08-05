package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.scrollScrollMod.ScrollProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withScrollMod {
  
  @JSImport("react-fns/dist/Scroll/withScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withScroll[Props](Component: ComponentType[Props & ScrollProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScroll")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
