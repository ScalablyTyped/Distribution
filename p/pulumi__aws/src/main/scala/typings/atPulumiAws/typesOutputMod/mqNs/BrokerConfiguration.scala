package typings.atPulumiAws.typesOutputMod.mqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerConfiguration extends js.Object {
  /**
    * The Configuration ID.
    */
  var id: String
  /**
    * Revision of the Configuration.
    */
  var revision: Double
}

object BrokerConfiguration {
  @scala.inline
  def apply(id: String, revision: Double): BrokerConfiguration = {
    val __obj = js.Dynamic.literal(id = id, revision = revision)
  
    __obj.asInstanceOf[BrokerConfiguration]
  }
}

