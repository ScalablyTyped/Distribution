package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArnId extends js.Object {
  var arn: java.lang.String
  var id: java.lang.String
  var name: java.lang.String
  var policyTypes: js.Array[Anon_Status]
}

object Anon_ArnId {
  @scala.inline
  def apply(
    arn: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    policyTypes: js.Array[Anon_Status]
  ): Anon_ArnId = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, policyTypes = policyTypes)
  
    __obj.asInstanceOf[Anon_ArnId]
  }
}

