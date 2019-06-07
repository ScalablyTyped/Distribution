package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientBrokerInCluster extends js.Object {
  var clientBroker: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var inCluster: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_ClientBrokerInCluster {
  @scala.inline
  def apply(
    clientBroker: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    inCluster: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_ClientBrokerInCluster = {
    val __obj = js.Dynamic.literal()
    if (clientBroker != null) __obj.updateDynamic("clientBroker")(clientBroker.asInstanceOf[js.Any])
    if (inCluster != null) __obj.updateDynamic("inCluster")(inCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientBrokerInCluster]
  }
}

