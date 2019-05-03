package typings
package proj4Lib.proj4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  def forward(coordinates: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def forward(coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  def inverse(coordinates: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def inverse(coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
}

