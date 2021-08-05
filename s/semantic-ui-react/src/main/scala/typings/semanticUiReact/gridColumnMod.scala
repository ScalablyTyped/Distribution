package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridColumnMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Grid/GridColumn", JSImport.Default)
  @js.native
  val default: StatelessComponent[GridColumnProps] = js.native
  
  trait GridColumnProps
    extends StObject
       with StrictGridColumnProps
       with /* key */ StringDictionary[js.Any]
  object GridColumnProps {
    
    inline def apply(): GridColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridColumnProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.semanticUiReact.semanticUiReactStrings.computer
    - typings.semanticUiReact.semanticUiReactStrings.largeScreen
    - typings.semanticUiReact.semanticUiReactStrings.mobile
    - typings.semanticUiReact.semanticUiReactStrings.`tablet mobile`
    - typings.semanticUiReact.semanticUiReactStrings.tablet
    - typings.semanticUiReact.semanticUiReactStrings.widescreen
  */
  type GridOnlyProp = _GridOnlyProp | String
  
  trait StrictGridColumnProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A grid column can be colored. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** A column can specify a width for a computer. */
    var computer: js.UndefOr[SemanticWIDTHS] = js.undefined
    
    /** A column can sit flush against the left or right edge of a row. */
    var floated: js.UndefOr[SemanticFLOATS] = js.undefined
    
    /** A column can specify a width for a large screen device. */
    var largeScreen: js.UndefOr[SemanticWIDTHS] = js.undefined
    
    /** A column can specify a width for a mobile device. */
    var mobile: js.UndefOr[SemanticWIDTHS] = js.undefined
    
    /** A column can appear only for a specific device, or screen sizes. */
    var only: js.UndefOr[GridOnlyProp] = js.undefined
    
    /** An can stretch its contents to take up the entire grid or row height. */
    var stretched: js.UndefOr[Boolean] = js.undefined
    
    /** A column can specify a width for a tablet device. */
    var tablet: js.UndefOr[SemanticWIDTHS] = js.undefined
    
    /** A row can specify its text alignment. */
    var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.undefined
    
    /** A column can specify its vertical alignment to have all its columns vertically centered. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
    
    /** A column can specify a width for a wide screen device. */
    var widescreen: js.UndefOr[SemanticWIDTHS] = js.undefined
    
    /** Represents width of column. */
    var width: js.UndefOr[SemanticWIDTHS] = js.undefined
  }
  object StrictGridColumnProps {
    
    inline def apply(): StrictGridColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictGridColumnProps]
    }
    
    extension [Self <: StrictGridColumnProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setComputer(value: SemanticWIDTHS): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
      
      inline def setComputerUndefined: Self = StObject.set(x, "computer", js.undefined)
      
      inline def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      inline def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      inline def setLargeScreen(value: SemanticWIDTHS): Self = StObject.set(x, "largeScreen", value.asInstanceOf[js.Any])
      
      inline def setLargeScreenUndefined: Self = StObject.set(x, "largeScreen", js.undefined)
      
      inline def setMobile(value: SemanticWIDTHS): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      inline def setOnly(value: GridOnlyProp): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setStretched(value: Boolean): Self = StObject.set(x, "stretched", value.asInstanceOf[js.Any])
      
      inline def setStretchedUndefined: Self = StObject.set(x, "stretched", js.undefined)
      
      inline def setTablet(value: SemanticWIDTHS): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
      
      inline def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWidescreen(value: SemanticWIDTHS): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
      
      inline def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
      
      inline def setWidth(value: SemanticWIDTHS): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait _GridOnlyProp extends StObject
  
  type _To = StatelessComponent[GridColumnProps]
  
  /* This means you don't have to write `default`, but can instead just say `gridColumnMod.foo` */
  override def _to: StatelessComponent[GridColumnProps] = default
}
