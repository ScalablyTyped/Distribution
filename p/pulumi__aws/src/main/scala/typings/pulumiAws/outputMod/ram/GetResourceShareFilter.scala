package typings.pulumiAws.outputMod.ram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceShareFilter extends js.Object {
  /**
    * The name of the tag key to filter on.
    */
  var name: String = js.native
  /**
    * The value of the tag key.
    */
  var values: js.Array[String] = js.native
}

object GetResourceShareFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetResourceShareFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetResourceShareFilter]
  }
}

