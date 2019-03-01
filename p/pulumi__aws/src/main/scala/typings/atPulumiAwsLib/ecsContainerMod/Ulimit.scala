package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ulimit extends js.Object {
  var hardLimit: scala.Double
  var name: UlimitName
  var softLimit: scala.Double
}

object Ulimit {
  @scala.inline
  def apply(hardLimit: scala.Double, name: UlimitName, softLimit: scala.Double): Ulimit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hardLimit")(hardLimit)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("softLimit")(softLimit)
    __obj.asInstanceOf[Ulimit]
  }
}

