package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterBootstrapAction extends StObject {
  
  /**
    * List of command line arguments passed to the JAR file's main function when executed.
    */
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: Input[String]
  
  /**
    * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file system
    */
  var path: Input[String]
}
object ClusterBootstrapAction {
  
  inline def apply(name: Input[String], path: Input[String]): ClusterBootstrapAction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterBootstrapAction]
  }
  
  extension [Self <: ClusterBootstrapAction](x: Self) {
    
    inline def setArgs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Input[String]*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
