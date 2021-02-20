package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPIngressPath associates a path with a backend. Incoming urls matching the path are forwarded to the backend.
  */
@js.native
trait HTTPIngressPath extends StObject {
  
  /**
    * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
    */
  var backend: IngressBackend = js.native
  
  /**
    * Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. When unspecified, all paths from incoming requests are matched.
    */
  var path: String = js.native
  
  /**
    * PathType determines the interpretation of the Path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
    *   done on a path element by element basis. A path element refers is the
    *   list of labels in the path split by the '/' separator. A request is a
    *   match for path p if every p is an element-wise prefix of p of the
    *   request path. Note that if the last element of the path is a substring
    *   of the last element in request path, it is not a match (e.g. /foo/bar
    *   matches /foo/bar/baz, but does not match /foo/barbaz).
    * * ImplementationSpecific: Interpretation of the Path matching is up to
    *   the IngressClass. Implementations can treat this as a separate PathType
    *   or treat it identically to Prefix or Exact path types.
    * Implementations are required to support all path types. Defaults to ImplementationSpecific.
    */
  var pathType: String = js.native
}
object HTTPIngressPath {
  
  @scala.inline
  def apply(backend: IngressBackend, path: String, pathType: String): HTTPIngressPath = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPIngressPath]
  }
  
  @scala.inline
  implicit class HTTPIngressPathMutableBuilder[Self <: HTTPIngressPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: IngressBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathType(value: String): Self = StObject.set(x, "pathType", value.asInstanceOf[js.Any])
  }
}
