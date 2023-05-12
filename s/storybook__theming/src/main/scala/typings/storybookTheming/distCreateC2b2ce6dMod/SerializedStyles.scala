package typings.storybookTheming.distCreateC2b2ce6dMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializedStyles
  extends StObject
     with _InterpolationPrimitive {
  
  var map: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var next: js.UndefOr[SerializedStyles] = js.undefined
  
  var styles: String
}
object SerializedStyles {
  
  inline def apply(name: String, styles: String): SerializedStyles = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializedStyles] (val x: Self) extends AnyVal {
    
    inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: SerializedStyles): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
