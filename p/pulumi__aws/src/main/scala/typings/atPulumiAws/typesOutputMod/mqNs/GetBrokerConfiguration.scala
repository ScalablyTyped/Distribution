package typings.atPulumiAws.typesOutputMod.mqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerConfiguration extends js.Object {
  var id: String
  var revision: Double
}

object GetBrokerConfiguration {
  @scala.inline
  def apply(id: String, revision: Double): GetBrokerConfiguration = {
    val __obj = js.Dynamic.literal(id = id, revision = revision)
  
    __obj.asInstanceOf[GetBrokerConfiguration]
  }
}

