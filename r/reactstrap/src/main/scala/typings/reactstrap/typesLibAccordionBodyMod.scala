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

object typesLibAccordionBodyMod {
  
  @JSImport("reactstrap/types/lib/AccordionBody", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AccordionBodyProps, js.Object, Any]
  
  type AccordionBody = Component[AccordionBodyProps, js.Object, Any]
  
  trait AccordionBodyProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var accordionId: String
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object AccordionBodyProps {
    
    inline def apply(accordionId: String): AccordionBodyProps = {
      val __obj = js.Dynamic.literal(accordionId = accordionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionBodyProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccordionBodyProps] (val x: Self) extends AnyVal {
      
      inline def setAccordionId(value: String): Self = StObject.set(x, "accordionId", value.asInstanceOf[js.Any])
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
