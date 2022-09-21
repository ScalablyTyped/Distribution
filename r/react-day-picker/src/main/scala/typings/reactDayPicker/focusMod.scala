package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.anon.Children
import typings.reactDayPicker.focusContextMod.FocusContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusMod {
  
  @JSImport("react-day-picker/dist/contexts/Focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/Focus", "FocusContext")
  @js.native
  val FocusContext: Context[js.UndefOr[FocusContextValue]] = js.native
  
  inline def FocusProvider(props: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FocusProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useFocusContext(): FocusContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusContext")().asInstanceOf[FocusContextValue]
}
