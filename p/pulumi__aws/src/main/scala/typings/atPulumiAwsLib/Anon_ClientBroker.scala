package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientBroker extends js.Object {
  var clientBroker: js.UndefOr[java.lang.String] = js.undefined
  var inCluster: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ClientBroker {
  @scala.inline
  def apply(clientBroker: java.lang.String = null, inCluster: js.UndefOr[scala.Boolean] = js.undefined): Anon_ClientBroker = {
    val __obj = js.Dynamic.literal()
    if (clientBroker != null) __obj.updateDynamic("clientBroker")(clientBroker)
    if (!js.isUndefined(inCluster)) __obj.updateDynamic("inCluster")(inCluster)
    __obj.asInstanceOf[Anon_ClientBroker]
  }
}

