package typings.pulumiKubernetes.providerMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderArgs extends js.Object {
  
  /**
    * If present, the name of the kubeconfig cluster to use.
    */
  val cluster: js.UndefOr[Input[String]] = js.native
  
  /**
    * If present, the name of the kubeconfig context to use.
    */
  val context: js.UndefOr[Input[String]] = js.native
  
  /**
    * BETA FEATURE - If present and set to true, enable server-side diff calculations.
    * This feature is in developer preview, and is disabled by default.
    *
    * This config can be specified in the following ways, using this precedence:
    * 1. This `enableDryRun` parameter.
    * 2. The `PULUMI_K8S_ENABLE_DRY_RUN` environment variable.
    */
  val enableDryRun: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The contents of a kubeconfig file or the path to a kubeconfig file. If this is set, this config will be used instead of $KUBECONFIG.
    */
  val kubeconfig: js.UndefOr[Input[String]] = js.native
  
  /**
    * If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
    *
    * A namespace can be specified in multiple places, and the precedence is as follows:
    * 1. `.metadata.namespace` set on the resource.
    * 2. This `namespace` parameter.
    * 3. `namespace` set for the active context in the kubeconfig.
    */
  val namespace: js.UndefOr[Input[String]] = js.native
  
  /**
    * BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
    * be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
    * to the Pulumi program. This feature is in developer preview, and is disabled by default.
    *
    * Note that some computed Outputs such as status fields will not be populated
    * since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
    * and may result in an error if they are referenced by other resources. Also note that any secret values
    * used in these resources will be rendered in plaintext to the resulting YAML.
    */
  val renderYamlToDirectory: js.UndefOr[Input[String]] = js.native
  
  /**
    * If present and set to true, suppress apiVersion deprecation warnings from the CLI.
    *
    * This config can be specified in the following ways, using this precedence:
    * 1. This `suppressDeprecationWarnings` parameter.
    * 2. The `PULUMI_K8S_SUPPRESS_DEPRECATION_WARNINGS` environment variable.
    */
  val suppressDeprecationWarnings: js.UndefOr[Input[Boolean]] = js.native
}
object ProviderArgs {
  
  @scala.inline
  def apply(): ProviderArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderArgs]
  }
  
  @scala.inline
  implicit class ProviderArgsOps[Self <: ProviderArgs] (val x: Self) extends AnyVal {
    
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
    def setCluster(value: Input[String]): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    
    @scala.inline
    def setContext(value: Input[String]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEnableDryRun(value: Input[Boolean]): Self = this.set("enableDryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDryRun: Self = this.set("enableDryRun", js.undefined)
    
    @scala.inline
    def setKubeconfig(value: Input[String]): Self = this.set("kubeconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKubeconfig: Self = this.set("kubeconfig", js.undefined)
    
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setRenderYamlToDirectory(value: Input[String]): Self = this.set("renderYamlToDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderYamlToDirectory: Self = this.set("renderYamlToDirectory", js.undefined)
    
    @scala.inline
    def setSuppressDeprecationWarnings(value: Input[Boolean]): Self = this.set("suppressDeprecationWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressDeprecationWarnings: Self = this.set("suppressDeprecationWarnings", js.undefined)
  }
}
