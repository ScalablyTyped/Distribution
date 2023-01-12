package typings.reactstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibAccordionHeaderMod {
  
  @JSImport("reactstrap/types/lib/AccordionHeader", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AccordionHeaderProps, js.Object, Any]
  
  type AccordionHeader = Component[AccordionHeaderProps, js.Object, Any]
  
  trait AccordionHeaderProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var targetId: String
  }
  object AccordionHeaderProps {
    
    inline def apply(targetId: String): AccordionHeaderProps = {
      val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccordionHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    }
  }
}
