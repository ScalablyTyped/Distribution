package typings.proj4.proj4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proj4", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(fromProjection: String): Converter = js.native
  def apply(fromProjection: String, toProjection: String): Converter = js.native
  def apply(fromProjection: String, toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = js.native
  def apply(fromProjection: String, toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  def apply(toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = js.native
  def apply(toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
}

