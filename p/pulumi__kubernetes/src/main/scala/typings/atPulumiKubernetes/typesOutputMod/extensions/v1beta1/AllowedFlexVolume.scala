package typings.atPulumiKubernetes.typesOutputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllowedFlexVolume represents a single Flexvolume that is allowed to be used. Deprecated: use
  * AllowedFlexVolume from policy API Group instead.
  */
trait AllowedFlexVolume extends js.Object {
  /**
    * driver is the name of the Flexvolume driver.
    */
  val driver: String
}

object AllowedFlexVolume {
  @scala.inline
  def apply(driver: String): AllowedFlexVolume = {
    val __obj = js.Dynamic.literal(driver = driver)
  
    __obj.asInstanceOf[AllowedFlexVolume]
  }
}

