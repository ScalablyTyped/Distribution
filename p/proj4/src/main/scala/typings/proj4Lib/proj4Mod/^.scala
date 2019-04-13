package typings
package proj4Lib.proj4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proj4", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val WGS84: js.Any = js.native
  val defaultDatum: java.lang.String = js.native
  val version: java.lang.String = js.native
  def apply(fromProjection: java.lang.String): Converter = js.native
  def apply(fromProjection: java.lang.String, toProjection: java.lang.String): Converter = js.native
  def apply[T /* <: TemplateCoordinates */](fromProjection: java.lang.String, toProjection: java.lang.String, coordinates: T): T = js.native
  def apply[T /* <: TemplateCoordinates */](toProjection: java.lang.String, coordinates: T): T = js.native
  def Point(coordinates: java.lang.String): InterfaceCoordinates = js.native
  def Point(coordinates: TemplateCoordinates): InterfaceCoordinates = js.native
  /**
    * @deprecated v3
    */
  def Point(x: scala.Double, y: scala.Double): InterfaceCoordinates = js.native
  def Point(x: scala.Double, y: scala.Double, z: scala.Double): InterfaceCoordinates = js.native
  def Proj(srsCode: js.Any): InterfaceProjection = js.native
  def Proj(srsCode: js.Any, callback: js.Any): InterfaceProjection = js.native
  def defs(name: java.lang.String): ProjectionDefinition = js.native
  def defs(name: java.lang.String, projection: java.lang.String): scala.Unit = js.native
  def defs(name: java.lang.String, projection: ProjectionDefinition): scala.Unit = js.native
  def defs(name: js.Array[js.Array[java.lang.String]]): js.Array[js.UndefOr[scala.Nothing]] = js.native
  def mgrs(coordinates: js.Array[scala.Double], accuracy: scala.Double): java.lang.String = js.native
  def toPoint(array: js.Array[scala.Double]): InterfaceCoordinates = js.native
  def transform(source: InterfaceProjection, dest: InterfaceProjection, point: TemplateCoordinates): js.Any = js.native
}

