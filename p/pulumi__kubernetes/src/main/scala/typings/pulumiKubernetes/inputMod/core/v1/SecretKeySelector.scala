package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecretKeySelector selects a key of a Secret.
  */
trait SecretKeySelector extends StObject {
  
  /**
    * The key of the secret to select from.  Must be a valid secret key.
    */
  var key: Input[String]
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specify whether the Secret or its key must be defined
    */
  var optional: js.UndefOr[Input[Boolean]] = js.undefined
}
object SecretKeySelector {
  
  @scala.inline
  def apply(key: Input[String]): SecretKeySelector = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretKeySelector]
  }
  
  @scala.inline
  implicit class SecretKeySelectorMutableBuilder[Self <: SecretKeySelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptional(value: Input[Boolean]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
