package typings.atPulumiAws.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiFilter extends js.Object {
  /**
    * The name of the AMI that was provided during image creation.
    */
  var name: String
  var values: js.Array[String]
}

object GetAmiFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetAmiFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetAmiFilter]
  }
}

