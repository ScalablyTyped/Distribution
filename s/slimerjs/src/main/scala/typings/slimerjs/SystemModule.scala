package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import typings.slimerjs.anon.Architecture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemModule extends StObject {
  
  var args: js.Array[String]
  
  var env: StringDictionary[String]
  
  var os: Architecture
  
  var pid: Double
  
  var platform: String
  
  var standarderr: Std
  
  var standardin: Std
  
  var standardout: Std
  
  var stderr: Std
  
  var stdin: Std
  
  var stdout: Std
}
object SystemModule {
  
  inline def apply(
    args: js.Array[String],
    env: StringDictionary[String],
    os: Architecture,
    pid: Double,
    platform: String,
    standarderr: Std,
    standardin: Std,
    standardout: Std,
    stderr: Std,
    stdin: Std,
    stdout: Std
  ): SystemModule = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], standarderr = standarderr.asInstanceOf[js.Any], standardin = standardin.asInstanceOf[js.Any], standardout = standardout.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemModule]
  }
  
  extension [Self <: SystemModule](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setOs(value: Architecture): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setStandarderr(value: Std): Self = StObject.set(x, "standarderr", value.asInstanceOf[js.Any])
    
    inline def setStandardin(value: Std): Self = StObject.set(x, "standardin", value.asInstanceOf[js.Any])
    
    inline def setStandardout(value: Std): Self = StObject.set(x, "standardout", value.asInstanceOf[js.Any])
    
    inline def setStderr(value: Std): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStdin(value: Std): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: Std): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
