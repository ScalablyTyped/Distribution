package typings.pulumiAws.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAmiFilter extends js.Object {
  /**
    * The name of the AMI that was provided during image creation.
    */
  var name: String = js.native
  var values: js.Array[String] = js.native
}

object GetAmiFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetAmiFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiFilter]
  }
}

