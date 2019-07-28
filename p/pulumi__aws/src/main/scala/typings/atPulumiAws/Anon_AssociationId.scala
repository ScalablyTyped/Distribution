package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssociationId extends js.Object {
  var associationId: String
  var cidrBlock: String
  var state: String
}

object Anon_AssociationId {
  @scala.inline
  def apply(associationId: String, cidrBlock: String, state: String): Anon_AssociationId = {
    val __obj = js.Dynamic.literal(associationId = associationId, cidrBlock = cidrBlock, state = state)
  
    __obj.asInstanceOf[Anon_AssociationId]
  }
}

