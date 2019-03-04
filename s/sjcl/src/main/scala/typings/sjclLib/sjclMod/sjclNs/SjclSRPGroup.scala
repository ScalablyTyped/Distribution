package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclSRPGroup extends js.Object {
  var N: BigNumber
  var g: BigNumber
}

object SjclSRPGroup {
  @scala.inline
  def apply(N: BigNumber, g: BigNumber): SjclSRPGroup = {
    val __obj = js.Dynamic.literal(N = N, g = g)
  
    __obj.asInstanceOf[SjclSRPGroup]
  }
}

