package typings.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCServer extends js.Object {
  var codec: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodecEngine */ js.Any
}

object SCServer {
  @scala.inline
  def apply(
    codec: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodecEngine */ js.Any
  ): SCServer = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SCServer]
  }
}

