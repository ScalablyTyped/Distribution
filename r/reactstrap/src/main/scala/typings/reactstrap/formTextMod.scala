package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formTextMod {
  
  @JSImport("reactstrap/lib/FormText", JSImport.Default)
  @js.native
  class default ()
    extends Component[FormTextProps, js.Object, js.Any]
  
  type FormText = Component[FormTextProps, js.Object, js.Any]
  
  trait FormTextProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
  }
  object FormTextProps {
    
    @scala.inline
    def apply(): FormTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormTextProps]
    }
    
    @scala.inline
    implicit class FormTextPropsMutableBuilder[Self <: FormTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
