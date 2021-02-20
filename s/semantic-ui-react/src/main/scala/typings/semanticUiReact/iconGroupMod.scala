package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.iconIconMod.IconSizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Icon/IconGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[IconGroupProps] = js.native
  
  @js.native
  trait IconGroupProps
    extends StrictIconGroupProps
       with /* key */ StringDictionary[js.Any]
  object IconGroupProps {
    
    @scala.inline
    def apply(): IconGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconGroupProps]
    }
  }
  
  @js.native
  trait StrictIconGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Size of the icon group. */
    var size: js.UndefOr[IconSizeProp] = js.native
  }
  object StrictIconGroupProps {
    
    @scala.inline
    def apply(): StrictIconGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictIconGroupProps]
    }
    
    @scala.inline
    implicit class StrictIconGroupPropsMutableBuilder[Self <: StrictIconGroupProps] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setSize(value: IconSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = StatelessComponent[IconGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `iconGroupMod.foo` */
  override def _to: StatelessComponent[IconGroupProps] = default
}
