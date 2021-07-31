package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupScalingConfig extends StObject {
  
  /**
    * Desired number of worker nodes.
    */
  var desiredSize: Double
  
  /**
    * Maximum number of worker nodes.
    */
  var maxSize: Double
  
  /**
    * Minimum number of worker nodes.
    */
  var minSize: Double
}
object NodeGroupScalingConfig {
  
  @scala.inline
  def apply(desiredSize: Double, maxSize: Double, minSize: Double): NodeGroupScalingConfig = {
    val __obj = js.Dynamic.literal(desiredSize = desiredSize.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupScalingConfig]
  }
  
  @scala.inline
  implicit class NodeGroupScalingConfigMutableBuilder[Self <: NodeGroupScalingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredSize(value: Double): Self = StObject.set(x, "desiredSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
  }
}
