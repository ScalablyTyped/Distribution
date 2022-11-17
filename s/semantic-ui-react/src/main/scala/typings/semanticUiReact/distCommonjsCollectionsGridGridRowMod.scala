package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsCollectionsGridGridColumnMod.GridOnlyProp
import typings.semanticUiReact.distCommonjsCollectionsGridGridMod.GridReversedProp
import typings.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsGridGridRowMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Grid/GridRow", JSImport.Default)
  @js.native
  val default: FC[GridRowProps] = js.native
  
  trait GridRowProps
    extends StObject
       with StrictGridRowProps
       with /* key */ StringDictionary[Any]
  object GridRowProps {
    
    inline def apply(): GridRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridRowProps]
    }
  }
  
  trait StrictGridRowProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A row can have its columns centered. */
    var centered: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A grid row can be colored. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Represents column count per line in Row. */
    var columns: js.UndefOr[SemanticWIDTHS | "equal"] = js.undefined
    
    /** A row can have dividers between its columns. */
    var divided: js.UndefOr[Boolean] = js.undefined
    
    /** A row can appear only for a specific device, or screen sizes. */
    var only: js.UndefOr[GridOnlyProp] = js.undefined
    
    /** A row can specify that its columns should reverse order at different device sizes. */
    var reversed: js.UndefOr[GridReversedProp] = js.undefined
    
    /** A row can stretch its contents to take up the entire column height. */
    var stretched: js.UndefOr[Boolean] = js.undefined
    
    /** A row can specify its text alignment. */
    var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.undefined
    
    /** A row can specify its vertical alignment to have all its columns vertically centered. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  }
  object StrictGridRowProps {
    
    inline def apply(): StrictGridRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictGridRowProps]
    }
    
    extension [Self <: StrictGridRowProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumns(value: SemanticWIDTHS | "equal"): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setDivided(value: Boolean): Self = StObject.set(x, "divided", value.asInstanceOf[js.Any])
      
      inline def setDividedUndefined: Self = StObject.set(x, "divided", js.undefined)
      
      inline def setOnly(value: GridOnlyProp): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setReversed(value: GridReversedProp): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setStretched(value: Boolean): Self = StObject.set(x, "stretched", value.asInstanceOf[js.Any])
      
      inline def setStretchedUndefined: Self = StObject.set(x, "stretched", js.undefined)
      
      inline def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = FC[GridRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsGridGridRowMod.foo` */
  override def _to: FC[GridRowProps] = default
}
