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

object inputGroupMod {
  
  @JSImport("reactstrap/lib/InputGroup", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputGroupProps, js.Object, js.Any]
  
  type InputGroup = Component[InputGroupProps, js.Object, js.Any]
  
  trait InputGroupProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
  }
  object InputGroupProps {
    
    @scala.inline
    def apply(): InputGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupProps]
    }
    
    @scala.inline
    implicit class InputGroupPropsMutableBuilder[Self <: InputGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
