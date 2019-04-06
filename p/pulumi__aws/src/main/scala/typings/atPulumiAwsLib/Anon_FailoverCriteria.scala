package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailoverCriteria extends js.Object {
  var failoverCriteria: Anon_StatusCodes
  var members: js.Array[Anon_OriginId]
  var originId: java.lang.String
}

object Anon_FailoverCriteria {
  @scala.inline
  def apply(failoverCriteria: Anon_StatusCodes, members: js.Array[Anon_OriginId], originId: java.lang.String): Anon_FailoverCriteria = {
    val __obj = js.Dynamic.literal(failoverCriteria = failoverCriteria, members = members, originId = originId)
  
    __obj.asInstanceOf[Anon_FailoverCriteria]
  }
}

