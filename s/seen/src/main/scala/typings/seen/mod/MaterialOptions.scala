package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterialOptions extends js.Object {
  
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
  implicit class MaterialOptionsOps[Self <: MaterialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setMetallic(value: Boolean): Self = this.set("metallic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetallic: Self = this.set("metallic", js.undefined)
    
    @scala.inline
    def setShader(value: Shader): Self = this.set("shader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShader: Self = this.set("shader", js.undefined)
    
    @scala.inline
    def setSpecularColor(value: Color): Self = this.set("specularColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularColor: Self = this.set("specularColor", js.undefined)
    
    @scala.inline
    def setSpecularExponent(value: Double): Self = this.set("specularExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularExponent: Self = this.set("specularExponent", js.undefined)
  }
}
