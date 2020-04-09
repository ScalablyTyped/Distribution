package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelStaticGetColor extends js.Object {
  /**
    * On each call returns next colour in the spectrum. To reset it back to red call
    * {@link RaphaelStaticGetColor.reset|Raphael.getColor.reset}.
    * @param Brightness, default is `0.75`.
    * @return Hex representation of the color.
    */
  def apply(): String = js.native
  def apply(brightness: Double): String = js.native
  /**
    * Resets spectrum position for {@link RaphaelStaticGetColor|Raphael.getColor} back to red.
    */
  def reset(): Unit = js.native
}

