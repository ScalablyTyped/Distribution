package typings.reactNativeCommunityCliTools

import typings.reactNativeCommunityCliTools.buildReleaseCheckerGetLatestReleaseMod.Release
import typings.semver.mod.SemVer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildReleaseCheckerMod {
  
  @JSImport("@react-native-community/cli-tools/build/releaseChecker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def current(projectRoot: String): js.UndefOr[SemVer] = ^.asInstanceOf[js.Dynamic].applyDynamic("current")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SemVer]]
  
  inline def latest(projectRoot: String): js.Promise[js.UndefOr[Update]] = ^.asInstanceOf[js.Dynamic].applyDynamic("latest")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Update]]]
  
  inline def logIfUpdateAvailable(projectRoot: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("logIfUpdateAvailable")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait Update extends StObject {
    
    var current: String
    
    var name: String
    
    var upgrade: Release
  }
  object Update {
    
    inline def apply(current: String, name: String, upgrade: Release): Update = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any])
      __obj.asInstanceOf[Update]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUpgrade(value: Release): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
    }
  }
}
