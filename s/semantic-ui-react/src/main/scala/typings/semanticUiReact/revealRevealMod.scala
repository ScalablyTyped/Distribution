package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.revealContentMod.RevealContentProps
import typings.semanticUiReact.semanticUiReactStrings.`move down`
import typings.semanticUiReact.semanticUiReactStrings.`move right`
import typings.semanticUiReact.semanticUiReactStrings.`move up`
import typings.semanticUiReact.semanticUiReactStrings.`rotate left`
import typings.semanticUiReact.semanticUiReactStrings.`small fade`
import typings.semanticUiReact.semanticUiReactStrings.fade
import typings.semanticUiReact.semanticUiReactStrings.move
import typings.semanticUiReact.semanticUiReactStrings.rotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revealRevealMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Reveal/Reveal", JSImport.Default)
  @js.native
  val default: RevealComponent = js.native
  
  @js.native
  trait RevealComponent extends FunctionComponent[RevealProps] {
    
    var Content: StatelessComponent[RevealContentProps] = js.native
  }
  
  @js.native
  trait RevealProps
    extends StrictRevealProps
       with /* key */ StringDictionary[js.Any]
  object RevealProps {
    
    @scala.inline
    def apply(): RevealProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevealProps]
    }
  }
  
  @js.native
  trait StrictRevealProps extends StObject {
    
    /** An active reveal displays its hidden content. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** An animation name that will be applied to Reveal. */
    var animated: js.UndefOr[
        fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`)
      ] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A disabled reveal will not animate when hovered. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** An element can show its content without delay. */
    var instant: js.UndefOr[Boolean] = js.native
  }
  object StrictRevealProps {
    
    @scala.inline
    def apply(): StrictRevealProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRevealProps]
    }
    
    @scala.inline
    implicit class StrictRevealPropsMutableBuilder[Self <: StrictRevealProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAnimated(
        value: fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`)
      ): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
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
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInstant(value: Boolean): Self = StObject.set(x, "instant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstantUndefined: Self = StObject.set(x, "instant", js.undefined)
    }
  }
  
  type _To = RevealComponent
  
  /* This means you don't have to write `default`, but can instead just say `revealRevealMod.foo` */
  override def _to: RevealComponent = default
}
