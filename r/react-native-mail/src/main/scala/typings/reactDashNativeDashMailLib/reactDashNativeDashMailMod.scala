package typings
package reactDashNativeDashMailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-mail", JSImport.Namespace)
@js.native
object reactDashNativeDashMailMod extends js.Object {
  @JSName("Mailer")
  @js.native
  object MailerNs extends js.Object {
    def mail(
      options: reactDashNativeDashMailLib.Anon_Attachment,
      callback: js.Function2[/* error */ java.lang.String, /* event */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
  }
  
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    def mail(
      options: reactDashNativeDashMailLib.Anon_Attachment,
      callback: js.Function2[/* error */ java.lang.String, /* event */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
  }
  
}

