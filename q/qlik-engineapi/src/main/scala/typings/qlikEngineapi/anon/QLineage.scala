package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QLineage extends js.Object {
  var qLineage: js.Array[QDiscriminator]
}

object QLineage {
  @scala.inline
  def apply(qLineage: js.Array[QDiscriminator]): QLineage = {
    val __obj = js.Dynamic.literal(qLineage = qLineage.asInstanceOf[js.Any])
    __obj.asInstanceOf[QLineage]
  }
}

