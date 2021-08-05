package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Header/HeaderContent", JSImport.Default)
  @js.native
  val default: StatelessComponent[HeaderContentProps] = js.native
  
  trait HeaderContentProps
    extends StObject
       with StrictHeaderContentProps
       with /* key */ StringDictionary[js.Any]
  object HeaderContentProps {
    
    inline def apply(): HeaderContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderContentProps]
    }
  }
  
  trait StrictHeaderContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictHeaderContentProps {
    
    inline def apply(): StrictHeaderContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictHeaderContentProps]
    }
    
    extension [Self <: StrictHeaderContentProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = StatelessComponent[HeaderContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `headerContentMod.foo` */
  override def _to: StatelessComponent[HeaderContentProps] = default
}
