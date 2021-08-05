package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerSubheaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Header/HeaderSubheader", JSImport.Default)
  @js.native
  val default: StatelessComponent[HeaderSubheaderProps] = js.native
  
  trait HeaderSubheaderProps
    extends StObject
       with StrictHeaderSubheaderProps
       with /* key */ StringDictionary[js.Any]
  object HeaderSubheaderProps {
    
    inline def apply(): HeaderSubheaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderSubheaderProps]
    }
  }
  
  trait StrictHeaderSubheaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictHeaderSubheaderProps {
    
    inline def apply(): StrictHeaderSubheaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictHeaderSubheaderProps]
    }
    
    extension [Self <: StrictHeaderSubheaderProps](x: Self) {
      
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
  
  type _To = StatelessComponent[HeaderSubheaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `headerSubheaderMod.foo` */
  override def _to: StatelessComponent[HeaderSubheaderProps] = default
}
