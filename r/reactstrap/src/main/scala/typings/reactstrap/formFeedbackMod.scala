package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFeedbackMod {
  
  @JSImport("reactstrap/lib/FormFeedback", JSImport.Default)
  @js.native
  class default ()
    extends Component[FormFeedbackProps, js.Object, js.Any]
  
  type FormFeedback = Component[FormFeedbackProps, js.Object, js.Any]
  
  @js.native
  trait FormFeedbackProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var tooltip: js.UndefOr[Boolean] = js.native
    
    var valid: js.UndefOr[Boolean] = js.native
  }
  object FormFeedbackProps {
    
    @scala.inline
    def apply(): FormFeedbackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFeedbackProps]
    }
    
    @scala.inline
    implicit class FormFeedbackPropsMutableBuilder[Self <: FormFeedbackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
}
