package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WEBGLColorBufferFloat extends js.Object {
  
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: GLenum = js.native
  
  val RGBA32F_EXT: GLenum = js.native
  
  val UNSIGNED_NORMALIZED_EXT: GLenum = js.native
}
object WEBGLColorBufferFloat {
  
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: GLenum,
    RGBA32F_EXT: GLenum,
    UNSIGNED_NORMALIZED_EXT: GLenum
  ): WEBGLColorBufferFloat = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT.asInstanceOf[js.Any], RGBA32F_EXT = RGBA32F_EXT.asInstanceOf[js.Any], UNSIGNED_NORMALIZED_EXT = UNSIGNED_NORMALIZED_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLColorBufferFloat]
  }
  
  @scala.inline
  implicit class WEBGLColorBufferFloatOps[Self <: WEBGLColorBufferFloat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT(value: GLenum): Self = this.set("FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGBA32F_EXT(value: GLenum): Self = this.set("RGBA32F_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNSIGNED_NORMALIZED_EXT(value: GLenum): Self = this.set("UNSIGNED_NORMALIZED_EXT", value.asInstanceOf[js.Any])
  }
}
