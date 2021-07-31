package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterBootstrapAction extends StObject {
  
  /**
    * List of command line arguments passed to the JAR file's main function when executed.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: String
  
  /**
    * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file system
    */
  var path: String
}
object ClusterBootstrapAction {
  
  @scala.inline
  def apply(name: String, path: String): ClusterBootstrapAction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterBootstrapAction]
  }
  
  @scala.inline
  implicit class ClusterBootstrapActionMutableBuilder[Self <: ClusterBootstrapAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
