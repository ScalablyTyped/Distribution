package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.centered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderLoaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Loader/Loader", JSImport.Default)
  @js.native
  val default: StatelessComponent[LoaderProps] = js.native
  
  trait LoaderProps
    extends StObject
       with StrictLoaderProps
       with /* key */ StringDictionary[js.Any]
  object LoaderProps {
    
    @scala.inline
    def apply(): LoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderProps]
    }
  }
  
  trait StrictLoaderProps extends StObject {
    
    /** A loader can be active or visible. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A loader can be disabled or hidden. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** A loader can show it's unsure of how long a task will take. */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** Loaders can appear inline with content. */
    var `inline`: js.UndefOr[Boolean | centered] = js.undefined
    
    /** Loaders can have their colors inverted. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Loaders can have different sizes. */
    var size: js.UndefOr[SemanticSIZES] = js.undefined
  }
  object StrictLoaderProps {
    
    @scala.inline
    def apply(): StrictLoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictLoaderProps]
    }
    
    @scala.inline
    implicit class StrictLoaderPropsMutableBuilder[Self <: StrictLoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
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
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean | centered): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = StatelessComponent[LoaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `loaderLoaderMod.foo` */
  override def _to: StatelessComponent[LoaderProps] = default
}
