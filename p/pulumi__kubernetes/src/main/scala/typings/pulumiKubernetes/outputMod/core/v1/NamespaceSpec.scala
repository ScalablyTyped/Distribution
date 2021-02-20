package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NamespaceSpec describes the attributes on a Namespace.
  */
@js.native
trait NamespaceSpec extends StObject {
  
  /**
    * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  var finalizers: js.Array[String] = js.native
}
object NamespaceSpec {
  
  @scala.inline
  def apply(finalizers: js.Array[String]): NamespaceSpec = {
    val __obj = js.Dynamic.literal(finalizers = finalizers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceSpec]
  }
  
  @scala.inline
  implicit class NamespaceSpecMutableBuilder[Self <: NamespaceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinalizers(value: js.Array[String]): Self = StObject.set(x, "finalizers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizersVarargs(value: String*): Self = StObject.set(x, "finalizers", js.Array(value :_*))
  }
}
