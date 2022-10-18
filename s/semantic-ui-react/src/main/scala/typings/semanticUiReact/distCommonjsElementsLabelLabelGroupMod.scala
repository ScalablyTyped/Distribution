package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticSIZES
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsLabelLabelGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label/LabelGroup", JSImport.Default)
  @js.native
  val default: FC[LabelGroupProps] = js.native
  
  trait LabelGroupProps
    extends StObject
       with StrictLabelGroupProps
       with /* key */ StringDictionary[Any]
  object LabelGroupProps {
    
    inline def apply(): LabelGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelGroupProps]
    }
  }
  
  trait StrictLabelGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Labels can share shapes. */
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Label group can share colors together. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Label group can share sizes together. */
    var size: js.UndefOr[SemanticSIZES] = js.undefined
    
    /** Label group can share tag formatting. */
    var tag: js.UndefOr[Boolean] = js.undefined
  }
  object StrictLabelGroupProps {
    
    inline def apply(): StrictLabelGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictLabelGroupProps]
    }
    
    extension [Self <: StrictLabelGroupProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTag(value: Boolean): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  type _To = FC[LabelGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsLabelLabelGroupMod.foo` */
  override def _to: FC[LabelGroupProps] = default
}
