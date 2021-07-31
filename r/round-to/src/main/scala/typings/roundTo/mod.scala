package typings.roundTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Round the decimals with [`Math.round`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/round).
  	Numbers are rounded to a specific number of fractional digits. Specifying a negative `precision` will round to any number of places to the left of the decimal.
  	@param number - Number to adjust.
  	@param precision - (Integer or Infinity) Number of decimal places.
  	@example
  	```
  	import roundTo = require('round-to');
  	roundTo(1.234, 2);
  	//=> 1.23
  	roundTo(1234.56, -2);
  	//=> 1200
  	```
  	*/
  @scala.inline
  def apply(number: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("round-to", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Round down the decimals with [`Math.floor`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/floor).
  	@param number - Number to adjust.
  	@param precision - (Integer or Infinity) number of decimal places.
  	@example
  	```
  	import roundTo = require('round-to');
  	roundTo.down(1.234, 2);
  	//=> 1.23
  	```
  	*/
  @scala.inline
  def down(number: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("down")(number.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
  	Round up the decimals with [`Math.ceil`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/ceil).
  	@param number - Number to adjust.
  	@param precision - (Integer or Infinity) number of decimal places.
  	@example
  	```
  	import roundTo = require('round-to');
  	roundTo.up(1.234, 2);
  	//=> 1.24
  	```
  	*/
  @scala.inline
  def up(number: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("up")(number.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
}
