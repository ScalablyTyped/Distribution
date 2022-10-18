package typings.snyk

import typings.snyk.distLibPluginsSastTypesMod.SastSettings
import typings.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsSastSettingsMod {
  
  @JSImport("snyk/dist/lib/plugins/sast/settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSastSettings(options: Options): js.Promise[SastSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSastSettings")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SastSettings]]
}
