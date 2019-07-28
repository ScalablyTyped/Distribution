package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Serializer extends js.Object {
  var serializer: Anon_OrcSerDe
}

object Anon_Serializer {
  @scala.inline
  def apply(serializer: Anon_OrcSerDe): Anon_Serializer = {
    val __obj = js.Dynamic.literal(serializer = serializer)
  
    __obj.asInstanceOf[Anon_Serializer]
  }
}

