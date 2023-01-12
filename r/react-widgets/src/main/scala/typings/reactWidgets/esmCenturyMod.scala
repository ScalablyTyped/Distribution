package typings.reactWidgets

import typings.react.mod.KeyboardEvent
import typings.react.mod.global.JSX.Element
import typings.reactWidgets.esmCalendarViewMod.CalendarViewProps
import typings.reactWidgets.esmLocalizationMod.Localizer
import typings.std.HTMLTableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCenturyMod {
  
  @JSImport("react-widgets/esm/Century", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: CenturyProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CenturyProps
    extends StObject
       with CalendarViewProps {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var localizer: Localizer[Any, Any]
    
    var max: js.Date
    
    var min: js.Date
    
    def onChange(nextDate: js.Date): Unit
    
    var value: js.UndefOr[js.Date | Null] = js.undefined
  }
  object CenturyProps {
    
    inline def apply(
      `aria-labelledby`: String,
      focusedItem: js.Date,
      id: String,
      localizer: Localizer[Any, Any],
      max: js.Date,
      min: js.Date,
      onChange: js.Date => Unit,
      onKeyDown: KeyboardEvent[HTMLTableElement] => Unit
    ): CenturyProps = {
      val __obj = js.Dynamic.literal(focusedItem = focusedItem.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localizer = localizer.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onKeyDown = js.Any.fromFunction1(onKeyDown))
      __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CenturyProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CenturyProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLocalizer(value: Localizer[Any, Any]): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
      
      inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: js.Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
