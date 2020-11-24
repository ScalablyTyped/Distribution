package typings.sendmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallbackFn = js.Function2[/* err */ typings.std.Error, /* domain */ java.lang.String, scala.Unit]
  
  type SendMailFn = js.Function2[
    /* mail */ typings.sendmail.mod.MailInput, 
    /* callback */ typings.sendmail.mod.CallbackFn, 
    scala.Unit
  ]
}
