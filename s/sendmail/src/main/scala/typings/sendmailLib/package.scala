package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sendmailLib {
  type CallbackFn = js.Function2[/* err */ stdLib.Error, /* domain */ java.lang.String, scala.Unit]
  type SendMailFn = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify sendMailFactory.MailInput */ /* mail */ js.Any, 
    /* callback */ CallbackFn, 
    scala.Unit
  ]
}
