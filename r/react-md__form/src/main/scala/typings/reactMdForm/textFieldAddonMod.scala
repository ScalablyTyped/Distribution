package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldAddonMod {
  
  @JSImport("@react-md/form/types/text-field/TextFieldAddon", "TextFieldAddon")
  @js.native
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @js.native
  trait TextFieldAddonProps extends HTMLAttributes[HTMLSpanElement] {
    
    /**
      * Boolean if the addon should be presentational only and prevent pointer
      * events.
      */
    var presentational: js.UndefOr[Boolean] = js.native
  }
  object TextFieldAddonProps {
    
    @scala.inline
    def apply(): TextFieldAddonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFieldAddonProps]
    }
    
    @scala.inline
    implicit class TextFieldAddonPropsMutableBuilder[Self <: TextFieldAddonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPresentational(value: Boolean): Self = StObject.set(x, "presentational", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresentationalUndefined: Self = StObject.set(x, "presentational", js.undefined)
    }
  }
}
