package typings.reactNativeCommunityCliHermes

import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildProfileHermesDownloadProfileMod {
  
  @JSImport("@react-native-community/cli-hermes/build/profileHermes/downloadProfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def downloadProfile(
    ctx: Config,
    dstPath: String,
    filename: js.UndefOr[String],
    sourcemapPath: js.UndefOr[String],
    raw: js.UndefOr[Boolean],
    shouldGenerateSourcemap: js.UndefOr[Boolean],
    port: js.UndefOr[String],
    appId: js.UndefOr[String],
    appIdSuffix: js.UndefOr[String]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadProfile")(ctx.asInstanceOf[js.Any], dstPath.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], sourcemapPath.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], shouldGenerateSourcemap.asInstanceOf[js.Any], port.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], appIdSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
