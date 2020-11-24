package typings.storybookTheming.typesMod

import typings.storybookTheming.anon.Base
import typings.storybookTheming.anon.Black
import typings.storybookTheming.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typography extends js.Object {
  
  var fonts: Base = js.native
  
  var size: Code = js.native
  
  var weight: Black = js.native
}
object Typography {
  
  @scala.inline
  def apply(fonts: Base, size: Code, weight: Black): Typography = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  
  @scala.inline
  implicit class TypographyOps[Self <: Typography] (val x: Self) extends AnyVal {
    
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
    def setFonts(value: Base): Self = this.set("fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Code): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Black): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
}
