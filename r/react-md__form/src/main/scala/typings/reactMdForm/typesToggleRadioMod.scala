package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.typesToggleInputToggleMod.InputToggleProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesToggleRadioMod {
  
  @JSImport("@react-md/form/types/toggle/Radio", "Radio")
  @js.native
  val Radio: ForwardRefExoticComponent[RadioProps & RefAttributes[HTMLInputElement]] = js.native
  
  trait RadioProps
    extends StObject
       with InputToggleProps {
    
    /**
      * A value is required for a radio button unlike a checkbox.
      */
    @JSName("value")
    var value_RadioProps: js.Array[String] | String | Double
  }
  object RadioProps {
    
    inline def apply(id: String, value: js.Array[String] | String | Double): RadioProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
      
      inline def setValue(value: js.Array[String] | String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
