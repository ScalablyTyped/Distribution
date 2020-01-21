package typings.pulumiKubernetes.providerMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderArgs extends js.Object {
  /**
    * If present, the name of the kubeconfig cluster to use.
    */
  val cluster: js.UndefOr[Input[String]] = js.undefined
  /**
    * If present, the name of the kubeconfig context to use.
    */
  val context: js.UndefOr[Input[String]] = js.undefined
  /**
    * BETA FEATURE - If present and set to true, enable server-side diff calculations.
    * This feature is in developer preview, and is disabled by default.
    *
    * This config can be specified in the following ways, using this precedence:
    * 1. This `enableDryRun` parameter.
    * 2. The `PULUMI_K8S_ENABLE_DRY_RUN` environment variable.
    */
  val enableDryRun: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The contents of a kubeconfig file. If this is set, this config will be used instead of $KUBECONFIG.
    */
  val kubeconfig: js.UndefOr[Input[String]] = js.undefined
  /**
    * If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
    *
    * A namespace can be specified in multiple places, and the precedence is as follows:
    * 1. `.metadata.namespace` set on the resource.
    * 2. This `namespace` parameter.
    * 3. `namespace` set for the active context in the kubeconfig.
    */
  val namespace: js.UndefOr[Input[String]] = js.undefined
  /**
    * If present and set to true, suppress apiVersion deprecation warnings from the CLI.
    *
    * This config can be specified in the following ways, using this precedence:
    * 1. This `suppressDeprecationWarnings` parameter.
    * 2. The `PULUMI_K8S_SUPPRESS_DEPRECATION_WARNINGS` environment variable.
    */
  val suppressDeprecationWarnings: js.UndefOr[Input[Boolean]] = js.undefined
}

object ProviderArgs {
  @scala.inline
  def apply(
    cluster: Input[String] = null,
    context: Input[String] = null,
    enableDryRun: Input[Boolean] = null,
    kubeconfig: Input[String] = null,
    namespace: Input[String] = null,
    suppressDeprecationWarnings: Input[Boolean] = null
  ): ProviderArgs = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (enableDryRun != null) __obj.updateDynamic("enableDryRun")(enableDryRun.asInstanceOf[js.Any])
    if (kubeconfig != null) __obj.updateDynamic("kubeconfig")(kubeconfig.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (suppressDeprecationWarnings != null) __obj.updateDynamic("suppressDeprecationWarnings")(suppressDeprecationWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderArgs]
  }
}

