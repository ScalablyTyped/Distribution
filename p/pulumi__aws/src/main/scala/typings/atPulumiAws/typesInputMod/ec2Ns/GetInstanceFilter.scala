package typings.atPulumiAws.typesInputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceFilter extends js.Object {
  var name: String
  var values: js.Array[String]
}

object GetInstanceFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetInstanceFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetInstanceFilter]
  }
}

