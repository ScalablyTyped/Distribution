package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnection extends js.Object {
  var bindings: AnonBindingKey
  var connection: AnonHostname
  var connectionStrategy: String
  var exchanges: AnonType
  var namespace: Boolean
  var publicationChannelPools: AnonConfirmPool
  var queues: AnonPurge
}

object AnonConnection {
  @scala.inline
  def apply(
    bindings: AnonBindingKey,
    connection: AnonHostname,
    connectionStrategy: String,
    exchanges: AnonType,
    namespace: Boolean,
    publicationChannelPools: AnonConfirmPool,
    queues: AnonPurge
  ): AnonConnection = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], connectionStrategy = connectionStrategy.asInstanceOf[js.Any], exchanges = exchanges.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], publicationChannelPools = publicationChannelPools.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnection]
  }
}

