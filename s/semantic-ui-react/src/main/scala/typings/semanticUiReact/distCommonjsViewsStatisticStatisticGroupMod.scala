package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.semanticUiReact.distCommonjsViewsStatisticStatisticMod.StatisticProps
import typings.semanticUiReact.distCommonjsViewsStatisticStatisticMod.StatisticSizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsStatisticStatisticGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Statistic/StatisticGroup", JSImport.Default)
  @js.native
  val default: FC[StatisticGroupProps] = js.native
  
  trait StatisticGroupProps
    extends StObject
       with StrictStatisticGroupProps
       with /* key */ StringDictionary[Any]
  object StatisticGroupProps {
    
    inline def apply(): StatisticGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticGroupProps]
    }
  }
  
  trait StrictStatisticGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A statistic group can be formatted to be different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A statistic group can present its measurement horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /** A statistic group can present its measurement horizontally. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Array of props for Statistic. */
    var items: js.UndefOr[SemanticShorthandCollection[StatisticProps]] = js.undefined
    
    /** A statistic group can vary in size. */
    var size: js.UndefOr[StatisticSizeProp] = js.undefined
    
    /** A statistic group can have its items divided evenly. */
    var widths: js.UndefOr[SemanticWIDTHS] = js.undefined
  }
  object StrictStatisticGroupProps {
    
    inline def apply(): StrictStatisticGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStatisticGroupProps]
    }
    
    extension [Self <: StrictStatisticGroupProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setItems(value: SemanticShorthandCollection[StatisticProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SemanticShorthandItem[StatisticProps]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSize(value: StatisticSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWidths(value: SemanticWIDTHS): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
  
  type _To = FC[StatisticGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsStatisticStatisticGroupMod.foo` */
  override def _to: FC[StatisticGroupProps] = default
}
