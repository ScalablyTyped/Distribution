package typings.sentryBrowser

import typings.sentryBrowser.anon.Dsn
import typings.sentryTypes.typesEnvelopeMod.EventEnvelope
import typings.sentryTypes.typesUserMod.UserFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUserfeedbackMod {
  
  @JSImport("@sentry/browser/types/userfeedback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUserFeedbackEnvelope(feedback: UserFeedback, param1: Dsn): EventEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserFeedbackEnvelope")(feedback.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope]
}
