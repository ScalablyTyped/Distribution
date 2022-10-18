package typings.reactIntl

import org.scalablytyped.runtime.Shortcut
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormatSingularUnit
import typings.formatjsIntl.srcTypesMod.FormatRelativeTimeOptions
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsRelativeMod extends Shortcut {
  
  @JSImport("react-intl/src/components/relative", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props
    extends StObject
       with FormatRelativeTimeOptions {
    
    var children: js.UndefOr[js.Function1[/* value */ String, ReactElement | Null]] = js.undefined
    
    var unit: js.UndefOr[RelativeTimeFormatSingularUnit] = js.undefined
    
    var updateIntervalInSeconds: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: /* value */ String => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setUnit(value: RelativeTimeFormatSingularUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setUpdateIntervalInSeconds(value: Double): Self = StObject.set(x, "updateIntervalInSeconds", value.asInstanceOf[js.Any])
      
      inline def setUpdateIntervalInSecondsUndefined: Self = StObject.set(x, "updateIntervalInSeconds", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsRelativeMod.foo` */
  override def _to: FC[Props] = default
}
