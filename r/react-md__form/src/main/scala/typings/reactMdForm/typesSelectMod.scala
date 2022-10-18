package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdForm.typesSelectListboxMod.ListboxProps
import typings.reactMdForm.typesSelectNativeSelectMod.NativeSelectProps
import typings.reactMdForm.typesSelectOptionMod.OptionProps
import typings.reactMdForm.typesSelectSelectMod.SelectProps
import typings.reactMdForm.typesSelectUtilsMod.ListboxOption
import typings.reactMdList.typesListMod.ListElement
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectMod {
  
  @JSImport("@react-md/form/types/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_DISPLAY_LABEL")(option.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any], includeLeft.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_OPTION_ID")(baseId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_OPTION_LABEL")(option.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  @JSImport("@react-md/form/types/select", "Listbox")
  @js.native
  val Listbox: ForwardRefExoticComponent[ListboxProps & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "NativeSelect")
  @js.native
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps & RefAttributes[HTMLSelectElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "Option")
  @js.native
  val Option: ForwardRefExoticComponent[OptionProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "Select")
  @js.native
  val Select: ForwardRefExoticComponent[SelectProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isListboxOptionProps")(option.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean]
}
