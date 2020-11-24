package typings.pulumiKubernetes.inputMod.apiregistration.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
  */
@js.native
trait APIServiceSpec extends js.Object {
  
  /**
    * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate. If unspecified, system trust roots on the apiserver are used.
    */
  var caBundle: js.UndefOr[Input[String]] = js.native
  
  /**
    * Group is the API group name this server hosts
    */
  var group: js.UndefOr[Input[String]] = js.native
  
  /**
    * GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
    */
  var groupPriorityMinimum: Input[Double] = js.native
  
  /**
    * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
    */
  var insecureSkipTLSVerify: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
    */
  var service: js.UndefOr[Input[ServiceReference]] = js.native
  
  /**
    * Version is the API version this server hosts.  For example, "v1"
    */
  var version: js.UndefOr[Input[String]] = js.native
  
  /**
    * VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
    */
  var versionPriority: Input[Double] = js.native
}
object APIServiceSpec {
  
  @scala.inline
  def apply(groupPriorityMinimum: Input[Double], versionPriority: Input[Double]): APIServiceSpec = {
    val __obj = js.Dynamic.literal(groupPriorityMinimum = groupPriorityMinimum.asInstanceOf[js.Any], versionPriority = versionPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIServiceSpec]
  }
  
  @scala.inline
  implicit class APIServiceSpecOps[Self <: APIServiceSpec] (val x: Self) extends AnyVal {
    
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
    def setGroupPriorityMinimum(value: Input[Double]): Self = this.set("groupPriorityMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionPriority(value: Input[Double]): Self = this.set("versionPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaBundle(value: Input[String]): Self = this.set("caBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaBundle: Self = this.set("caBundle", js.undefined)
    
    @scala.inline
    def setGroup(value: Input[String]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setInsecureSkipTLSVerify(value: Input[Boolean]): Self = this.set("insecureSkipTLSVerify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecureSkipTLSVerify: Self = this.set("insecureSkipTLSVerify", js.undefined)
    
    @scala.inline
    def setService(value: Input[ServiceReference]): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
