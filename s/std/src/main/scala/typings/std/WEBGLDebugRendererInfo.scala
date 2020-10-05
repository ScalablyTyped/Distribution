package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The WEBGL_debug_renderer_info extension is part of the WebGL API and exposes two constants with information about the graphics driver for debugging purposes. */
@js.native
trait WEBGLDebugRendererInfo extends js.Object {
  val UNMASKED_RENDERER_WEBGL: GLenum = js.native
  val UNMASKED_VENDOR_WEBGL: GLenum = js.native
}

object WEBGLDebugRendererInfo {
  @scala.inline
  def apply(UNMASKED_RENDERER_WEBGL: GLenum, UNMASKED_VENDOR_WEBGL: GLenum): WEBGLDebugRendererInfo = {
    val __obj = js.Dynamic.literal(UNMASKED_RENDERER_WEBGL = UNMASKED_RENDERER_WEBGL.asInstanceOf[js.Any], UNMASKED_VENDOR_WEBGL = UNMASKED_VENDOR_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLDebugRendererInfo]
  }
  @scala.inline
  implicit class WEBGLDebugRendererInfoOps[Self <: WEBGLDebugRendererInfo] (val x: Self) extends AnyVal {
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
    def setUNMASKED_RENDERER_WEBGL(value: GLenum): Self = this.set("UNMASKED_RENDERER_WEBGL", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNMASKED_VENDOR_WEBGL(value: GLenum): Self = this.set("UNMASKED_VENDOR_WEBGL", value.asInstanceOf[js.Any])
  }
  
}

