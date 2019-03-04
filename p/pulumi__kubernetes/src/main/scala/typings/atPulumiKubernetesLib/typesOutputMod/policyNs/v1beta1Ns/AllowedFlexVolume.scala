package typings
package atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllowedFlexVolume represents a single Flexvolume that is allowed to be used.
  */
trait AllowedFlexVolume extends js.Object {
  /**
    * driver is the name of the Flexvolume driver.
    */
  val driver: java.lang.String
}

object AllowedFlexVolume {
  @scala.inline
  def apply(driver: java.lang.String): AllowedFlexVolume = {
    val __obj = js.Dynamic.literal(driver = driver)
  
    __obj.asInstanceOf[AllowedFlexVolume]
  }
}

