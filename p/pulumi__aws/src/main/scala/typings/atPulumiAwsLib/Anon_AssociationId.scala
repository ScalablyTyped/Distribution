package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssociationId extends js.Object {
  var associationId: java.lang.String
  var cidrBlock: java.lang.String
  var state: java.lang.String
}

object Anon_AssociationId {
  @scala.inline
  def apply(associationId: java.lang.String, cidrBlock: java.lang.String, state: java.lang.String): Anon_AssociationId = {
    val __obj = js.Dynamic.literal(associationId = associationId, cidrBlock = cidrBlock, state = state)
  
    __obj.asInstanceOf[Anon_AssociationId]
  }
}

