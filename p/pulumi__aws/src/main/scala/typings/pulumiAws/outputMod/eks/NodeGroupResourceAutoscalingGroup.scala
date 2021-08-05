package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupResourceAutoscalingGroup extends StObject {
  
  /**
    * Name of the EC2 Launch Template. Conflicts with `id`.
    */
  var name: String
}
object NodeGroupResourceAutoscalingGroup {
  
  inline def apply(name: String): NodeGroupResourceAutoscalingGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupResourceAutoscalingGroup]
  }
  
  extension [Self <: NodeGroupResourceAutoscalingGroup](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
