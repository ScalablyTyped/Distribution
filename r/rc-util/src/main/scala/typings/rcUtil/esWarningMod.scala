package typings.rcUtil

import typings.rcUtil.rcUtilStrings.note
import typings.rcUtil.rcUtilStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esWarningMod {
  
  @JSImport("rc-util/es/warning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].apply(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util/es/warning", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_warning.noteOnce` */
    inline def noteOnce(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noteOnce")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util/es/warning", "default.preMessage")
    @js.native
    def preMessage: js.Function1[/* fn */ preMessageFn, Unit] = js.native
    inline def preMessage_=(x: js.Function1[/* fn */ preMessageFn, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preMessage")(x.asInstanceOf[js.Any])
    
    /* was `typeof imported_warning.resetWarned` */
    inline def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
  }
  
  inline def call(
    method: js.Function2[/* valid */ Boolean, /* message */ String, Unit],
    valid: Boolean,
    message: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def note(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("note")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def noteOnce(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noteOnce")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def preMessage(fn: preMessageFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preMessage")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
  
  inline def warning(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object warningOnce {
    
    inline def apply(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].apply(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util/es/warning", "warningOnce")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_warning.noteOnce` */
    inline def noteOnce(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noteOnce")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util/es/warning", "warningOnce.preMessage")
    @js.native
    def preMessage: js.Function1[/* fn */ preMessageFn, Unit] = js.native
    inline def preMessage_=(x: js.Function1[/* fn */ preMessageFn, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preMessage")(x.asInstanceOf[js.Any])
    
    /* was `typeof imported_warning.resetWarned` */
    inline def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
  }
  
  type preMessageFn = js.Function2[/* message */ String, /* type */ warning | note, js.UndefOr[String | Null | Double]]
}
