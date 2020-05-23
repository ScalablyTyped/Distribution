package typings.reactNativeMail

import typings.reactNativeMail.anon.Attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-mail", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object Mailer extends js.Object {
    def mail(options: Attachment, callback: js.Function2[/* error */ String, /* event */ String, Unit]): Unit = js.native
  }
  
  @js.native
  object default extends js.Object {
    def mail(options: Attachment, callback: js.Function2[/* error */ String, /* event */ String, Unit]): Unit = js.native
  }
  
}

