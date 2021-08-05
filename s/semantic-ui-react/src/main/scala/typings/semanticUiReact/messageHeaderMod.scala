package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageHeaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/MessageHeader", JSImport.Default)
  @js.native
  val default: StatelessComponent[MessageHeaderProps] = js.native
  
  trait MessageHeaderProps
    extends StObject
       with StrictMessageHeaderProps
       with /* key */ StringDictionary[js.Any]
  object MessageHeaderProps {
    
    inline def apply(): MessageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageHeaderProps]
    }
  }
  
  trait StrictMessageHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictMessageHeaderProps {
    
    inline def apply(): StrictMessageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMessageHeaderProps]
    }
    
    extension [Self <: StrictMessageHeaderProps](x: Self) {
      
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
  
  type _To = StatelessComponent[MessageHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `messageHeaderMod.foo` */
  override def _to: StatelessComponent[MessageHeaderProps] = default
}
