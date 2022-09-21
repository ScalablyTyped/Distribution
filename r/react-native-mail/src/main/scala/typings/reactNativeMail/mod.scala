package typings.reactNativeMail

import typings.reactNativeMail.anon.Attachments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-mail", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def mail(
      options: Attachments,
      callback: js.Function2[/* error */ String, /* event */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mail")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Mailer {
    
    @JSImport("react-native-mail", "Mailer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def mail(
      options: Attachments,
      callback: js.Function2[/* error */ String, /* event */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mail")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
