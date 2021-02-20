package typings.pulumiKubernetes.outputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceReference holds a reference to Service.legacy.k8s.io
  */
@js.native
trait ServiceReference extends StObject {
  
  /**
    * name is the name of the service. Required
    */
  var name: String = js.native
  
  /**
    * namespace is the namespace of the service. Required
    */
  var namespace: String = js.native
  
  /**
    * path is an optional URL path at which the webhook will be contacted.
    */
  var path: String = js.native
  
  /**
    * port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
    */
  var port: Double = js.native
}
object ServiceReference {
  
  @scala.inline
  def apply(name: String, namespace: String, path: String, port: Double): ServiceReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceReference]
  }
  
  @scala.inline
  implicit class ServiceReferenceMutableBuilder[Self <: ServiceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
