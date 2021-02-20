package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import typings.slimerjs.anon.Architecture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemModule extends StObject {
  
  var args: js.Array[String] = js.native
  
  var env: StringDictionary[String] = js.native
  
  var os: Architecture = js.native
  
  var pid: Double = js.native
  
  var platform: String = js.native
  
  var standarderr: Std = js.native
  
  var standardin: Std = js.native
  
  var standardout: Std = js.native
  
  var stderr: Std = js.native
  
  var stdin: Std = js.native
  
  var stdout: Std = js.native
}
object SystemModule {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SystemModuleMutableBuilder[Self <: SystemModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: Architecture): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandarderr(value: Std): Self = StObject.set(x, "standarderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardin(value: Std): Self = StObject.set(x, "standardin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardout(value: Std): Self = StObject.set(x, "standardout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: Std): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdin(value: Std): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: Std): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
