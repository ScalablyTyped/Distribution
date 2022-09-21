package typings.rcPicker

import typings.react.mod.ReactText
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeUnitColumnMod {
  
  @JSImport("rc-picker/es/panels/TimePanel/TimeUnitColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TimeUnitColumnProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TimeUnitColumnProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* value */ Double, scala.Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var units: js.UndefOr[js.Array[Unit]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object TimeUnitColumnProps {
    
    inline def apply(): TimeUnitColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeUnitColumnProps]
    }
    
    extension [Self <: TimeUnitColumnProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      inline def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      inline def setOnSelect(value: /* value */ Double => scala.Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setUnits(value: js.Array[Unit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setUnitsVarargs(value: Unit*): Self = StObject.set(x, "units", js.Array(value*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Unit extends StObject {
    
    var disabled: Boolean
    
    var label: ReactText
    
    var value: Double
  }
  object Unit {
    
    inline def apply(disabled: Boolean, label: ReactText, value: Double): Unit = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    extension [Self <: Unit](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactText): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
