package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterialOptions extends StObject {
  
  var color: js.UndefOr[Color] = js.native
  
  var metallic: js.UndefOr[Boolean] = js.native
  
  var shader: js.UndefOr[Shader] = js.native
  
  var specularColor: js.UndefOr[Color] = js.native
  
  var specularExponent: js.UndefOr[Double] = js.native
}
object MaterialOptions {
  
  @scala.inline
  def apply(): MaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialOptions]
  }
  
  @scala.inline
  implicit class MaterialOptionsMutableBuilder[Self <: MaterialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setMetallic(value: Boolean): Self = StObject.set(x, "metallic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetallicUndefined: Self = StObject.set(x, "metallic", js.undefined)
    
    @scala.inline
    def setShader(value: Shader): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShaderUndefined: Self = StObject.set(x, "shader", js.undefined)
    
    @scala.inline
    def setSpecularColor(value: Color): Self = StObject.set(x, "specularColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularColorUndefined: Self = StObject.set(x, "specularColor", js.undefined)
    
    @scala.inline
    def setSpecularExponent(value: Double): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
  }
}
