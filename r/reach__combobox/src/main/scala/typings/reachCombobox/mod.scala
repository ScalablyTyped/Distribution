package typings.reachCombobox

import typings.reachCombobox.srcMod.ComboboxContextValue
import typings.reachCombobox.srcMod.ComboboxOptionContextValue
import typings.react.mod.KeyboardEvent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/combobox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@reach/combobox", "Combobox")
  @js.native
  val Combobox: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', ComboboxProps> */ Any = js.native
  
  @JSImport("@reach/combobox", "ComboboxButton")
  @js.native
  val ComboboxButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'button', ComboboxButtonProps> */ Any = js.native
  
  @JSImport("@reach/combobox", "ComboboxInput")
  @js.native
  val ComboboxInput: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'input', ComboboxInputProps> */ Any = js.native
  
  @JSImport("@reach/combobox", "ComboboxList")
  @js.native
  val ComboboxList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'ul', ComboboxListProps> */ Any = js.native
  
  @JSImport("@reach/combobox", "ComboboxOption")
  @js.native
  val ComboboxOption: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'li', ComboboxOptionProps> */ Any = js.native
  
  object ComboboxOptionText {
    
    inline def apply(): Element = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Element]
    
    @JSImport("@reach/combobox", "ComboboxOptionText")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@reach/combobox", "ComboboxOptionText.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@reach/combobox", "ComboboxPopover")
  @js.native
  val ComboboxPopover: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', ComboboxPopoverProps & Partial<Omit<PopoverProps, 'unstable_skipInitialRender'>>> */ Any = js.native
  
  inline def escapeRegexp(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegexp")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * We want the same events when the input or the popup have focus (HOW COOL ARE
    * HOOKS BTW?) This is probably the hairiest piece but it's not bad.
    */
  inline def unstableUseKeyDown(): js.Function1[/* event */ KeyboardEvent[typings.std.Element], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useKeyDown")().asInstanceOf[js.Function1[/* event */ KeyboardEvent[typings.std.Element], Unit]]
  
  inline def useComboboxContext(): ComboboxContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useComboboxContext")().asInstanceOf[ComboboxContextValue]
  
  inline def useComboboxOptionContext(): ComboboxOptionContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useComboboxOptionContext")().asInstanceOf[ComboboxOptionContextValue]
}
