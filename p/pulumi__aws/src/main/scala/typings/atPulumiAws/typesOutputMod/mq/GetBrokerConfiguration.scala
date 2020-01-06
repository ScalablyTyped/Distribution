package typings.atPulumiAws.typesOutputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBrokerConfiguration extends js.Object {
  var id: String = js.native
  var revision: Double = js.native
}

object GetBrokerConfiguration {
  @scala.inline
  def apply(id: String, revision: Double): GetBrokerConfiguration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBrokerConfiguration]
  }
}

