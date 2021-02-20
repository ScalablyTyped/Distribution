package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait PasswordProps
    extends HTMLProps[HTMLInputElement]
       with /* key */ StringDictionary[js.Any] {
    
    var feedback: js.UndefOr[Boolean] = js.native
    
    var mediumLabel: js.UndefOr[String] = js.native
    
    var panelClassName: js.UndefOr[String] = js.native
    
    var panelStyle: js.UndefOr[js.Object] = js.native
    
    var promptLabel: js.UndefOr[String] = js.native
    
    var strongLabel: js.UndefOr[String] = js.native
    
    var tooltip: js.UndefOr[js.Any] = js.native
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
    
    var weakLabel: js.UndefOr[String] = js.native
  }
  object PasswordProps {
    
    @scala.inline
    def apply(): PasswordProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasswordProps]
    }
    
    @scala.inline
    implicit class PasswordPropsMutableBuilder[Self <: PasswordProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeedback(value: Boolean): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
      
      @scala.inline
      def setMediumLabel(value: String): Self = StObject.set(x, "mediumLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumLabelUndefined: Self = StObject.set(x, "mediumLabel", js.undefined)
      
      @scala.inline
      def setPanelClassName(value: String): Self = StObject.set(x, "panelClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelClassNameUndefined: Self = StObject.set(x, "panelClassName", js.undefined)
      
      @scala.inline
      def setPanelStyle(value: js.Object): Self = StObject.set(x, "panelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelStyleUndefined: Self = StObject.set(x, "panelStyle", js.undefined)
      
      @scala.inline
      def setPromptLabel(value: String): Self = StObject.set(x, "promptLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptLabelUndefined: Self = StObject.set(x, "promptLabel", js.undefined)
      
      @scala.inline
      def setStrongLabel(value: String): Self = StObject.set(x, "strongLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongLabelUndefined: Self = StObject.set(x, "strongLabel", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setWeakLabel(value: String): Self = StObject.set(x, "weakLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeakLabelUndefined: Self = StObject.set(x, "weakLabel", js.undefined)
    }
  }
}
