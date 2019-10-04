package typings.atPulumiAws.typesInputMod.ebsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVolumeFilter extends js.Object {
  var name: String
  var values: js.Array[String]
}

object GetVolumeFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetVolumeFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetVolumeFilter]
  }
}

