package typings.std

import typings.std.stdInts.`0x9630`
import typings.std.stdInts.`0x9631`
import typings.std.stdInts.`0x9632`
import typings.std.stdInts.`0x9633`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OVR_multiview2) */
@js.native
trait OVRMultiview2 extends StObject {
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: `0x9632` = js.native
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: `0x9630` = js.native
  
  /* standard dom */
  val FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR: `0x9633` = js.native
  
  /* standard dom */
  val MAX_VIEWS_OVR: `0x9631` = js.native
  
  def framebufferTextureMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: Null,
    level: GLint,
    baseViewIndex: GLint,
    numViews: GLsizei
  ): Unit = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OVR_multiview2/framebufferTextureMultiviewOVR) */
  /* standard dom */
  def framebufferTextureMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: WebGLTexture,
    level: GLint,
    baseViewIndex: GLint,
    numViews: GLsizei
  ): Unit = js.native
}
