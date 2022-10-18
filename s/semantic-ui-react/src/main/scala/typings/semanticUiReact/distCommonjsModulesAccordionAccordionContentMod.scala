package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesAccordionAccordionContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionContent", JSImport.Default)
  @js.native
  val default: FC[AccordionContentProps] = js.native
  
  trait AccordionContentProps
    extends StObject
       with StrictAccordionContentProps
       with /* key */ StringDictionary[Any]
  object AccordionContentProps {
    
    inline def apply(): AccordionContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionContentProps]
    }
  }
  
  trait StrictAccordionContentProps extends StObject {
    
    /** Whether or not the content is visible. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictAccordionContentProps {
    
    inline def apply(): StrictAccordionContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionContentProps]
    }
    
    extension [Self <: StrictAccordionContentProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = FC[AccordionContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesAccordionAccordionContentMod.foo` */
  override def _to: FC[AccordionContentProps] = default
}
