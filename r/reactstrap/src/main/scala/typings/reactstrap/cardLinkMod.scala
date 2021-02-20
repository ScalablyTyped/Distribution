package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.Ref
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardLinkMod {
  
  @JSImport("reactstrap/lib/CardLink", JSImport.Default)
  @js.native
  class default ()
    extends Component[CardLinkProps, js.Object, js.Any]
  
  type CardLink = Component[CardLinkProps, js.Object, js.Any]
  
  @js.native
  trait CardLinkProps
    extends AnchorHTMLAttributes[HTMLAnchorElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
  }
  object CardLinkProps {
    
    @scala.inline
    def apply(): CardLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardLinkProps]
    }
    
    @scala.inline
    implicit class CardLinkPropsMutableBuilder[Self <: CardLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
