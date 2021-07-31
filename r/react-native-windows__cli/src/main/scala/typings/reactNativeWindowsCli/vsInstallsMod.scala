package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.anon.Latest
import typings.reactNativeWindowsCli.anon.Requires
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vsInstallsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/vsInstalls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def enumerateVsInstalls(opts: Latest): js.Array[VisualStudioInstallation] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateVsInstalls")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Array[VisualStudioInstallation]]
  
  @scala.inline
  def findLatestVsInstall(opts: Requires): VisualStudioInstallation | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findLatestVsInstall")(opts.asInstanceOf[js.Any]).asInstanceOf[VisualStudioInstallation | Null]
  
  trait VisualStudioInstallation extends StObject {
    
    var installationPath: String
    
    var installationVersion: String
    
    var instanceId: String
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
