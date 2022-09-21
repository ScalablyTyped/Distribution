package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.anon.`2`
import typings.reactDayPicker.navigationContextMod.NavigationContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextsNavigationMod {
  
  @JSImport("react-day-picker/dist/contexts/Navigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/Navigation", "NavigationContext")
  @js.native
  val NavigationContext: Context[js.UndefOr[NavigationContextValue]] = js.native
  
  inline def NavigationProvider(props: `2`): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NavigationProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useNavigation(): NavigationContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigation")().asInstanceOf[NavigationContextValue]
}
