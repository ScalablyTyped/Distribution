package typings
package sendmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sendmailMod {
  type CallbackFn = js.Function2[/* err */ stdLib.Error, /* domain */ java.lang.String, scala.Unit]
  type SendMailFn = js.Function2[/* mail */ MailInput, /* callback */ CallbackFn, scala.Unit]
}
