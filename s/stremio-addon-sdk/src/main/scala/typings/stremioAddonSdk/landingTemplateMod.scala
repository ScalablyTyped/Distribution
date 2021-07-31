package typings.stremioAddonSdk

import typings.stremioAddonSdk.mod.Manifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object landingTemplateMod {
  
  @JSImport("stremio-addon-sdk/src/landingTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(addonInterface: Manifest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(addonInterface.asInstanceOf[js.Any]).asInstanceOf[String]
}
