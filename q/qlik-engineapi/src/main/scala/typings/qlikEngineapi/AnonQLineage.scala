package typings.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQLineage extends js.Object {
  var qLineage: js.Array[AnonQDiscriminator]
}

object AnonQLineage {
  @scala.inline
  def apply(qLineage: js.Array[AnonQDiscriminator]): AnonQLineage = {
    val __obj = js.Dynamic.literal(qLineage = qLineage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQLineage]
  }
}

