package typings.reactBlockies

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-blockies", JSImport.Default)
  @js.native
  val default: FC[IdenticonProps] = js.native
  
  @JSImport("react-blockies", "Identicon")
  @js.native
  val Identicon: FC[IdenticonProps] = js.native
  
  trait IdenticonProps extends StObject {
    
    var bgColor: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var seed: String
    
    var size: js.UndefOr[Double] = js.undefined
    
    var spotColor: js.UndefOr[String] = js.undefined
  }
  object IdenticonProps {
    
    inline def apply(seed: String): IdenticonProps = {
      val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdenticonProps]
    }
    
    extension [Self <: IdenticonProps](x: Self) {
      
      inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpotColor(value: String): Self = StObject.set(x, "spotColor", value.asInstanceOf[js.Any])
      
      inline def setSpotColorUndefined: Self = StObject.set(x, "spotColor", js.undefined)
    }
  }
  
  type _To = FC[IdenticonProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[IdenticonProps] = default
}
