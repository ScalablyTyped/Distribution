package typings.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceReference holds a reference to Service.legacy.k8s.io
  */
trait ServiceReference extends StObject {
  
  /**
    * name is the name of the service. Required
    */
  var name: Input[String]
  
  /**
    * namespace is the namespace of the service. Required
    */
  var namespace: Input[String]
  
  /**
    * path is an optional URL path at which the webhook will be contacted.
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
    */
  var port: js.UndefOr[Input[Double]] = js.undefined
}
object ServiceReference {
  
  inline def apply(name: Input[String], namespace: Input[String]): ServiceReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceReference]
  }
  
  extension [Self <: ServiceReference](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
