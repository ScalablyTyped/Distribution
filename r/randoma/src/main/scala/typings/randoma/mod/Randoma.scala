package typings.randoma.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Randoma extends js.Object {
  def arrayItem[T](array: js.Array[T]): T = js.native
  def boolean(): Boolean = js.native
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
  def color(saturation: Double): Color = js.native
  def date(): Date = js.native
  def dateInRange(startDate: Date, endDate: Date): Date = js.native
  def float(): Double = js.native
  def floatInRange(min: Double, max: Double): Double = js.native
  def integer(): Double = js.native
  def integerInRange(min: Double, max: Double): Double = js.native
}

