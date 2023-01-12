package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PulsatorProps extends StObject {
  
  val color: js.UndefOr[String] = js.undefined
  
  val inactive: js.UndefOr[Boolean] = js.undefined
  
  val size: js.UndefOr[PulsatorSize] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val transparent: js.UndefOr[Boolean] = js.undefined
}
object PulsatorProps {
  
  inline def apply(): PulsatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PulsatorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PulsatorProps] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setSize(value: PulsatorSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
