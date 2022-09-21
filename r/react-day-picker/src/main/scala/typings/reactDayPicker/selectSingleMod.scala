package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.selectSingleContextMod.SelectSingleContextValue
import typings.reactDayPicker.selectSingleContextMod.SelectSingleProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectSingleMod {
  
  @JSImport("react-day-picker/dist/contexts/SelectSingle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/SelectSingle", "SelectSingleContext")
  @js.native
  val SelectSingleContext: Context[js.UndefOr[SelectSingleContextValue]] = js.native
  
  inline def SelectSingleProvider(props: SelectSingleProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectSingleProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SelectSingleProviderInternal(
    hasInitialPropsChildren: typings.reactDayPicker.selectSingleContextMod.SelectSingleProviderInternal
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectSingleProviderInternal")(hasInitialPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useSelectSingle(): SelectSingleContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectSingle")().asInstanceOf[SelectSingleContextValue]
}
