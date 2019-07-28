package typings.proj4.proj4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  def forward(coordinates: js.Array[Double]): js.Array[Double] = js.native
  def forward(coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  def inverse(coordinates: js.Array[Double]): js.Array[Double] = js.native
  def inverse(coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
}

