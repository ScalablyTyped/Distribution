package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialOptions extends StObject {
  
  var color: js.UndefOr[Color] = js.undefined
  
  var metallic: js.UndefOr[Boolean] = js.undefined
  
  var shader: js.UndefOr[Shader] = js.undefined
  
  var specularColor: js.UndefOr[Color] = js.undefined
  
  var specularExponent: js.UndefOr[Double] = js.undefined
}
object MaterialOptions {
  
  inline def apply(): MaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaterialOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setMetallic(value: Boolean): Self = StObject.set(x, "metallic", value.asInstanceOf[js.Any])
    
    inline def setMetallicUndefined: Self = StObject.set(x, "metallic", js.undefined)
    
    inline def setShader(value: Shader): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    inline def setShaderUndefined: Self = StObject.set(x, "shader", js.undefined)
    
    inline def setSpecularColor(value: Color): Self = StObject.set(x, "specularColor", value.asInstanceOf[js.Any])
    
    inline def setSpecularColorUndefined: Self = StObject.set(x, "specularColor", js.undefined)
    
    inline def setSpecularExponent(value: Double): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
    
    inline def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
  }
}
