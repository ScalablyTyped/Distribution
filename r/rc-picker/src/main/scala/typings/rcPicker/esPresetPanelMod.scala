package typings.rcPicker

import typings.rcPicker.esInterfaceMod.PresetDate
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPresetPanelMod {
  
  @JSImport("rc-picker/es/PresetPanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](props: PresetPanelProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PresetPanelProps[T] extends StObject {
    
    def onClick(value: T): Unit
    
    var onHover: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
    
    var prefixCls: String
    
    var presets: js.Array[PresetDate[T]]
  }
  object PresetPanelProps {
    
    inline def apply[T](onClick: T => Unit, prefixCls: String, presets: js.Array[PresetDate[T]]): PresetPanelProps[T] = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any], presets = presets.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresetPanelProps[T]]
    }
    
    extension [Self <: PresetPanelProps[?], T](x: Self & PresetPanelProps[T]) {
      
      inline def setOnClick(value: T => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnHover(value: /* value */ T => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPresets(value: js.Array[PresetDate[T]]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsVarargs(value: PresetDate[T]*): Self = StObject.set(x, "presets", js.Array(value*))
    }
  }
}
