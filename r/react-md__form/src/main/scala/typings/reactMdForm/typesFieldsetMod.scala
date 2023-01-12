package typings.reactMdForm

import typings.react.mod.CSSProperties
import typings.react.mod.FieldsetHTMLAttributes
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLFieldSetElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFieldsetMod {
  
  @JSImport("@react-md/form/types/Fieldset", "Fieldset")
  @js.native
  val Fieldset: ForwardRefExoticComponent[FieldsetProps & RefAttributes[HTMLFieldSetElement]] = js.native
  
  trait FieldsetProps
    extends StObject
       with FieldsetHTMLAttributes[HTMLFieldSetElement] {
    
    /**
      * The legend to display. This is required since a fieldset loses most of its'
      * benefit for accessibility without a legend.
      */
    var legend: ReactNode
    
    /**
      * An optional classname to apply to the legend.
      */
    var legendClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the legend should only be styled to be visible for screen
      * readers.
      */
    var legendSROnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional style to apply to the legend element.
      */
    var legendStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Boolean if the fieldset should remove the default browser styles of margin,
      * padding, and border.
      */
    var unstyled: js.UndefOr[Boolean] = js.undefined
  }
  object FieldsetProps {
    
    inline def apply(): FieldsetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldsetProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldsetProps] (val x: Self) extends AnyVal {
      
      inline def setLegend(value: ReactNode): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendClassName(value: String): Self = StObject.set(x, "legendClassName", value.asInstanceOf[js.Any])
      
      inline def setLegendClassNameUndefined: Self = StObject.set(x, "legendClassName", js.undefined)
      
      inline def setLegendSROnly(value: Boolean): Self = StObject.set(x, "legendSROnly", value.asInstanceOf[js.Any])
      
      inline def setLegendSROnlyUndefined: Self = StObject.set(x, "legendSROnly", js.undefined)
      
      inline def setLegendStyle(value: CSSProperties): Self = StObject.set(x, "legendStyle", value.asInstanceOf[js.Any])
      
      inline def setLegendStyleUndefined: Self = StObject.set(x, "legendStyle", js.undefined)
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setUnstyled(value: Boolean): Self = StObject.set(x, "unstyled", value.asInstanceOf[js.Any])
      
      inline def setUnstyledUndefined: Self = StObject.set(x, "unstyled", js.undefined)
    }
  }
}
