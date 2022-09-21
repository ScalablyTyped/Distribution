package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticLabelMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Statistic/StatisticLabel", JSImport.Default)
  @js.native
  val default: FC[StatisticLabelProps] = js.native
  
  trait StatisticLabelProps
    extends StObject
       with StrictStatisticLabelProps
       with /* key */ StringDictionary[Any]
  object StatisticLabelProps {
    
    inline def apply(): StatisticLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticLabelProps]
    }
  }
  
  trait StrictStatisticLabelProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictStatisticLabelProps {
    
    inline def apply(): StrictStatisticLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStatisticLabelProps]
    }
    
    extension [Self <: StrictStatisticLabelProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = FC[StatisticLabelProps]
  
  /* This means you don't have to write `default`, but can instead just say `statisticLabelMod.foo` */
  override def _to: FC[StatisticLabelProps] = default
}
