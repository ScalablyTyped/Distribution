package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.componentsMod.BulmaComponentWithoutRenderAs
import typings.reactBulmaComponents.componentsMod.Size
import typings.reactBulmaComponents.reactBulmaComponentsStrings.progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/progress", JSImport.Default)
  @js.native
  val default: BulmaComponentWithoutRenderAs[ProgressProps, progress] = js.native
  
  trait ProgressProps extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object ProgressProps {
    
    inline def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    extension [Self <: ProgressProps](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = BulmaComponentWithoutRenderAs[ProgressProps, progress]
  
  /* This means you don't have to write `default`, but can instead just say `progressMod.foo` */
  override def _to: BulmaComponentWithoutRenderAs[ProgressProps, progress] = default
}
