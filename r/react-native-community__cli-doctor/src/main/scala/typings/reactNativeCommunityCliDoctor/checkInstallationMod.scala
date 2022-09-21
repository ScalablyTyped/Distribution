package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.anon.LooseRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkInstallationMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/checkInstallation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait PACKAGE_MANAGERS extends StObject
  @JSImport("@react-native-community/cli-doctor/build/tools/checkInstallation", "PACKAGE_MANAGERS")
  @js.native
  object PACKAGE_MANAGERS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PACKAGE_MANAGERS & String] = js.native
    
    @js.native
    sealed trait NPM
      extends StObject
         with PACKAGE_MANAGERS
    /* "NPM" */ val NPM: typings.reactNativeCommunityCliDoctor.checkInstallationMod.PACKAGE_MANAGERS.NPM & String = js.native
    
    @js.native
    sealed trait YARN
      extends StObject
         with PACKAGE_MANAGERS
    /* "YARN" */ val YARN: typings.reactNativeCommunityCliDoctor.checkInstallationMod.PACKAGE_MANAGERS.YARN & String = js.native
  }
  
  inline def doesSoftwareNeedToBeFixed(hasVersionVersionRangeLooseRange: LooseRange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doesSoftwareNeedToBeFixed")(hasVersionVersionRangeLooseRange.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSoftwareNotInstalled(command: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSoftwareNotInstalled")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
