package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceQuotaStatus defines the enforced hard limits and observed use.
  */
@js.native
trait ResourceQuotaStatus extends js.Object {
  /**
    * Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  var hard: StringDictionary[String] = js.native
  /**
    * Used is the current observed total usage of the resource in the namespace.
    */
  var used: StringDictionary[String] = js.native
}

object ResourceQuotaStatus {
  @scala.inline
  def apply(hard: StringDictionary[String], used: StringDictionary[String]): ResourceQuotaStatus = {
    val __obj = js.Dynamic.literal(hard = hard.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuotaStatus]
  }
  @scala.inline
  implicit class ResourceQuotaStatusOps[Self <: ResourceQuotaStatus] (val x: Self) extends AnyVal {
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
    def setHard(value: StringDictionary[String]): Self = this.set("hard", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed(value: StringDictionary[String]): Self = this.set("used", value.asInstanceOf[js.Any])
  }
  
}

