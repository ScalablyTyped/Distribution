package typings.reactDashNativeDashMail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-mail", JSImport.Namespace)
@js.native
object reactDashNativeDashMailMod extends js.Object {
  @JSName("Mailer")
  @js.native
  object MailerNs extends js.Object {
    def mail(options: Anon_Attachment, callback: js.Function2[/* error */ String, /* event */ String, Unit]): Unit = js.native
  }
  
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    def mail(options: Anon_Attachment, callback: js.Function2[/* error */ String, /* event */ String, Unit]): Unit = js.native
  }
  
}

