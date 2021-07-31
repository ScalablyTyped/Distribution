package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemDescriptionMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemDescription", JSImport.Default)
  @js.native
  val default: StatelessComponent[ItemDescriptionProps] = js.native
  
  trait ItemDescriptionProps
    extends StObject
       with StrictItemDescriptionProps
       with /* key */ StringDictionary[js.Any]
  object ItemDescriptionProps {
    
    @scala.inline
    def apply(): ItemDescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemDescriptionProps]
    }
  }
  
  trait StrictItemDescriptionProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictItemDescriptionProps {
    
    @scala.inline
    def apply(): StrictItemDescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictItemDescriptionProps]
    }
    
    @scala.inline
    implicit class StrictItemDescriptionPropsMutableBuilder[Self <: StrictItemDescriptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ItemDescriptionProps]
  
  /* This means you don't have to write `default`, but can instead just say `itemDescriptionMod.foo` */
  override def _to: StatelessComponent[ItemDescriptionProps] = default
}
