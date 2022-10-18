package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticSIZES
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsImageImageGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Image/ImageGroup", JSImport.Default)
  @js.native
  val default: FC[ImageGroupProps] = js.native
  
  trait ImageGroupProps
    extends StObject
       with StrictImageGroupProps
       with /* key */ StringDictionary[Any]
  object ImageGroupProps {
    
    inline def apply(): ImageGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageGroupProps]
    }
  }
  
  trait StrictImageGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A group of images can be formatted to have the same size. */
    var size: js.UndefOr[SemanticSIZES] = js.undefined
  }
  object StrictImageGroupProps {
    
    inline def apply(): StrictImageGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictImageGroupProps]
    }
    
    extension [Self <: StrictImageGroupProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ImageGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsImageImageGroupMod.foo` */
  override def _to: FC[ImageGroupProps] = default
}
