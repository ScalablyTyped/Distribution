package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.selectRangeContextMod.SelectRangeContextValue
import typings.reactDayPicker.selectRangeContextMod.SelectRangeProviderInternalProps
import typings.reactDayPicker.selectRangeContextMod.SelectRangeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectRangeMod {
  
  @JSImport("react-day-picker/dist/contexts/SelectRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/SelectRange", "SelectRangeContext")
  @js.native
  val SelectRangeContext: Context[js.UndefOr[SelectRangeContextValue]] = js.native
  
  inline def SelectRangeProvider(props: SelectRangeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectRangeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SelectRangeProviderInternal(hasInitialPropsChildren: SelectRangeProviderInternalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectRangeProviderInternal")(hasInitialPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useSelectRange(): SelectRangeContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectRange")().asInstanceOf[SelectRangeContextValue]
}
