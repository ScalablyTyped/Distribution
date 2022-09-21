package typings.rcSelect

import typings.rcSelect.anon.Children
import typings.rcSelect.baseSelectMod.BaseSelectProps
import typings.rcSelect.baseSelectMod.BaseSelectRef
import typings.rcSelect.optGroupMod.OptionGroupFC
import typings.rcSelect.optionMod.OptionFC
import typings.rcSelect.selectMod.DefaultOptionType
import typings.rcSelect.selectMod.SelectProps
import typings.rcSelect.useBasePropsMod.BaseSelectContextProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-select", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children & (SelectProps[Any, DefaultOptionType]), ReactElement]) & typings.rcSelect.anon.OptGroup = js.native
  
  @JSImport("rc-select", "BaseSelect")
  @js.native
  val BaseSelect: ForwardRefExoticComponent[BaseSelectProps & RefAttributes[BaseSelectRef]] = js.native
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select", "OptGroup")
  @js.native
  val OptGroup: OptionGroupFC = js.native
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select", "Option")
  @js.native
  val Option: OptionFC = js.native
  
  inline def useBaseProps(): BaseSelectContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useBaseProps")().asInstanceOf[BaseSelectContextProps]
}
