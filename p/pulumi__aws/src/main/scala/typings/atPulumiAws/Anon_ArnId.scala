package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArnId extends js.Object {
  var arn: String
  var id: String
  var name: String
  var policyTypes: js.Array[Anon_Status]
}

object Anon_ArnId {
  @scala.inline
  def apply(arn: String, id: String, name: String, policyTypes: js.Array[Anon_Status]): Anon_ArnId = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, policyTypes = policyTypes)
  
    __obj.asInstanceOf[Anon_ArnId]
  }
}

