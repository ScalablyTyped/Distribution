package typings.snyk

import typings.snyk.distLibPluginsSastTypesMod.SastSettings
import typings.snyk.distLibPluginsSastTypesMod.TrackUsageResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsSastChecksMod {
  
  @JSImport("snyk/dist/lib/plugins/sast/checks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSastSettingsForOrg(org_ : Any): js.Promise[SastSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSastSettingsForOrg")(org_.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SastSettings]]
  
  inline def trackUsage(org_ : Any): js.Promise[TrackUsageResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackUsage")(org_.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TrackUsageResponse]]
}
