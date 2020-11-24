package typings.pulumiKubernetes.outputMod.networking.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPIngressPath associates a path with a backend. Incoming urls matching the path are forwarded to the backend.
  */
@js.native
trait HTTPIngressPath extends js.Object {
  
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
    * Implementations are required to support all path types.
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
  implicit class HTTPIngressPathOps[Self <: HTTPIngressPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackend(value: IngressBackend): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathType(value: String): Self = this.set("pathType", value.asInstanceOf[js.Any])
  }
}
