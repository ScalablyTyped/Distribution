package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientBrokerInCluster extends js.Object {
  var clientBroker: js.UndefOr[Input[String]] = js.undefined
  var inCluster: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_ClientBrokerInCluster {
  @scala.inline
  def apply(clientBroker: Input[String] = null, inCluster: Input[Boolean] = null): Anon_ClientBrokerInCluster = {
    val __obj = js.Dynamic.literal()
    if (clientBroker != null) __obj.updateDynamic("clientBroker")(clientBroker.asInstanceOf[js.Any])
    if (inCluster != null) __obj.updateDynamic("inCluster")(inCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientBrokerInCluster]
  }
}

