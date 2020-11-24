package typings.pulumiKubernetes.mutatingWebhookConfigurationMod

import typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.MutatingWebhook
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutatingWebhookConfigurationArgs extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[admissionregistrationDotk8sDotioSlashv1beta1]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[
    Input[typings.pulumiKubernetes.pulumiKubernetesStrings.MutatingWebhookConfiguration]
  ] = js.native
  
  /**
    * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
    */
  val metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  
  /**
    * Webhooks is a list of webhooks and the affected resources and operations.
    */
  val webhooks: js.UndefOr[Input[js.Array[Input[MutatingWebhook]]]] = js.native
}
object MutatingWebhookConfigurationArgs {
  
  @scala.inline
  def apply(): MutatingWebhookConfigurationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutatingWebhookConfigurationArgs]
  }
  
  @scala.inline
  implicit class MutatingWebhookConfigurationArgsOps[Self <: MutatingWebhookConfigurationArgs] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: Input[admissionregistrationDotk8sDotioSlashv1beta1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.MutatingWebhookConfiguration]): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setWebhooksVarargs(value: Input[MutatingWebhook]*): Self = this.set("webhooks", js.Array(value :_*))
    
    @scala.inline
    def setWebhooks(value: Input[js.Array[Input[MutatingWebhook]]]): Self = this.set("webhooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhooks: Self = this.set("webhooks", js.undefined)
  }
}
