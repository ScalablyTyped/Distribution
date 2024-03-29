package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.typesLabelLabelMod.LabelProps
import typings.std.HTMLLabelElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLabelFloatingLabelMod {
  
  @JSImport("@react-md/form/types/label/FloatingLabel", "FloatingLabel")
  @js.native
  val FloatingLabel: ForwardRefExoticComponent[FloatingLabelProps & RefAttributes[HTMLLabelElement]] = js.native
  
  trait FloatingLabelProps
    extends StObject
       with LabelProps {
    
    /**
      * Boolean if it should use the dense spec.
      */
    var dense: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the label is currently floating over the text field.
      */
    var floating: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the text input or textarea currently have a value.
      */
    var valued: Boolean
  }
  object FloatingLabelProps {
    
    inline def apply(htmlFor: String, valued: Boolean): FloatingLabelProps = {
      val __obj = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any], valued = valued.asInstanceOf[js.Any])
      __obj.asInstanceOf[FloatingLabelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FloatingLabelProps] (val x: Self) extends AnyVal {
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setValued(value: Boolean): Self = StObject.set(x, "valued", value.asInstanceOf[js.Any])
    }
  }
}
