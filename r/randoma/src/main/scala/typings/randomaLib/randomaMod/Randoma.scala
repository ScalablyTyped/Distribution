package typings
package randomaLib.randomaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Randoma extends js.Object {
  def arrayItem[T](array: js.Array[T]): T = js.native
  def boolean(): scala.Boolean = js.native
  def color(): colorLib.colorMod.Color = js.native
  def color(saturation: scala.Double): colorLib.colorMod.Color = js.native
  def date(): stdLib.Date = js.native
  def dateInRange(startDate: stdLib.Date, endDate: stdLib.Date): stdLib.Date = js.native
  def float(): scala.Double = js.native
  def floatInRange(min: scala.Double, max: scala.Double): scala.Double = js.native
  def integer(): scala.Double = js.native
  def integerInRange(min: scala.Double, max: scala.Double): scala.Double = js.native
}

