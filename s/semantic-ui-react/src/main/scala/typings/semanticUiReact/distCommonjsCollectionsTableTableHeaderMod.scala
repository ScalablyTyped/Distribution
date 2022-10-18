package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsTableTableHeaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableHeader", JSImport.Default)
  @js.native
  val default: FC[TableHeaderProps] = js.native
  
  trait StrictTableHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A definition table can have a full width header or footer, filling in the gap left by the first column. */
    var fullWidth: js.UndefOr[Boolean] = js.undefined
  }
  object StrictTableHeaderProps {
    
    inline def apply(): StrictTableHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableHeaderProps]
    }
    
    extension [Self <: StrictTableHeaderProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    }
  }
  
  trait TableHeaderProps
    extends StObject
       with StrictTableHeaderProps
       with /* key */ StringDictionary[Any]
  object TableHeaderProps {
    
    inline def apply(): TableHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderProps]
    }
  }
  
  type _To = FC[TableHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsTableTableHeaderMod.foo` */
  override def _to: FC[TableHeaderProps] = default
}
