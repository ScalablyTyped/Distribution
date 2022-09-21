package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.selectMultipleContextMod.SelectMultipleContextValue
import typings.reactDayPicker.selectMultipleContextMod.SelectMultipleProviderInternalProps
import typings.reactDayPicker.selectMultipleContextMod.SelectMultipleProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMultipleMod {
  
  @JSImport("react-day-picker/dist/contexts/SelectMultiple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/SelectMultiple", "SelectMultipleContext")
  @js.native
  val SelectMultipleContext: Context[js.UndefOr[SelectMultipleContextValue]] = js.native
  
  inline def SelectMultipleProvider(props: SelectMultipleProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectMultipleProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SelectMultipleProviderInternal(hasInitialPropsChildren: SelectMultipleProviderInternalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectMultipleProviderInternal")(hasInitialPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useSelectMultiple(): SelectMultipleContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectMultiple")().asInstanceOf[SelectMultipleContextValue]
}
