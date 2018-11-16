package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProviderArgs extends js.Object {
  /**
       * If present, the name of the kubeconfig cluster to use.
       */
  val cluster: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
       * If present, the name of the kubeconfig context to use.
       */
  val context: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
       * The contents of a kubeconfig file. If this is set, this config will be used instead of $KUBECONFIG.
       */
  val kubeconfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
       * If present, the namespace scope to use.
       */
  val namespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

