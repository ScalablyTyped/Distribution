package typings.rcSelect

import typings.rcSelect.anon.Children
import typings.rcSelect.libBaseSelectMod.BaseSelectProps
import typings.rcSelect.libBaseSelectMod.BaseSelectRef
import typings.rcSelect.libHooksUseBasePropsMod.BaseSelectContextProps
import typings.rcSelect.libOptGroupMod.OptionGroupFC
import typings.rcSelect.libOptionMod.OptionFC
import typings.rcSelect.libSelectMod.DefaultOptionType
import typings.rcSelect.libSelectMod.SelectProps
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
