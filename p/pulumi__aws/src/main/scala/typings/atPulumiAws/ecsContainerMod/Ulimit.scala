package typings.atPulumiAws.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ulimit extends js.Object {
  var hardLimit: Double = js.native
  var name: UlimitName = js.native
  var softLimit: Double = js.native
}

object Ulimit {
  @scala.inline
  def apply(hardLimit: Double, name: UlimitName, softLimit: Double): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], softLimit = softLimit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ulimit]
  }
}

