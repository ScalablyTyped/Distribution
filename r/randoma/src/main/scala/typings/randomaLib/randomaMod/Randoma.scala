package typings
package randomaLib.randomaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Randoma extends js.Object {
  def arrayItem[T](array: js.Array[T]): T = js.native
  def boolean(): scala.Boolean = js.native
  /**
  	@param saturation - Saturation percentage in the range `0...1`. Default: `0.5`.
  	@returns A random [aesthetically pleasing color](https://martin.ankerl.com/2009/12/09/how-to-create-random-colors-programmatically/) as a [`color`](https://github.com/Qix-/color) object.
  	@example
  	```
  	random.color(0.5).hex().toString()
  	//=> '#AAF2B0'
  	```
  	*/
  def color(): Color = js.native
  def color(saturation: scala.Double): Color = js.native
  def date(): stdLib.Date = js.native
  def dateInRange(startDate: stdLib.Date, endDate: stdLib.Date): stdLib.Date = js.native
  def float(): scala.Double = js.native
  def floatInRange(min: scala.Double, max: scala.Double): scala.Double = js.native
  def integer(): scala.Double = js.native
  def integerInRange(min: scala.Double, max: scala.Double): scala.Double = js.native
}

