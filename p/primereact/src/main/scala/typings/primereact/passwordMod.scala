package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passwordMod {
  
  @JSImport("primereact/components/password/Password", "Password")
  @js.native
  class Password protected ()
    extends Component[PasswordProps, js.Any, js.Any] {
    def this(props: PasswordProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PasswordProps, context: js.Any) = this()
  }
  
  trait PasswordProps
    extends StObject
       with HTMLProps[HTMLInputElement]
       with /* key */ StringDictionary[js.Any] {
    
    var feedback: js.UndefOr[Boolean] = js.undefined
    
    var mediumLabel: js.UndefOr[String] = js.undefined
    
    var panelClassName: js.UndefOr[String] = js.undefined
    
    var panelStyle: js.UndefOr[js.Object] = js.undefined
    
    var promptLabel: js.UndefOr[String] = js.undefined
    
    var strongLabel: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[js.Any] = js.undefined
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    var weakLabel: js.UndefOr[String] = js.undefined
  }
  object PasswordProps {
    
    inline def apply(): PasswordProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasswordProps]
    }
    
    extension [Self <: PasswordProps](x: Self) {
      
      inline def setFeedback(value: Boolean): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
      
      inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
      
      inline def setMediumLabel(value: String): Self = StObject.set(x, "mediumLabel", value.asInstanceOf[js.Any])
      
      inline def setMediumLabelUndefined: Self = StObject.set(x, "mediumLabel", js.undefined)
      
      inline def setPanelClassName(value: String): Self = StObject.set(x, "panelClassName", value.asInstanceOf[js.Any])
      
      inline def setPanelClassNameUndefined: Self = StObject.set(x, "panelClassName", js.undefined)
      
      inline def setPanelStyle(value: js.Object): Self = StObject.set(x, "panelStyle", value.asInstanceOf[js.Any])
      
      inline def setPanelStyleUndefined: Self = StObject.set(x, "panelStyle", js.undefined)
      
      inline def setPromptLabel(value: String): Self = StObject.set(x, "promptLabel", value.asInstanceOf[js.Any])
      
      inline def setPromptLabelUndefined: Self = StObject.set(x, "promptLabel", js.undefined)
      
      inline def setStrongLabel(value: String): Self = StObject.set(x, "strongLabel", value.asInstanceOf[js.Any])
      
      inline def setStrongLabelUndefined: Self = StObject.set(x, "strongLabel", js.undefined)
      
      inline def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setWeakLabel(value: String): Self = StObject.set(x, "weakLabel", value.asInstanceOf[js.Any])
      
      inline def setWeakLabelUndefined: Self = StObject.set(x, "weakLabel", js.undefined)
    }
  }
}
