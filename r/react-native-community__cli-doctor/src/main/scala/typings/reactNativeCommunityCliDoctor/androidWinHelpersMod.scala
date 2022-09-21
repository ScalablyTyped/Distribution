package typings.reactNativeCommunityCliDoctor

import typings.execa.mod.ExecaChildProcess
import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorStrings.AMDH
import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorStrings.HAXM
import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorStrings.WHPX
import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidWinHelpersMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/windows/androidWinHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAVD(androidSDKRoot: String, name: String, device: String, image: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAVD")(androidSDKRoot.asInstanceOf[js.Any], name.asInstanceOf[js.Any], device.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def enableAMDH(androidSdkInstallPath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAMDH")(androidSdkInstallPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enableHAXM(androidSdkInstallPath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableHAXM")(androidSdkInstallPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enableWHPX(): ExecaChildProcess[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableWHPX")().asInstanceOf[ExecaChildProcess[String]]
  
  inline def getAndroidSdkRootInstallation(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidSdkRootInstallation")().asInstanceOf[String]
  
  inline def getBestHypervisor(androidSDKRoot: String): js.Promise[HypervisorStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBestHypervisor")(androidSDKRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HypervisorStatus]]
  
  inline def getUserAndroidPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAndroidPath")().asInstanceOf[String]
  
  inline def installComponent(component: String, androidSdkRoot: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("installComponent")(component.asInstanceOf[js.Any], androidSdkRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  trait HypervisorStatus extends StObject {
    
    var hypervisor: WHPX | HAXM | AMDH | none
    
    var installed: Boolean
  }
  object HypervisorStatus {
    
    inline def apply(hypervisor: WHPX | HAXM | AMDH | none, installed: Boolean): HypervisorStatus = {
      val __obj = js.Dynamic.literal(hypervisor = hypervisor.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any])
      __obj.asInstanceOf[HypervisorStatus]
    }
    
    extension [Self <: HypervisorStatus](x: Self) {
      
      inline def setHypervisor(value: WHPX | HAXM | AMDH | none): Self = StObject.set(x, "hypervisor", value.asInstanceOf[js.Any])
      
      inline def setInstalled(value: Boolean): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
    }
  }
}
