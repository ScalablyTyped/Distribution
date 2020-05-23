package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QDiscriminator extends js.Object {
  var qDiscriminator: String
}

object QDiscriminator {
  @scala.inline
  def apply(qDiscriminator: String): QDiscriminator = {
    val __obj = js.Dynamic.literal(qDiscriminator = qDiscriminator.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDiscriminator]
  }
}

