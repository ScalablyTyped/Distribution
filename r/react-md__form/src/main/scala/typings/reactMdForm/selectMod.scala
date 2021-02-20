package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdForm.listboxMod.ListboxProps
import typings.reactMdForm.nativeSelectMod.NativeSelectProps
import typings.reactMdForm.optionMod.OptionProps
import typings.reactMdForm.selectSelectMod.SelectProps
import typings.reactMdForm.utilsMod.ListboxOption
import typings.reactMdList.listMod.ListElement
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@react-md/form/types/select", "DEFAULT_GET_DISPLAY_LABEL")
  @js.native
  def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactNode = js.native
  
  @JSImport("@react-md/form/types/select", "DEFAULT_GET_OPTION_ID")
  @js.native
  def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = js.native
  
  @JSImport("@react-md/form/types/select", "DEFAULT_GET_OPTION_LABEL")
  @js.native
  def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): ReactNode = js.native
  
  @JSImport("@react-md/form/types/select", "Listbox")
  @js.native
  val Listbox: ForwardRefExoticComponent[ListboxProps with RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "NativeSelect")
  @js.native
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps with RefAttributes[HTMLSelectElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "Option")
  @js.native
  val Option: ForwardRefExoticComponent[OptionProps with RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "Select")
  @js.native
  val Select: ForwardRefExoticComponent[SelectProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "isListboxOptionProps")
  @js.native
  def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = js.native
}
