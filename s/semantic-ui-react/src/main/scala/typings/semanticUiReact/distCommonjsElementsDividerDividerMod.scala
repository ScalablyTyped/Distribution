package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsDividerDividerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Divider/Divider", JSImport.Default)
  @js.native
  val default: FC[DividerProps] = js.native
  
  trait DividerProps
    extends StObject
       with StrictDividerProps
       with /* key */ StringDictionary[Any]
  object DividerProps {
    
    inline def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
  }
  
  trait StrictDividerProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Divider can clear the content above it. */
    var clearing: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Divider can be fitted without any space above or below it. */
    var fitted: js.UndefOr[Boolean] = js.undefined
    
    /** Divider can divide content without creating a dividing line. */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /** Divider can segment content horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /** Divider can have its colours inverted. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Divider can provide greater margins to divide sections of content. */
    var section: js.UndefOr[Boolean] = js.undefined
    
    /** Divider can segment content vertically. */
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object StrictDividerProps {
    
    inline def apply(): StrictDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDividerProps]
    }
    
    extension [Self <: StrictDividerProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearing(value: Boolean): Self = StObject.set(x, "clearing", value.asInstanceOf[js.Any])
      
      inline def setClearingUndefined: Self = StObject.set(x, "clearing", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFitted(value: Boolean): Self = StObject.set(x, "fitted", value.asInstanceOf[js.Any])
      
      inline def setFittedUndefined: Self = StObject.set(x, "fitted", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setSection(value: Boolean): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type _To = FC[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsDividerDividerMod.foo` */
  override def _to: FC[DividerProps] = default
}
