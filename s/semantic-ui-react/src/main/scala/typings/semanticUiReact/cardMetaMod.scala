package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMetaMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/CardMeta", JSImport.Default)
  @js.native
  val default: StatelessComponent[CardMetaProps] = js.native
  
  @js.native
  trait CardMetaProps
    extends StrictCardMetaProps
       with /* key */ StringDictionary[js.Any]
  object CardMetaProps {
    
    @scala.inline
    def apply(): CardMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardMetaProps]
    }
  }
  
  @js.native
  trait StrictCardMetaProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A card meta can adjust its text alignment. */
    var textAlign: js.UndefOr[center | left | right] = js.native
  }
  object StrictCardMetaProps {
    
    @scala.inline
    def apply(): StrictCardMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCardMetaProps]
    }
    
    @scala.inline
    implicit class StrictCardMetaPropsMutableBuilder[Self <: StrictCardMetaProps] (val x: Self) extends AnyVal {
      
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
      def setTextAlign(value: center | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    }
  }
  
  type _To = StatelessComponent[CardMetaProps]
  
  /* This means you don't have to write `default`, but can instead just say `cardMetaMod.foo` */
  override def _to: StatelessComponent[CardMetaProps] = default
}
