package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesModalModalContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/ModalContent", JSImport.Default)
  @js.native
  val default: FC[ModalContentProps] = js.native
  
  trait ModalContentProps
    extends StObject
       with StrictModalContentProps
       with /* key */ StringDictionary[Any]
  object ModalContentProps {
    
    inline def apply(): ModalContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalContentProps]
    }
  }
  
  trait StrictModalContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A modal can contain image content. */
    var image: js.UndefOr[Boolean] = js.undefined
    
    /** A modal can use the entire size of the screen. */
    var scrolling: js.UndefOr[Boolean] = js.undefined
  }
  object StrictModalContentProps {
    
    inline def apply(): StrictModalContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictModalContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictModalContentProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setImage(value: Boolean): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    }
  }
  
  type _To = FC[ModalContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesModalModalContentMod.foo` */
  override def _to: FC[ModalContentProps] = default
}
