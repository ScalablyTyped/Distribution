package typings
package roundDashToLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("round-to", JSImport.Namespace)
@js.native
object roundDashToMod extends js.Object {
  /**
  	Round the decimals with [`Math.round`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/round).
  	Numbers are rounded to a specific number of fractional digits. Specifying a negative `precision` will round to any number of places to the left of the decimal.
  	@param number - Number to adjust.
  	@param precision - (Integer) Number of decimal places.
  	@example
  	```
  	import roundTo = require('round-to');
  	roundTo(1.234, 2);
  	//=> 1.23
  	roundTo(1234.56, -2);
  	//=> 1200
  	```
  	*/
  def apply(number: scala.Double, precision: scala.Double): scala.Double = js.native
  /**
  	Round down the decimals with [`Math.floor`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/floor).
  	@param number - Number to adjust.
  	@param precision - (Integer) number of decimal places.
  	@example
  	```
  	import roundTo = require('round-to');
  	roundTo.down(1.234, 2);
  	//=> 1.23
  	```
  	*/
  def down(number: scala.Double, precision: scala.Double): scala.Double = js.native
  /**
  	Round up the decimals with [`Math.ceil`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/ceil).
  	@param number - Number to adjust.
  	@param precision - (Integer) number of decimal places.
  	@example
  	```
  	import roundTo = require('round-to');
  	roundTo.up(1.234, 2);
  	//=> 1.24
  	```
  	*/
  def up(number: scala.Double, precision: scala.Double): scala.Double = js.native
}

