package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.
  */
@js.native
trait RuntimeClassStrategyOptions extends js.Object {
  /**
    * allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of "*" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
    */
  var allowedRuntimeClassNames: js.Array[String] = js.native
  /**
    * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
    */
  var defaultRuntimeClassName: String = js.native
}

object RuntimeClassStrategyOptions {
  @scala.inline
  def apply(allowedRuntimeClassNames: js.Array[String], defaultRuntimeClassName: String): RuntimeClassStrategyOptions = {
    val __obj = js.Dynamic.literal(allowedRuntimeClassNames = allowedRuntimeClassNames.asInstanceOf[js.Any], defaultRuntimeClassName = defaultRuntimeClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeClassStrategyOptions]
  }
  @scala.inline
  implicit class RuntimeClassStrategyOptionsOps[Self <: RuntimeClassStrategyOptions] (val x: Self) extends AnyVal {
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
    def setAllowedRuntimeClassNamesVarargs(value: String*): Self = this.set("allowedRuntimeClassNames", js.Array(value :_*))
    @scala.inline
    def setAllowedRuntimeClassNames(value: js.Array[String]): Self = this.set("allowedRuntimeClassNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultRuntimeClassName(value: String): Self = this.set("defaultRuntimeClassName", value.asInstanceOf[js.Any])
  }
  
}

