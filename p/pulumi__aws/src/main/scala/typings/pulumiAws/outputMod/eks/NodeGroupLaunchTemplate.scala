package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupLaunchTemplate extends StObject {
  
  /**
    * Identifier of the EC2 Launch Template. Conflicts with `name`.
    */
  var id: String = js.native
  
  /**
    * Name of the EC2 Launch Template. Conflicts with `id`.
    */
  var name: String = js.native
  
  var version: String = js.native
}
object NodeGroupLaunchTemplate {
  
  @scala.inline
  def apply(id: String, name: String, version: String): NodeGroupLaunchTemplate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupLaunchTemplate]
  }
  
  @scala.inline
  implicit class NodeGroupLaunchTemplateMutableBuilder[Self <: NodeGroupLaunchTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
