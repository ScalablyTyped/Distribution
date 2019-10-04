package typings.atPulumiAws.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetElasticIpFilter extends js.Object {
  var name: String
  var values: js.Array[String]
}

object GetElasticIpFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetElasticIpFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetElasticIpFilter]
  }
}

