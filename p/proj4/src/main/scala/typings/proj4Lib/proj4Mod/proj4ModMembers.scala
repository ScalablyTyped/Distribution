package typings
package proj4Lib.proj4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proj4", JSImport.Namespace)
@js.native
object proj4ModMembers extends js.Object {
  val WGS84: js.Any = js.native
  val defaultDatum: java.lang.String = js.native
  val version: java.lang.String = js.native
  def apply(fromProjection: java.lang.String): proj4Lib.proj4Mod.proj4Ns.Static = js.native
  def apply(fromProjection: java.lang.String, coordinates: proj4Lib.proj4Mod.proj4Ns.TemplateCoordinates): js.Array[scala.Double] = js.native
  def apply(fromProjection: java.lang.String, toProjection: java.lang.String): proj4Lib.proj4Mod.proj4Ns.Static = js.native
  def apply(
    fromProjection: java.lang.String,
    toProjection: java.lang.String,
    coordinates: proj4Lib.proj4Mod.proj4Ns.TemplateCoordinates
  ): proj4Lib.proj4Mod.proj4Ns.Static = js.native
  def Point(coordinates: java.lang.String): proj4Lib.proj4Mod.proj4Ns.InterfaceCoordinates = js.native
  def Point(coordinates: proj4Lib.proj4Mod.proj4Ns.TemplateCoordinates): proj4Lib.proj4Mod.proj4Ns.InterfaceCoordinates = js.native
  /**
       * Depecrated v3
       */
  def Point(x: scala.Double, y: scala.Double): proj4Lib.proj4Mod.proj4Ns.InterfaceCoordinates = js.native
  /**
       * Depecrated v3
       */
  def Point(x: scala.Double, y: scala.Double, z: scala.Double): proj4Lib.proj4Mod.proj4Ns.InterfaceCoordinates = js.native
  def Proj(srsCode: js.Any): proj4Lib.proj4Mod.proj4Ns.InterfaceProjection = js.native
  def Proj(srsCode: js.Any, callback: js.Any): proj4Lib.proj4Mod.proj4Ns.InterfaceProjection = js.native
  def defs(name: java.lang.String): js.Any = js.native
  def defs(name: java.lang.String, projection: java.lang.String): js.Any = js.native
  def defs(name: js.Array[js.Array[java.lang.String]]): js.Any = js.native
  def mgrs(coordinates: js.Array[scala.Double], accuracy: scala.Double): java.lang.String = js.native
  def toPoint(array: js.Array[scala.Double]): proj4Lib.proj4Mod.proj4Ns.InterfaceCoordinates = js.native
  def transform(
    source: proj4Lib.proj4Mod.proj4Ns.InterfaceProjection,
    dest: proj4Lib.proj4Mod.proj4Ns.InterfaceProjection,
    point: proj4Lib.proj4Mod.proj4Ns.TemplateCoordinates
  ): js.Any = js.native
}

