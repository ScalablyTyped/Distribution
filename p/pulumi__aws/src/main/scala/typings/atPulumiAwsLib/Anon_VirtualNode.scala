package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VirtualNode extends js.Object {
  var virtualNode: java.lang.String
  var weight: scala.Double
}

object Anon_VirtualNode {
  @scala.inline
  def apply(virtualNode: java.lang.String, weight: scala.Double): Anon_VirtualNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("virtualNode")(virtualNode)
    __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[Anon_VirtualNode]
  }
}

