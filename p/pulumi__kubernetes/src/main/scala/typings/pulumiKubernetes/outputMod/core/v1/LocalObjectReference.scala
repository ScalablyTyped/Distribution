package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
  */
@js.native
trait LocalObjectReference extends StObject {
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String = js.native
}
object LocalObjectReference {
  
  @scala.inline
  def apply(name: String): LocalObjectReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalObjectReference]
  }
  
  @scala.inline
  implicit class LocalObjectReferenceMutableBuilder[Self <: LocalObjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
