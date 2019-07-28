package typings.atPulumiAws.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ulimit extends js.Object {
  var hardLimit: Double
  var name: UlimitName
  var softLimit: Double
}

object Ulimit {
  @scala.inline
  def apply(hardLimit: Double, name: UlimitName, softLimit: Double): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit, name = name, softLimit = softLimit)
  
    __obj.asInstanceOf[Ulimit]
  }
}

