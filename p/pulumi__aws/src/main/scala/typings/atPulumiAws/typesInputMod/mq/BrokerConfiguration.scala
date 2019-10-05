package typings.atPulumiAws.typesInputMod.mq

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerConfiguration extends js.Object {
  /**
    * The Configuration ID.
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  /**
    * Revision of the Configuration.
    */
  var revision: js.UndefOr[Input[Double]] = js.undefined
}

object BrokerConfiguration {
  @scala.inline
  def apply(id: Input[String] = null, revision: Input[Double] = null): BrokerConfiguration = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerConfiguration]
  }
}

