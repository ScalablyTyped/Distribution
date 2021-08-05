package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var configMap: js.UndefOr[Input[ConfigMapNodeConfigSource]] = js.undefined
}
object NodeConfigSource {
  
  inline def apply(): NodeConfigSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfigSource]
  }
  
  extension [Self <: NodeConfigSource](x: Self) {
    
    inline def setConfigMap(value: Input[ConfigMapNodeConfigSource]): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setConfigMapUndefined: Self = StObject.set(x, "configMap", js.undefined)
  }
}
