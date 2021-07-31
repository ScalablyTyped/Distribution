package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specify whether the Secret must be defined
    */
  var optional: js.UndefOr[Input[Boolean]] = js.undefined
}
object SecretEnvSource {
  
  @scala.inline
  def apply(): SecretEnvSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretEnvSource]
  }
  
  @scala.inline
  implicit class SecretEnvSourceMutableBuilder[Self <: SecretEnvSource] (val x: Self) extends AnyVal {
    
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
