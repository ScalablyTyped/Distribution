package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecretEnvSource selects a Secret to populate the environment variables with.
  *
  * The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
  */
trait SecretEnvSource extends StObject {
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String
  
  /**
    * Specify whether the Secret must be defined
    */
  var optional: Boolean
}
object SecretEnvSource {
  
  @scala.inline
  def apply(name: String, optional: Boolean): SecretEnvSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretEnvSource]
  }
  
  @scala.inline
  implicit class SecretEnvSourceMutableBuilder[Self <: SecretEnvSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
