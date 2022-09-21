package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepDescriptionMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/StepDescription", JSImport.Default)
  @js.native
  val default: FC[StepDescriptionProps] = js.native
  
  trait StepDescriptionProps
    extends StObject
       with StrictStepDescriptionProps
       with /* key */ StringDictionary[Any]
  object StepDescriptionProps {
    
    inline def apply(): StepDescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepDescriptionProps]
    }
  }
  
  trait StrictStepDescriptionProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictStepDescriptionProps {
    
    inline def apply(): StrictStepDescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStepDescriptionProps]
    }
    
    extension [Self <: StrictStepDescriptionProps](x: Self) {
      
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
  
  type _To = FC[StepDescriptionProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepDescriptionMod.foo` */
  override def _to: FC[StepDescriptionProps] = default
}
