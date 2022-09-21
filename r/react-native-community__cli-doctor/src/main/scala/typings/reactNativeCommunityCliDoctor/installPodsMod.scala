package typings.reactNativeCommunityCliDoctor

import typings.ora.mod.Ora
import typings.reactNativeCommunityCliDoctor.anon.Directory
import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorStrings.gem
import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorStrings.homebrew
import typings.reactNativeCommunityCliDoctor.typesMod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installPodsMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/installPods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasDirectoryLoader: Directory): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasDirectoryLoader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def installCocoaPods(loader: Loader): js.Promise[Unit | Ora] = ^.asInstanceOf[js.Dynamic].applyDynamic("installCocoaPods")(loader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit | Ora]]
  
  inline def promptCocoaPodsInstallationQuestion(): js.Promise[PromptCocoaPodsInstallation] = ^.asInstanceOf[js.Dynamic].applyDynamic("promptCocoaPodsInstallationQuestion")().asInstanceOf[js.Promise[PromptCocoaPodsInstallation]]
  
  inline def runSudo(command: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runSudo")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait PromptCocoaPodsInstallation extends StObject {
    
    var installMethod: gem | homebrew
    
    var promptQuestion: String
  }
  object PromptCocoaPodsInstallation {
    
    inline def apply(installMethod: gem | homebrew, promptQuestion: String): PromptCocoaPodsInstallation = {
      val __obj = js.Dynamic.literal(installMethod = installMethod.asInstanceOf[js.Any], promptQuestion = promptQuestion.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptCocoaPodsInstallation]
    }
    
    extension [Self <: PromptCocoaPodsInstallation](x: Self) {
      
      inline def setInstallMethod(value: gem | homebrew): Self = StObject.set(x, "installMethod", value.asInstanceOf[js.Any])
      
      inline def setPromptQuestion(value: String): Self = StObject.set(x, "promptQuestion", value.asInstanceOf[js.Any])
    }
  }
}
