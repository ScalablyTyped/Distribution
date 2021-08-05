package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactSelect.anon.OnMouseDown
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.PropsWithStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMod {
  
  @JSImport("react-select/src/components/Control", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/components/Control", JSImport.Default)
  @js.native
  val default: ComponentType[ControlProps[js.Any]] = js.native
  
  inline def css(state: State): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(state.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  @js.native
  trait ControlProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType]
       with PropsWithStyles
       with State {
    
    /** Children to render. */
    var children: ReactNode = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    /* InferMemberOverrides */
    override def getStyles(name: String, props: js.Any): js.Object = js.native
    
    /** The mouse down event and the innerRef to pass down to the controller element. */
    var innerProps: OnMouseDown = js.native
    
    var innerRef: Ref[js.Any] = js.native
  }
  
  trait State extends StObject {
    
    /** Whether the select is disabled. */
    var isDisabled: Boolean
    
    /** Whether the select is focused. */
    var isFocused: Boolean
    
    /** Whether the select is expanded. */
    var menuIsOpen: Boolean
  }
  object State {
    
    inline def apply(isDisabled: Boolean, isFocused: Boolean, menuIsOpen: Boolean): State = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], menuIsOpen = menuIsOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setMenuIsOpen(value: Boolean): Self = StObject.set(x, "menuIsOpen", value.asInstanceOf[js.Any])
    }
  }
}
