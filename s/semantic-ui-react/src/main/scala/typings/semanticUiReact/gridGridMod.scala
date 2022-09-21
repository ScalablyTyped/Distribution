package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.gridColumnMod.GridColumnProps
import typings.semanticUiReact.gridRowMod.GridRowProps
import typings.semanticUiReact.semanticUiReactStrings.equal
import typings.semanticUiReact.semanticUiReactStrings.horizontally
import typings.semanticUiReact.semanticUiReactStrings.internally
import typings.semanticUiReact.semanticUiReactStrings.vertically
import typings.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridGridMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Grid/Grid", JSImport.Default)
  @js.native
  val default: GridComponent = js.native
  
  @js.native
  trait GridComponent
    extends StObject
       with FunctionComponent[GridProps] {
    
    var Column: FC[GridColumnProps] = js.native
    
    var Row: FC[GridRowProps] = js.native
  }
  
  trait GridProps
    extends StObject
       with StrictGridProps
       with /* key */ StringDictionary[Any]
  object GridProps {
    
    inline def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.semanticUiReact.semanticUiReactStrings.computer
    - typings.semanticUiReact.semanticUiReactStrings.`computer vertically`
    - typings.semanticUiReact.semanticUiReactStrings.mobile
    - typings.semanticUiReact.semanticUiReactStrings.`mobile vertically`
    - typings.semanticUiReact.semanticUiReactStrings.tablet
    - typings.semanticUiReact.semanticUiReactStrings.`tablet vertically`
  */
  type GridReversedProp = _GridReversedProp | String
  
  trait StrictGridProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A grid can have rows divided into cells. */
    var celled: js.UndefOr[Boolean | internally] = js.undefined
    
    /** A grid can have its columns centered. */
    var centered: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Represents column count per row in Grid. */
    var columns: js.UndefOr[SemanticWIDTHS | equal] = js.undefined
    
    /** A grid can be combined with a container to use available layout and alignment. */
    var container: js.UndefOr[Boolean] = js.undefined
    
    /** A grid can have dividers between its columns. */
    var divided: js.UndefOr[Boolean | vertically] = js.undefined
    
    /** A grid can double its column width on tablet and mobile sizes. */
    var doubling: js.UndefOr[Boolean] = js.undefined
    
    /** A grid's colors can be inverted. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** A grid can preserve its vertical and horizontal gutters on first and last columns. */
    var padded: js.UndefOr[Boolean | horizontally | vertically] = js.undefined
    
    /** A grid can increase its gutters to allow for more negative space. */
    var relaxed: js.UndefOr[Boolean | very] = js.undefined
    
    /** A grid can specify that its columns should reverse order at different device sizes. */
    var reversed: js.UndefOr[GridReversedProp] = js.undefined
    
    /** A grid can have its columns stack on-top of each other after reaching mobile breakpoints. */
    var stackable: js.UndefOr[Boolean] = js.undefined
    
    /** A grid can stretch its contents to take up the entire grid height. */
    var stretched: js.UndefOr[Boolean] = js.undefined
    
    /** A grid can specify its text alignment. */
    var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.undefined
    
    /** A grid can specify its vertical alignment to have all its columns vertically centered. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  }
  object StrictGridProps {
    
    inline def apply(): StrictGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictGridProps]
    }
    
    extension [Self <: StrictGridProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCelled(value: Boolean | internally): Self = StObject.set(x, "celled", value.asInstanceOf[js.Any])
      
      inline def setCelledUndefined: Self = StObject.set(x, "celled", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumns(value: SemanticWIDTHS | equal): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setContainer(value: Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDivided(value: Boolean | vertically): Self = StObject.set(x, "divided", value.asInstanceOf[js.Any])
      
      inline def setDividedUndefined: Self = StObject.set(x, "divided", js.undefined)
      
      inline def setDoubling(value: Boolean): Self = StObject.set(x, "doubling", value.asInstanceOf[js.Any])
      
      inline def setDoublingUndefined: Self = StObject.set(x, "doubling", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setPadded(value: Boolean | horizontally | vertically): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      inline def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
      
      inline def setRelaxed(value: Boolean | very): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
      
      inline def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
      
      inline def setReversed(value: GridReversedProp): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setStackable(value: Boolean): Self = StObject.set(x, "stackable", value.asInstanceOf[js.Any])
      
      inline def setStackableUndefined: Self = StObject.set(x, "stackable", js.undefined)
      
      inline def setStretched(value: Boolean): Self = StObject.set(x, "stretched", value.asInstanceOf[js.Any])
      
      inline def setStretchedUndefined: Self = StObject.set(x, "stretched", js.undefined)
      
      inline def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  trait _GridReversedProp extends StObject
  
  type _To = GridComponent
  
  /* This means you don't have to write `default`, but can instead just say `gridGridMod.foo` */
  override def _to: GridComponent = default
}
