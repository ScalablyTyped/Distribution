package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil.
  */
trait NodeConfigSource extends StObject {
  
  /**
    * ConfigMap is a reference to a Node's ConfigMap
    */
  var configMap: ConfigMapNodeConfigSource
}
object NodeConfigSource {
  
  @scala.inline
  def apply(configMap: ConfigMapNodeConfigSource): NodeConfigSource = {
    val __obj = js.Dynamic.literal(configMap = configMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfigSource]
  }
  
  @scala.inline
  implicit class NodeConfigSourceMutableBuilder[Self <: NodeConfigSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigMap(value: ConfigMapNodeConfigSource): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
  }
}
