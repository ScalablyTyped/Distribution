package typings.atPulumiAws.typesOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiIdsFilter extends js.Object {
  var name: String
  var values: js.Array[String]
}

object GetAmiIdsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetAmiIdsFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetAmiIdsFilter]
  }
}

