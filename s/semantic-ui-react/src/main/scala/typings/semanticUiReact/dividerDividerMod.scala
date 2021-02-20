package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerDividerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Divider/Divider", JSImport.Default)
  @js.native
  val default: StatelessComponent[DividerProps] = js.native
  
  @js.native
  trait DividerProps
    extends StrictDividerProps
       with /* key */ StringDictionary[js.Any]
  object DividerProps {
    
    @scala.inline
    def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
  }
  
  @js.native
  trait StrictDividerProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Divider can clear the content above it. */
    var clearing: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Divider can be fitted without any space above or below it. */
    var fitted: js.UndefOr[Boolean] = js.native
    
    /** Divider can divide content without creating a dividing line. */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /** Divider can segment content horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /** Divider can have its colours inverted. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** Divider can provide greater margins to divide sections of content. */
    var section: js.UndefOr[Boolean] = js.native
    
    /** Divider can segment content vertically. */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object StrictDividerProps {
    
    @scala.inline
    def apply(): StrictDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDividerProps]
    }
    
    @scala.inline
    implicit class StrictDividerPropsMutableBuilder[Self <: StrictDividerProps] (val x: Self) extends AnyVal {
      
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
      def setClearing(value: Boolean): Self = StObject.set(x, "clearing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearingUndefined: Self = StObject.set(x, "clearing", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFitted(value: Boolean): Self = StObject.set(x, "fitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFittedUndefined: Self = StObject.set(x, "fitted", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setSection(value: Boolean): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type _To = StatelessComponent[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `dividerDividerMod.foo` */
  override def _to: StatelessComponent[DividerProps] = default
}
