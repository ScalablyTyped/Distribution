package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTextareaMod {
  
  @JSImport("primereact/components/inputtextarea/InputTextarea", "InputTextarea")
  @js.native
  class InputTextarea protected ()
    extends Component[InputTextareaProps, js.Any, js.Any] {
    def this(props: InputTextareaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InputTextareaProps, context: js.Any) = this()
  }
  
  @js.native
  trait InputTextareaProps
    extends HTMLProps[HTMLTextAreaElement]
       with /* key */ StringDictionary[js.Any] {
    
    var autoResize: js.UndefOr[Boolean] = js.native
    
    var tooltip: js.UndefOr[js.Any] = js.native
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  }
  object InputTextareaProps {
    
    @scala.inline
    def apply(): InputTextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputTextareaProps]
    }
    
    @scala.inline
    implicit class InputTextareaPropsMutableBuilder[Self <: InputTextareaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
