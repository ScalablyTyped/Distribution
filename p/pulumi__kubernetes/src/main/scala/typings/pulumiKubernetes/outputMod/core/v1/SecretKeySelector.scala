package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecretKeySelector selects a key of a Secret.
  */
@js.native
trait SecretKeySelector extends StObject {
  
  /**
    * The key of the secret to select from.  Must be a valid secret key.
    */
  var key: String = js.native
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String = js.native
  
  /**
    * Specify whether the Secret or its key must be defined
    */
  var optional: Boolean = js.native
}
object SecretKeySelector {
  
  @scala.inline
  def apply(key: String, name: String, optional: Boolean): SecretKeySelector = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretKeySelector]
  }
  
  @scala.inline
  implicit class SecretKeySelectorMutableBuilder[Self <: SecretKeySelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
