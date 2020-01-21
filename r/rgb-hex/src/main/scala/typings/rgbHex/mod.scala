package typings.rgbHex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rgb-hex", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(red: Double, green: Double, blue: Double): String = js.native
  def apply(red: Double, green: Double, blue: Double, alpha: String): String = js.native
  def apply(red: Double, green: Double, blue: Double, alpha: Double): String = js.native
  def apply(rgba: String): String = js.native
}

