package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.anon.Latest
import typings.reactNativeWindowsCli.anon.Requires
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vsInstallsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/vsInstalls", "enumerateVsInstalls")
  @js.native
  def enumerateVsInstalls(opts: Latest): js.Array[VisualStudioInstallation] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/vsInstalls", "findLatestVsInstall")
  @js.native
  def findLatestVsInstall(opts: Requires): VisualStudioInstallation | Null = js.native
  
  @js.native
  trait VisualStudioInstallation extends StObject {
    
    var installationPath: String = js.native
    
    var installationVersion: String = js.native
    
    var instanceId: String = js.native
  }
  object VisualStudioInstallation {
    
    @scala.inline
    def apply(installationPath: String, installationVersion: String, instanceId: String): VisualStudioInstallation = {
      val __obj = js.Dynamic.literal(installationPath = installationPath.asInstanceOf[js.Any], installationVersion = installationVersion.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisualStudioInstallation]
    }
    
    @scala.inline
    implicit class VisualStudioInstallationMutableBuilder[Self <: VisualStudioInstallation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstallationPath(value: String): Self = StObject.set(x, "installationPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallationVersion(value: String): Self = StObject.set(x, "installationVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    }
  }
}
