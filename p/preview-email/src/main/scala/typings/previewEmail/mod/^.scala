package typings.previewEmail.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preview-email", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Automatically opens your browser to preview Node.js email messages sent with Nodemailer. Made for Lad!
    *
    * The function `previewEmail` returns a `Promise` which resolves with a URL.
    * We automatically open the browser to this URL unless you specify options.open as false
    */
  def apply(message: typings.nodemailer.mailerMod.Options): js.Promise[String] = js.native
  def apply(message: typings.nodemailer.mailerMod.Options, options: Options): js.Promise[String] = js.native
}

