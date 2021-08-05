package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobCommand extends StObject {
  
  /**
    * The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, `maxCapacity` needs to be set if `pythonshell` is chosen.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var pythonVersion: String
  
  /**
    * Specifies the S3 path to a script that executes a job.
    */
  var scriptLocation: String
}
object JobCommand {
  
  inline def apply(pythonVersion: String, scriptLocation: String): JobCommand = {
    val __obj = js.Dynamic.literal(pythonVersion = pythonVersion.asInstanceOf[js.Any], scriptLocation = scriptLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCommand]
  }
  
  extension [Self <: JobCommand](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPythonVersion(value: String): Self = StObject.set(x, "pythonVersion", value.asInstanceOf[js.Any])
    
    inline def setScriptLocation(value: String): Self = StObject.set(x, "scriptLocation", value.asInstanceOf[js.Any])
  }
}
