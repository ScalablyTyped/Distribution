package typings.sentryBrowser

import typings.sentryBrowser.typesProfilingJsSelfProfilingMod.ProcessedJSSelfProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProfilingSendProfileMod {
  
  @JSImport("@sentry/browser/types/profiling/sendProfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendProfile(profileId: String, profile: ProcessedJSSelfProfile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendProfile")(profileId.asInstanceOf[js.Any], profile.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
