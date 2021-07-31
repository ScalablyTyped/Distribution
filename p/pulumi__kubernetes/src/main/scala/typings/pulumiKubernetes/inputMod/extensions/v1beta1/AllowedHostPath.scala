package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to use. It requires the path prefix to be defined. Deprecated: use AllowedHostPath from policy API Group instead.
  */
trait AllowedHostPath extends StObject {
  
  /**
    * pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
    *
    * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
    */
  var pathPrefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
}
object AllowedHostPath {
  
  @scala.inline
  def apply(): AllowedHostPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedHostPath]
  }
  
  @scala.inline
  implicit class AllowedHostPathMutableBuilder[Self <: AllowedHostPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPathPrefix(value: Input[String]): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
