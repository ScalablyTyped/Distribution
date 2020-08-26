package typings.reactSignatureCanvas

import typings.signaturePad.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(dataUrl: String): Unit = js.native
    def apply(dataUrl: String, options: Callback): Unit = js.native
  }
  
  @js.native
  trait FnCallTypeEncoderOptions extends js.Object {
    def apply(): String = js.native
    def apply(`type`: js.UndefOr[scala.Nothing], encoderOptions: js.Any): String = js.native
    def apply(`type`: String): String = js.native
    def apply(`type`: String, encoderOptions: js.Any): String = js.native
  }
  
}

