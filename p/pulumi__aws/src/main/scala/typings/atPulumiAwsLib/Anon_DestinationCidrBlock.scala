package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationCidrBlock extends js.Object {
  var destinationCidrBlock: java.lang.String
  var source: java.lang.String
  var state: java.lang.String
}

object Anon_DestinationCidrBlock {
  @scala.inline
  def apply(destinationCidrBlock: java.lang.String, source: java.lang.String, state: java.lang.String): Anon_DestinationCidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destinationCidrBlock")(destinationCidrBlock)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_DestinationCidrBlock]
  }
}

