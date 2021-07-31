package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardBodyMod {
  
  @JSImport("reactstrap/lib/CardBody", JSImport.Default)
  @js.native
  class default ()
    extends Component[CardBodyProps, js.Object, js.Any]
  
  type CardBody = Component[CardBodyProps, js.Object, js.Any]
  
  trait CardBodyProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
  }
  object CardBodyProps {
    
    @scala.inline
    def apply(): CardBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardBodyProps]
    }
    
    @scala.inline
    implicit class CardBodyPropsMutableBuilder[Self <: CardBodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
