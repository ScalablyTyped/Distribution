package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationCidrBlock extends js.Object {
  var destinationCidrBlock: String
  var source: String
  var state: String
}

object Anon_DestinationCidrBlock {
  @scala.inline
  def apply(destinationCidrBlock: String, source: String, state: String): Anon_DestinationCidrBlock = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock, source = source, state = state)
  
    __obj.asInstanceOf[Anon_DestinationCidrBlock]
  }
}

