package typings.reactNativeCommunityCli

import typings.execa.mod.ExecaChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageManagerMod {
  
  @JSImport("@react-native-community/cli/build/tools/packageManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(options: Options): ExecaChildProcess[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[ExecaChildProcess[String]]
  
  inline def install(packageNames: js.Array[String], options: Options): ExecaChildProcess[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(packageNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExecaChildProcess[String]]
  
  inline def installAll(options: Options): ExecaChildProcess[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("installAll")(options.asInstanceOf[js.Any]).asInstanceOf[ExecaChildProcess[String]]
  
  inline def installDev(packageNames: js.Array[String], options: Options): ExecaChildProcess[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("installDev")(packageNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExecaChildProcess[String]]
  
  inline def uninstall(packageNames: js.Array[String], options: Options): ExecaChildProcess[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(packageNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExecaChildProcess[String]]
  
  trait Options extends StObject {
    
    var preferYarn: js.UndefOr[Boolean] = js.undefined
    
    var root: String
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(root: String): Options = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPreferYarn(value: Boolean): Self = StObject.set(x, "preferYarn", value.asInstanceOf[js.Any])
      
      inline def setPreferYarnUndefined: Self = StObject.set(x, "preferYarn", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
