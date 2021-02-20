package typings.reactMdForm

import typings.react.mod.CSSProperties
import typings.react.mod.FieldsetHTMLAttributes
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLFieldSetElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldsetMod {
  
  @JSImport("@react-md/form/types/Fieldset", "Fieldset")
  @js.native
  val Fieldset: ForwardRefExoticComponent[FieldsetProps with RefAttributes[HTMLFieldSetElement]] = js.native
  
  @js.native
  trait FieldsetProps extends FieldsetHTMLAttributes[HTMLFieldSetElement] {
    
    /**
      * The legend to display. This is required since a fieldset loses most of its'
      * benefit for accessibility without a legend.
      */
    var legend: ReactNode = js.native
    
    /**
      * An optional classname to apply to the legend.
      */
    var legendClassName: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the legend should only be styled to be visible for screen
      * readers.
      */
    var legendSROnly: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional style to apply to the legend element.
      */
    var legendStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Boolean if the fieldset should remove the default browser styles of margin,
      * padding, and border.
      */
    var unstyled: js.UndefOr[Boolean] = js.native
  }
  object FieldsetProps {
    
    @scala.inline
    def apply(): FieldsetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldsetProps]
    }
    
    @scala.inline
    implicit class FieldsetPropsMutableBuilder[Self <: FieldsetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLegend(value: ReactNode): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendClassName(value: String): Self = StObject.set(x, "legendClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendClassNameUndefined: Self = StObject.set(x, "legendClassName", js.undefined)
      
      @scala.inline
      def setLegendSROnly(value: Boolean): Self = StObject.set(x, "legendSROnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendSROnlyUndefined: Self = StObject.set(x, "legendSROnly", js.undefined)
      
      @scala.inline
      def setLegendStyle(value: CSSProperties): Self = StObject.set(x, "legendStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendStyleUndefined: Self = StObject.set(x, "legendStyle", js.undefined)
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setUnstyled(value: Boolean): Self = StObject.set(x, "unstyled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstyledUndefined: Self = StObject.set(x, "unstyled", js.undefined)
    }
  }
}
