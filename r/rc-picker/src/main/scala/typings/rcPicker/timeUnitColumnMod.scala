package typings.rcPicker

import typings.react.mod.ReactText
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeUnitColumnMod {
  
  @JSImport("rc-picker/es/panels/TimePanel/TimeUnitColumn", JSImport.Default)
  @js.native
  def default(props: TimeUnitColumnProps): Element = js.native
  
  @js.native
  trait TimeUnitColumnProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* value */ Double, scala.Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var units: js.UndefOr[js.Array[Unit]] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object TimeUnitColumnProps {
    
    @scala.inline
    def apply(): TimeUnitColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeUnitColumnProps]
    }
    
    @scala.inline
    implicit class TimeUnitColumnPropsMutableBuilder[Self <: TimeUnitColumnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* value */ Double => scala.Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setUnits(value: js.Array[Unit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      @scala.inline
      def setUnitsVarargs(value: Unit*): Self = StObject.set(x, "units", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Unit extends StObject {
    
    var disabled: Boolean = js.native
    
    var label: ReactText = js.native
    
    var value: Double = js.native
  }
  object Unit {
    
    @scala.inline
    def apply(disabled: Boolean, label: ReactText, value: Double): Unit = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit class UnitMutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactText): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
