package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.distCommonjsElementsStepStepDescriptionMod.StepDescriptionProps
import typings.semanticUiReact.distCommonjsElementsStepStepTitleMod.StepTitleProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsStepStepContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/StepContent", JSImport.Default)
  @js.native
  val default: FC[StepContentProps] = js.native
  
  trait StepContentProps
    extends StObject
       with StrictStepContentProps
       with /* key */ StringDictionary[Any]
  object StepContentProps {
    
    inline def apply(): StepContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepContentProps]
    }
  }
  
  trait StrictStepContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for StepDescription. */
    var description: js.UndefOr[SemanticShorthandItem[StepDescriptionProps]] = js.undefined
    
    /** Shorthand for StepTitle. */
    var title: js.UndefOr[SemanticShorthandItem[StepTitleProps]] = js.undefined
  }
  object StrictStepContentProps {
    
    inline def apply(): StrictStepContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStepContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictStepContentProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDescription(value: SemanticShorthandItem[StepDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionFunction3(
        value: (/* component */ ElementType[StepDescriptionProps], StepDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTitle(value: SemanticShorthandItem[StepTitleProps]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction3(
        value: (/* component */ ElementType[StepTitleProps], StepTitleProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "title", js.Any.fromFunction3(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FC[StepContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsStepStepContentMod.foo` */
  override def _to: FC[StepContentProps] = default
}
