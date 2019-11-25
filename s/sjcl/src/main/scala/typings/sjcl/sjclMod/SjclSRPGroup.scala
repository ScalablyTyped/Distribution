package typings.sjcl.sjclMod

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
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SjclSRPGroup]
  }
}

