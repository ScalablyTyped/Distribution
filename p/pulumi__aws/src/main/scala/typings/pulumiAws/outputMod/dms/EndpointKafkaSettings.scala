package typings.pulumiAws.outputMod.dms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointKafkaSettings extends js.Object {
  /**
    * Kafka broker location. Specify in the form broker-hostname-or-ip:port.
    */
  var broker: String = js.native
  /**
    * Kafka topic for migration. Defaults to `kafka-default-topic`.
    */
  var topic: js.UndefOr[String] = js.native
}

object EndpointKafkaSettings {
  @scala.inline
  def apply(broker: String): EndpointKafkaSettings = {
    val __obj = js.Dynamic.literal(broker = broker.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointKafkaSettings]
  }
  @scala.inline
  implicit class EndpointKafkaSettingsOps[Self <: EndpointKafkaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBroker(value: String): Self = this.set("broker", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
  
}

