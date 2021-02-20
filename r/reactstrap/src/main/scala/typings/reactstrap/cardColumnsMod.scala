package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardColumnsMod {
  
  @JSImport("reactstrap/lib/CardColumns", JSImport.Default)
  @js.native
  class default ()
    extends Component[CardColumnsProps, js.Object, js.Any]
  
  type CardColumns = Component[CardColumnsProps, js.Object, js.Any]
  
  @js.native
  trait CardColumnsProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
  }
  object CardColumnsProps {
    
    @scala.inline
    def apply(): CardColumnsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardColumnsProps]
    }
    
    @scala.inline
    implicit class CardColumnsPropsMutableBuilder[Self <: CardColumnsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
