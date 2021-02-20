package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label/LabelGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[LabelGroupProps] = js.native
  
  @js.native
  trait LabelGroupProps
    extends StrictLabelGroupProps
       with /* key */ StringDictionary[js.Any]
  object LabelGroupProps {
    
    @scala.inline
    def apply(): LabelGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelGroupProps]
    }
  }
  
  @js.native
  trait StrictLabelGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Labels can share shapes. */
    var circular: js.UndefOr[Boolean] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Label group can share colors together. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Label group can share sizes together. */
    var size: js.UndefOr[SemanticSIZES] = js.native
    
    /** Label group can share tag formatting. */
    var tag: js.UndefOr[Boolean] = js.native
  }
  object StrictLabelGroupProps {
    
    @scala.inline
    def apply(): StrictLabelGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictLabelGroupProps]
    }
    
    @scala.inline
    implicit class StrictLabelGroupPropsMutableBuilder[Self <: StrictLabelGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTag(value: Boolean): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  type _To = StatelessComponent[LabelGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `labelGroupMod.foo` */
  override def _to: StatelessComponent[LabelGroupProps] = default
}
