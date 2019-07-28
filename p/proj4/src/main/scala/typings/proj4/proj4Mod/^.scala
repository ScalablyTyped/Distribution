package typings.proj4.proj4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proj4", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val WGS84: js.Any = js.native
  val defaultDatum: String = js.native
  val version: String = js.native
  def apply(fromProjection: String): Converter = js.native
  def apply(fromProjection: String, toProjection: String): Converter = js.native
  def apply(fromProjection: String, toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = js.native
  def apply(fromProjection: String, toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  def apply(toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = js.native
  def apply(toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  def Point(coordinates: String): InterfaceCoordinates = js.native
  def Point(coordinates: TemplateCoordinates): InterfaceCoordinates = js.native
  /**
    * @deprecated v3
    */
  def Point(x: Double, y: Double): InterfaceCoordinates = js.native
  def Point(x: Double, y: Double, z: Double): InterfaceCoordinates = js.native
  def Proj(srsCode: js.Any): InterfaceProjection = js.native
  def Proj(srsCode: js.Any, callback: js.Any): InterfaceProjection = js.native
  def defs(name: String): ProjectionDefinition = js.native
  def defs(name: String, projection: String): Unit = js.native
  def defs(name: String, projection: ProjectionDefinition): Unit = js.native
  def defs(name: js.Array[js.Array[String]]): js.Array[js.UndefOr[scala.Nothing]] = js.native
  def mgrs(coordinates: js.Array[Double], accuracy: Double): String = js.native
  def toPoint(array: js.Array[Double]): InterfaceCoordinates = js.native
  def transform(source: InterfaceProjection, dest: InterfaceProjection, point: TemplateCoordinates): js.Any = js.native
}

