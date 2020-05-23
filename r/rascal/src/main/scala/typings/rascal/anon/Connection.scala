package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var bindings: BindingKey
  var connection: Hostname
  var connectionStrategy: String
  var exchanges: Type
  var namespace: Boolean
  var publicationChannelPools: ConfirmPool
  var queues: Purge
}

object Connection {
  @scala.inline
  def apply(
    bindings: BindingKey,
    connection: Hostname,
    connectionStrategy: String,
    exchanges: Type,
    namespace: Boolean,
    publicationChannelPools: ConfirmPool,
    queues: Purge
  ): Connection = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], connectionStrategy = connectionStrategy.asInstanceOf[js.Any], exchanges = exchanges.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], publicationChannelPools = publicationChannelPools.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

