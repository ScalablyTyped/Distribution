package typings.pulumiAws.outputMod.ebs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVolumeFilter extends js.Object {
  var name: String = js.native
  var values: js.Array[String] = js.native
}

object GetVolumeFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetVolumeFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVolumeFilter]
  }
}

