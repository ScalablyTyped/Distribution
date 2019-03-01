package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderArgs extends js.Object {
  /**
    * If present, the name of the kubeconfig cluster to use.
    */
  val cluster: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If present, the name of the kubeconfig context to use.
    */
  val context: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The contents of a kubeconfig file. If this is set, this config will be used instead of $KUBECONFIG.
    */
  val kubeconfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If present, the namespace scope to use.
    */
  val namespace: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ProviderArgs {
  @scala.inline
  def apply(
    cluster: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    context: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kubeconfig: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ProviderArgs = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (kubeconfig != null) __obj.updateDynamic("kubeconfig")(kubeconfig.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderArgs]
  }
}

