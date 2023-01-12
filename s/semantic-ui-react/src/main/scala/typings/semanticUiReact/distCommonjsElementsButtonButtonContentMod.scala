package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsButtonButtonContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button/ButtonContent", JSImport.Default)
  @js.native
  val default: FC[ButtonContentProps] = js.native
  
  trait ButtonContentProps
    extends StObject
       with StrictButtonContentProps
       with /* key */ StringDictionary[Any]
  object ButtonContentProps {
    
    inline def apply(): ButtonContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonContentProps]
    }
  }
  
  trait StrictButtonContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Initially hidden, visible on hover. */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /** Initially visible, hidden on hover. */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object StrictButtonContentProps {
    
    inline def apply(): StrictButtonContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictButtonContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictButtonContentProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = FC[ButtonContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsButtonButtonContentMod.foo` */
  override def _to: FC[ButtonContentProps] = default
}
