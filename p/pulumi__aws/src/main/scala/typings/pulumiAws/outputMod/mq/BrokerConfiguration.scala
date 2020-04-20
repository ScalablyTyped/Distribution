package typings.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerConfiguration extends js.Object {
  /**
    * The Configuration ID.
    */
  var id: String = js.native
  /**
    * Revision of the Configuration.
    */
  var revision: Double = js.native
}

object BrokerConfiguration {
  @scala.inline
  def apply(id: String, revision: Double): BrokerConfiguration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerConfiguration]
  }
}

