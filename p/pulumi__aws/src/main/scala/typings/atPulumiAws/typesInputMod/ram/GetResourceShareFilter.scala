package typings.atPulumiAws.typesInputMod.ram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceShareFilter extends js.Object {
  /**
    * The name of the tag key to filter on.
    */
  var name: String
  /**
    * The value of the tag key.
    */
  var values: js.Array[String]
}

object GetResourceShareFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetResourceShareFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetResourceShareFilter]
  }
}

