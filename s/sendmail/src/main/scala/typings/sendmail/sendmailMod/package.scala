package typings.sendmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sendmailMod {
  import typings.std.Error

  type CallbackFn = js.Function2[/* err */ Error, /* domain */ String, Unit]
  type SendMailFn = js.Function2[/* mail */ MailInput, /* callback */ CallbackFn, Unit]
}
