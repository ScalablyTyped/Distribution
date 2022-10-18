package typings.rcAlign

import org.scalablytyped.runtime.Shortcut
import typings.rcAlign.esInterfaceMod.AlignResult
import typings.rcAlign.esInterfaceMod.AlignType
import typings.rcAlign.esInterfaceMod.TargetType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAlignMod extends Shortcut {
  
  @JSImport("rc-align/es/Align", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]] = js.native
  
  trait AlignProps extends StObject {
    
    var align: AlignType
    
    var children: ReactElement
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var monitorBufferTime: js.UndefOr[Double] = js.undefined
    
    var monitorWindowResize: js.UndefOr[Boolean] = js.undefined
    
    var onAlign: js.UndefOr[OnAlign] = js.undefined
    
    var target: TargetType
  }
  object AlignProps {
    
    inline def apply(align: AlignType, children: ReactElement, target: TargetType): AlignProps = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignProps]
    }
    
    extension [Self <: AlignProps](x: Self) {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMonitorBufferTime(value: Double): Self = StObject.set(x, "monitorBufferTime", value.asInstanceOf[js.Any])
      
      inline def setMonitorBufferTimeUndefined: Self = StObject.set(x, "monitorBufferTime", js.undefined)
      
      inline def setMonitorWindowResize(value: Boolean): Self = StObject.set(x, "monitorWindowResize", value.asInstanceOf[js.Any])
      
      inline def setMonitorWindowResizeUndefined: Self = StObject.set(x, "monitorWindowResize", js.undefined)
      
      inline def setOnAlign(value: (/* source */ HTMLElement, /* result */ AlignResult) => Unit): Self = StObject.set(x, "onAlign", js.Any.fromFunction2(value))
      
      inline def setOnAlignUndefined: Self = StObject.set(x, "onAlign", js.undefined)
      
      inline def setTarget(value: TargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction0(value: () => HTMLElement): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
    }
  }
  
  type OnAlign = js.Function2[/* source */ HTMLElement, /* result */ AlignResult, Unit]
  
  trait RefAlign extends StObject {
    
    def forceAlign(): Unit
  }
  object RefAlign {
    
    inline def apply(forceAlign: () => Unit): RefAlign = {
      val __obj = js.Dynamic.literal(forceAlign = js.Any.fromFunction0(forceAlign))
      __obj.asInstanceOf[RefAlign]
    }
    
    extension [Self <: RefAlign](x: Self) {
      
      inline def setForceAlign(value: () => Unit): Self = StObject.set(x, "forceAlign", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]]
  
  /* This means you don't have to write `default`, but can instead just say `esAlignMod.foo` */
  override def _to: ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]] = default
}
