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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridColumnMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Grid/GridColumn", JSImport.Default)
  @js.native
  val default: StatelessComponent[GridColumnProps] = js.native
  
  @js.native
  trait GridColumnProps
    extends StrictGridColumnProps
       with /* key */ StringDictionary[js.Any]
  object GridColumnProps {
    
    @scala.inline
    def apply(): GridColumnProps = {
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
  
  @js.native
  trait StrictGridColumnProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A grid column can be colored. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** A column can specify a width for a computer. */
    var computer: js.UndefOr[SemanticWIDTHS] = js.native
    
    /** A column can sit flush against the left or right edge of a row. */
    var floated: js.UndefOr[SemanticFLOATS] = js.native
    
    /** A column can specify a width for a large screen device. */
    var largeScreen: js.UndefOr[SemanticWIDTHS] = js.native
    
    /** A column can specify a width for a mobile device. */
    var mobile: js.UndefOr[SemanticWIDTHS] = js.native
    
    /** A column can appear only for a specific device, or screen sizes. */
    var only: js.UndefOr[GridOnlyProp] = js.native
    
    /** An can stretch its contents to take up the entire grid or row height. */
    var stretched: js.UndefOr[Boolean] = js.native
    
    /** A column can specify a width for a tablet device. */
    var tablet: js.UndefOr[SemanticWIDTHS] = js.native
    
    /** A row can specify its text alignment. */
    var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
    
    /** A column can specify its vertical alignment to have all its columns vertically centered. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
    
    /** A column can specify a width for a wide screen device. */
    var widescreen: js.UndefOr[SemanticWIDTHS] = js.native
    
    /** Represents width of column. */
    var width: js.UndefOr[SemanticWIDTHS] = js.native
  }
  object StrictGridColumnProps {
    
    @scala.inline
    def apply(): StrictGridColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictGridColumnProps]
    }
    
    @scala.inline
    implicit class StrictGridColumnPropsMutableBuilder[Self <: StrictGridColumnProps] (val x: Self) extends AnyVal {
      
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
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setComputer(value: SemanticWIDTHS): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputerUndefined: Self = StObject.set(x, "computer", js.undefined)
      
      @scala.inline
      def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      @scala.inline
      def setLargeScreen(value: SemanticWIDTHS): Self = StObject.set(x, "largeScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeScreenUndefined: Self = StObject.set(x, "largeScreen", js.undefined)
      
      @scala.inline
      def setMobile(value: SemanticWIDTHS): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      @scala.inline
      def setOnly(value: GridOnlyProp): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setStretched(value: Boolean): Self = StObject.set(x, "stretched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchedUndefined: Self = StObject.set(x, "stretched", js.undefined)
      
      @scala.inline
      def setTablet(value: SemanticWIDTHS): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
      
      @scala.inline
      def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setWidescreen(value: SemanticWIDTHS): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
      
      @scala.inline
      def setWidth(value: SemanticWIDTHS): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait _GridOnlyProp extends StObject
  
  type _To = StatelessComponent[GridColumnProps]
  
  /* This means you don't have to write `default`, but can instead just say `gridColumnMod.foo` */
  override def _to: StatelessComponent[GridColumnProps] = default
}
